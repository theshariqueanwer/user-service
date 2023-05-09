package com.pack.user.api.controller;


import com.pack.user.api.entity.User;
import com.pack.user.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/postUser")
    public User postUser(@RequestBody User user) {
        return userService.postUser(user);
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @DeleteMapping("/deleteUser/{id}")
    public User deleteUser(@PathVariable("id") Integer id ) {
        return userService.deleteUser(id);
    }

}
