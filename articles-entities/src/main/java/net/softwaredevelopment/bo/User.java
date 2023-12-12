package net.softwaredevelopment.bo;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "User", schema = "k39752uz_articlesdb")
@NamedQuery(name = "User.findAllUsers", query = "SELECT u FROM User u")
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

    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Account> getAccountSet() {
        return accountSet;
    }

    public void setAccountSet(Set<Account> accountSet) {
        this.accountSet = accountSet;
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
