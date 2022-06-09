package com.portfolio.server.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class Skill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int percentage;
    private String category;

    public Skill(String name, int percentage, String category) {
        this.name = name;
        this.percentage = percentage;
        this.category = category;
    }

    public Skill(Long id, String name, int percentage, String category) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
        this.category = category;
    }

    public Skill() {}
}
