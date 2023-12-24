package net.softwaredevelopment.bo;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.softwaredevelopment.articles.base.BaseBO;

@Entity
@Table(name = "Account", schema = "k39752uz_iam")
@NamedQuery(name = "Account.findAllAccounts", query = "SELECT a FROM Account a")
@NamedQuery(name = "Account.findByUserLoginName", query = "SELECT a FROM Account a WHERE a.user.loginName = :LOGIN_NAME")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@ToString(callSuper = true)
public class Account extends BaseBO {

    @Column(name = "name")
    private String accountName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Account() {
        // Noncompliant - constructor is empty.
        // Default constructor is recommended for some frameworks
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
