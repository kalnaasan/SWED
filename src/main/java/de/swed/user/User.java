package de.swed.user;

import java.util.Date;

public abstract class User extends Person {
    private String userName;
    private String password;
    private Role role;
    private Date creationAccount;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Date getCreationAccount() {
        return creationAccount;
    }

    public void setCreationAccount(Date creationAccount) {
        this.creationAccount = creationAccount;
    }
}
