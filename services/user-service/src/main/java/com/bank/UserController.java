package com.bank;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public String getUser(@PathVariable String id) {
        return "User ID: " + id;
    }

    @PostMapping
    public String createUser() {
        return "User created!";
    }
}

