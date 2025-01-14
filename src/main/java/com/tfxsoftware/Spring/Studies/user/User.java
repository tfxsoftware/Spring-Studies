package com.tfxsoftware.Spring.Studies.user;
    
import com.tfxsoftware.Spring.Studies.auth.Role;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record User(
                   @NotBlank
                   String id,
                   @NotBlank @Size(min = 3, max = 20)
                   String name, 
                   @NotBlank @Email
                   String email,
                   @NotBlank @Size(min = 8)
                   String hashedPassword,
                   @NotBlank
                   Role role
                   ) {}