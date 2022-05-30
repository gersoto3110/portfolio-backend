package com.portfolio.server.service;

import com.portfolio.server.model.User;
import com.portfolio.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepo;

    @Override
    public User add(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public User findByEmail(String email) {
        return userRepo.findFirstByEmail(email).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        userRepo.deleteById(id);
    }
}
