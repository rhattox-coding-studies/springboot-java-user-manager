package com.rhattoxcodingstudies.usermanager.controllers;


import com.rhattoxcodingstudies.usermanager.models.UserModel;
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

    @PostMapping
    public ResponseEntity<UserModel> registerUser(@RequestBody UserModel userModel) {

        System.out.println(userModel.getEmail());
        System.out.println(userModel.getPassword());
        System.out.println(userModel.getBirthday());
        System.out.println(userModel.getAge());


        return ResponseEntity.status(200).build();
    }
}
