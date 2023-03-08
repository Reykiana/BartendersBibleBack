package com.bartendersbible.bartendersbiblefinal.controller;

import com.bartendersbible.bartendersbiblefinal.entities.Favorite;
import com.bartendersbible.bartendersbiblefinal.entities.User;
import com.bartendersbible.bartendersbiblefinal.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        List<User> userlist = userRepository.findAll();
        return userlist;
    }
}
