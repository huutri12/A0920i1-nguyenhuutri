package com.codegym.demo.model;

import javax.persistence.*;

@Entity
public class User_role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleId;

    private String username;

    @ManyToOne
    @JoinColumn(name = "username", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "roleId", insertable = false,updatable = false)
    private Role role;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User_role(Role role, User user) {
    }

    public User_role(int roleId, String username) {
        this.roleId = roleId;
        this.username = username;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
