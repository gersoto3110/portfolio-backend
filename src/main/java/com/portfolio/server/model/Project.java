package com.portfolio.server.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Column;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    @Column(name="DESCRIPTION", length = 1000)
    private String description;
    private String techs;
    private String urlDemo;
    private String urlImg;

    public Project (String title, String description, String techs, String urlDemo, String urlImg) {
        this.title = title;
        this.description = description;
        this.techs = techs;
        this.urlDemo = urlDemo;
        this.urlImg = urlImg;
    }

    public Project() {}
}
