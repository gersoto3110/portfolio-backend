package com.portfolio.server.controller;

import com.portfolio.server.model.Education;
import com.portfolio.server.service.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/education")
public class EducationController {
    @Autowired
    private IEducationService educationService;

    @PostMapping("/add")
    public void add(@RequestBody Education education) {
        educationService.add(education);
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Education> findAll() {
        return educationService.findAll();
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public Education findById(@PathVariable("id") Long id) {
        return educationService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        educationService.deleteById(id);
    }
}
