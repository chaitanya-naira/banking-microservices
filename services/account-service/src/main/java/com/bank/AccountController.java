package com.bank;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")   // 👈 change here
public class AccountController {   // 👈 rename class

    @GetMapping("/{id}")
    public String getAccount(@PathVariable String id) {
        return "Account ID: " + id;   // 👈 change response
    }

    @PostMapping
    public String createAccount() {
        return "Account created!";
    }
}
