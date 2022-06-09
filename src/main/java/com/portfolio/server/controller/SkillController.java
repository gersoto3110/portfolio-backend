package com.portfolio.server.controller;

import com.portfolio.server.model.Skill;
import com.portfolio.server.service.ISkillService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins={"https://sv-web-portfolio.web.app", "http://localhost:4200"})
@RequestMapping("/api/skill")
public class SkillController {
    @Autowired
    private ISkillService skillService;

    @PostMapping("/add")
    public void add(@RequestBody Skill skill) {
        skillService.add(skill);
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Skill> findAll() {
        return skillService.findAll();
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public Skill findById(@PathVariable("id") Long id) {
        return skillService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        skillService.deleteById(id);
    }
}
