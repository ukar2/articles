package net.softwaredevelopment.bo;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.softwaredevelopment.articles.base.BaseBO;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "User", schema = "k39752uz_iam")
@NamedQuery(name = "User.findAllUsers", query = "SELECT u FROM User u")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@ToString(callSuper = true)
public class User extends BaseBO {

    private Boolean blocked = false;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "login_name", unique = true, nullable = false)
    private String loginName;
    private String forename;
    private String surname;

    @Column(name = "password", nullable = false)
    private String password;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<Account> accountSet;

    public User() {
        // Noncompliant - constructor is empty.
        // Default constructor is recommended for some frameworks
    }

    public boolean addAccount(Account account) {
        if (accountSet == null) {
            this.accountSet = new HashSet<>();
        }

        return this.accountSet.add(account);
    }

    public boolean removeAccount(Account account) {
        if (accountSet == null) {
            this.accountSet = new HashSet<>();
        }

        return accountSet.remove(account);
    }
}
