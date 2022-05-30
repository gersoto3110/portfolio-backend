package com.portfolio.server.service;

import com.portfolio.server.model.Education;

import java.util.List;

public interface IEducationService {
    Education add(Education education);
    List<Education> findAll();
    Education findById(Long id);
    void deleteById(Long id);
}
