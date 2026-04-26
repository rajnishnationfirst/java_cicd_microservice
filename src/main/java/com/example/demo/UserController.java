package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    List<String> users = new ArrayList<>();

    @PostMapping
    public String addUser(@RequestBody String user) {
        users.add(user);
        return "User Added: " + user;
    }

    @GetMapping
    public List<String> getUsers() {
        return users;
    }
}