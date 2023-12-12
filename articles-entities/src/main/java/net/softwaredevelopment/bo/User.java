package net.softwaredevelopment.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User extends BaseBO {

    public User() {
        // Noncompliant - constructor is empty.
        // Default constructor is recommended for some frameworks
    }

}
