package com.example.exam2.controllers;

import com.example.exam2.entities.User;
import com.example.exam2.services.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class userController {
    private final IUserService iUserService;

    @PostMapping(value = { "adduser/","adduser"})
    public User addUser(@RequestBody User user){
        return iUserService.addUser(user);
    }

    public void assignProjectToUser (int projectId, int userId){

    }

}
