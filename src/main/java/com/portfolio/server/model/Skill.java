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
    private String percentage;
    private String urlIcon;

    public Skill(String name, String percentage, String urlIcon) {
        this.name = name;
        this.percentage = percentage;
        this.urlIcon = urlIcon;
    }
}
