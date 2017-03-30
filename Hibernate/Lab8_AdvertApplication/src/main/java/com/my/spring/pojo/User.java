package com.my.spring.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
@PrimaryKeyJoinColumn(name="personID")
public class User extends Person {

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @OneToOne(mappedBy="user" , cascade= CascadeType.ALL)//if user is deleted the email also deleted---cascade 
    private Email email;
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    
}