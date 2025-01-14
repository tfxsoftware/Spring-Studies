package com.tfxsoftware.Spring.Studies.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tfxsoftware.Spring.Studies.auth.Role;


@Repository
public class UserRepository {
    public List<User> findAll() {
        return List.of(new User("1", "John Doe", "john.doe@example.com", "123456", Role.ADMIN));
    }
}
