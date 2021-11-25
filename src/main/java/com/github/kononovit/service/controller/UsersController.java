package com.github.kononovit.service.controller;

import com.github.kononovit.service.model.UserInfo;
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

    @PostMapping("/add")
    public String addUser(@RequestBody UserInfo user) {
        return user.toString();
    }
}
