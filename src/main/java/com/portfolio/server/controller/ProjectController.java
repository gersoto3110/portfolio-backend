package com.portfolio.server.controller;

import com.portfolio.server.model.Project;
import com.portfolio.server.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
    @Autowired
    private IProjectService projectService;

    @PostMapping("/add")
    public void add(@RequestBody Project project) {
        projectService.add(project);
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Project> findAll() {
        return projectService.findAll();
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public Project findById(@PathVariable("id") Long id) {
        return projectService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        projectService.deleteById(id);
    }
}