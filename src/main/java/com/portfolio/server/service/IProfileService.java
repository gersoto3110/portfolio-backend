package com.portfolio.server.service;

import com.portfolio.server.model.Profile;

import java.util.List;

public interface IProfileService {
    Profile add(Profile profile);
    List<Profile> findAll();
    Profile findById(Long id);
    void deleteById(Long id);
}
