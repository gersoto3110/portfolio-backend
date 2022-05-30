package com.portfolio.server.service;

import com.portfolio.server.model.Profile;
import com.portfolio.server.model.Project;

import java.util.List;

public interface IProjectService {
    Project add(Project project);
    List<Project> findAll();
    Project findById(Long id);
    void deleteById(Long id);
}
