package com.portfolio.server.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Basic;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    @Basic
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public User() {}

    @Override
    public String toString() {
        return "User{ id= " + this.id + ", email= " + this.email + " }";
    }
}
