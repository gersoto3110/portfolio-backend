package com.portfolio.server.service;

import com.portfolio.server.model.Project;
import com.portfolio.server.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService implements IProjectService {
    @Autowired
    private ProjectRepository projectRepo;

    @Override
    public Project add(Project project) {
        return projectRepo.save(project);
    }

    @Override
    public List<Project> findAll() {
        return projectRepo.findAll();
    }

    @Override
    public Project findById(Long id) {
        return projectRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        projectRepo.deleteById(id);
    }
}
