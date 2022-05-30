package com.portfolio.server.service;

import com.portfolio.server.model.Experience;
import com.portfolio.server.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService implements IExperienceService {
    @Autowired
    private ExperienceRepository experienceRepo;

    @Override
    public Experience add(Experience experience) {
        return experienceRepo.save(experience);
    }

    @Override
    public List<Experience> findAll() {
        return experienceRepo.findAll();
    }

    @Override
    public Experience findById(Long id) {
        return experienceRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        experienceRepo.deleteById(id);
    }
}
