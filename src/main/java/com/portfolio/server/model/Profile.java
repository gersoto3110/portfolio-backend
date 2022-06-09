package com.portfolio.server.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class Profile implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String lastName;
    private String occupation;
    private String urlImgBanner;
    private String urlImgProfile;
    @Column(name="ABOUT", length = 1000)
    private String about;

    public Profile (String name, String lastName, String occupation, String urlImgBanner, String urlImgProfile, String about) {
        this.name = name;
        this.lastName = lastName;
        this.occupation = occupation;
        this.urlImgBanner = urlImgBanner;
        this.urlImgProfile = urlImgProfile;
        this.about = about;
    }

    public Profile (Long id, String name, String lastName, String occupation, String urlImgBanner, String urlImgProfile, String about) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.occupation = occupation;
        this.urlImgBanner = urlImgBanner;
        this.urlImgProfile = urlImgProfile;
        this.about = about;
    }

    public Profile() {}
}
