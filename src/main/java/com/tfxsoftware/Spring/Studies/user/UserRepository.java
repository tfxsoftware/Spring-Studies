package com.tfxsoftware.Spring.Studies.user;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public List<User> findAll() {
        return List.of(new User("1", "John Doe", "john.doe@example.com", "123456", "ADMIN"));
    }
}
