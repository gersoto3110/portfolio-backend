package com.portfolio.server.service;

import com.portfolio.server.model.User;

import java.util.List;

public interface IUserService {
    User add(User user);
    List<User> findAll();
    User findById(Long id);
    User findByEmail(String email);
    void deleteById(Long id);
}
