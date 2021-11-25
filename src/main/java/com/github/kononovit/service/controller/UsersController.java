package com.github.kononovit.service.controller;

import com.github.kononovit.service.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @GetMapping("/")
    public String getUsers() {
        return "All Users!!!";
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable String id) {
        return id;
    }

    @GetMapping("/age")
    private String getUsersByAge(@RequestParam String from, @RequestParam String to) {
        return "From:" + from + " To:" + to;
    }

    @PostMapping("/")
    public String addUser(@RequestBody User user) {
        return user.toString();
    }
}
