package com.portfolio.server.service;

import com.portfolio.server.model.Profile;
import com.portfolio.server.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService implements IProfileService {
    @Autowired
    private ProfileRepository profileRepo;

    @Override
    public Profile add(Profile profile) {
        return profileRepo.save(profile);
    }

    @Override
    public List<Profile> findAll() {
        return profileRepo.findAll();
    }

    @Override
    public Profile findById(Long id) {
        return profileRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        profileRepo.deleteById(id);
    }
}
