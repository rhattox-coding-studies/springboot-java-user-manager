package com.rhattoxcodingstudies.usermanager.controllers;


import com.rhattoxcodingstudies.usermanager.models.UserModel;
import com.rhattoxcodingstudies.usermanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;

@RestController()
@RequestMapping("/user")
public class UserAddController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserModel> registerUser(@RequestBody UserModel userModel) {
        userService.saveUser(userModel);

        return ResponseEntity.status(200).build();
    }
}
