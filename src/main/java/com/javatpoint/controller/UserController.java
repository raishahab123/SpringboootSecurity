package com.javatpoint.controller;

import com.javatpoint.model.User;
import com.javatpoint.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;


    //all users
    @GetMapping("/")
    public List<User> getAllUsers(){

        return this.userService.getAllUsers();

    }

    //single user
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String usename){

        return this.userService.getUser(usename);
    }

    //add user
    @PostMapping("/")
    public User add(@RequestBody User user){
        return this.userService.addUser(user);

    }
}
