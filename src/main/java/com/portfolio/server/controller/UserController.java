package com.portfolio.server.controller;

import com.portfolio.server.model.User;
import com.portfolio.server.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("/add")
    public void add(@RequestBody User user) {
        userService.add(user);
    }

    @GetMapping("/all")
    @ResponseBody
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public User findById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @GetMapping("/find/{email}")
    @ResponseBody
    public User findByEmail(@PathVariable("email") String email) {
        return userService.findByEmail(email);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        userService.deleteById(id);
    }
}

