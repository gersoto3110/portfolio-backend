package com.portfolio.server.service;

import com.portfolio.server.model.Experience;

import java.util.List;

public interface IExperienceService {
    Experience add(Experience experience);
    List<Experience> findAll();
    Experience findById(Long id);
    void deleteById(Long id);
}
