package com.student.management.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;
    @Column(nullable=false)
    private String collegename;
    @Column(nullable=false)
    private String fullname;
    @Column(unique = true, nullable = false)
    private String userEmail;
    @Enumerated(EnumType.STRING)
    private Role role;


    public User() {}

    // Getters and Setters
    public void setUserName(String username){
        this.username=username;
    }
    public void setUserEmail(String userEmail){
        this.userEmail=userEmail;
    }
    public String getUserEmail(){
        return this.userEmail;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setRole(Role role){
        this.role=role;
    }
    public void setFullName(String fullname){
        this.fullname=fullname;
    }
    public String getFullname(){
        return this.fullname;
    }
    public void setCollegename(String collegename){
        this.collegename=collegename;
    }
    public String getCollegename(){
        return this.collegename;
    }
    public String getUserName(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public Role getRole(){
        return this.role;
    }
}
