package com.example.webclient.controller;

import com.example.webclient.model.User;
import com.example.webclient.rest.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("")
    public User[] getUsers() {
    return userService.getUsers();
    }
}
