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
public class Experience implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String rol;
    private String startDate;
    private String endDate;
    private String description;
    private String companyName;
    private String urlCompany;

    public Experience(String rol, String startDate, String endDate, String description, String companyName, String urlCompany) {
        this.rol = rol;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.companyName = companyName;
        this.urlCompany = urlCompany;
    }

    public Experience(Long id, String rol, String startDate, String endDate, String description, String companyName, String urlCompany) {
        this.id = id;
        this.rol = rol;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.companyName = companyName;
        this.urlCompany = urlCompany;
    }

    public Experience() {}
}
