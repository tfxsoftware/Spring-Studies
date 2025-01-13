package com.tfxsoftware.Spring.Studies.user;

public record User(String id,
                   String name, 
                   String email,
                   String hashedPassword,
                   String role
                   ) {}