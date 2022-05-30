package com.portfolio.server.controller;

import com.portfolio.server.model.Profile;
import com.portfolio.server.service.IProfileService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {
    @Autowired
    private IProfileService profileService;

    @PostMapping("/add")
    public void add(@RequestBody Profile profile) {
        profileService.add(profile);
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Profile> findAll() {
        return profileService.findAll();
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public Profile findById(@PathVariable("id") Long id) {
        return profileService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        profileService.deleteById(id);
    }
}