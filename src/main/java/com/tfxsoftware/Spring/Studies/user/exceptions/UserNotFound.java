package com.tfxsoftware.Spring.Studies.user.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFound extends RuntimeException {
    public UserNotFound() {
        super("User not found");
    }   
}
