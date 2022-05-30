package com.portfolio.server.service;

import com.portfolio.server.model.Education;
import com.portfolio.server.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService implements IEducationService {
    @Autowired
    private EducationRepository educationRepo;

    @Override
    public Education add(Education education) {
        return educationRepo.save(education);
    }

    @Override
    public List<Education> findAll() {
        return educationRepo.findAll();
    }

    @Override
    public Education findById(Long id) {
        return educationRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        educationRepo.deleteById(id);
    }
}
