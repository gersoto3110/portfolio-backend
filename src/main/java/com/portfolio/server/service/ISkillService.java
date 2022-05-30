package com.portfolio.server.service;

import com.portfolio.server.model.Skill;

import java.util.List;

public interface ISkillService {
    Skill add(Skill skill);
    List<Skill> findAll();
    Skill findById(Long id);
    void deleteById(Long id);
}
