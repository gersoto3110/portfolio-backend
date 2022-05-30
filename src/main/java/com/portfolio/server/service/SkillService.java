package com.portfolio.server.service;

import com.portfolio.server.model.Skill;
import com.portfolio.server.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService implements ISkillService {
    @Autowired
    private SkillRepository skillRepo;

    @Override
    public Skill add(Skill skill) {
        return skillRepo.save(skill);
    }

    @Override
    public List<Skill> findAll() {
        return skillRepo.findAll();
    }

    @Override
    public Skill findById(Long id) {
        return skillRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        skillRepo.deleteById(id);
    }
}
