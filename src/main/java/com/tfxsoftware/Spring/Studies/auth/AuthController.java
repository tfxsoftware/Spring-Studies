package com.tfxsoftware.Spring.Studies.auth;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tfxsoftware.Spring.Studies.user.User;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/singup")
    public String singup(@RequestBody User user) {
        return "Hello World";
    }
}
