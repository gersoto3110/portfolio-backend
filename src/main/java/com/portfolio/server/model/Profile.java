package com.portfolio.server.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class Profile implements Serializable {
    private String name;
    private String lastname;
    private String urlImgBanner;
    @Column(name="ABOUT", length = 1000)
    private String about;

    public Profile (String name, String lastname, String urlImgBanner, String about) {
        this.name = name;
        this.lastname = lastname;
        this.urlImgBanner = urlImgBanner;
        this.about = about;
    }
}
