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
public class Education implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String institution;
    private String startDate;
    private String endDate;
    @Column(name="DESCRIPTION", length = 1000)
    private String description;

    public Education(String title, String institution, String startDate, String endDate, String description) {
        this.title = title;
        this.institution = institution;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    public Education(Long id, String title, String institution, String startDate, String endDate, String description) {
        this.id = id;
        this.title = title;
        this.institution = institution;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    public Education(){}
}
