package com.rhattoxcodingstudies.usermanager.service;

import com.rhattoxcodingstudies.usermanager.models.UserModel;
import com.rhattoxcodingstudies.usermanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    public UserModel saveUser(UserModel userModel) {
        return userRepository.save(userModel);
    }

    public UserModel getUserById(UserModel userModel) {
        return userRepository.findById(userModel.getId()).orElse(null);
    }
}
