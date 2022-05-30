package com.portfolio.server.controller;

import com.portfolio.server.model.Experience;
import com.portfolio.server.service.IExperienceService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/experience")
public class ExperienceController {
    @Autowired
    private IExperienceService experienceService;

    @PostMapping("/add")
    public void add(@RequestBody Experience experience) {
        experienceService.add(experience);
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Experience> findAll() {
        return experienceService.findAll();
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public Experience findById(@PathVariable("id") Long id) {
        return experienceService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        experienceService.deleteById(id);
    }
}
