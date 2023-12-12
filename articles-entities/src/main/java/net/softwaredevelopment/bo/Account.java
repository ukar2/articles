package net.softwaredevelopment.bo;

import jakarta.persistence.*;

@Entity
@Table(name = "Account", schema = "k39752uz_articlesdb")
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
