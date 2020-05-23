package com.flight.FlightSpotter.controllers;

import com.flight.FlightSpotter.models.dao.UserDAO;
import com.flight.FlightSpotter.models.dto.RegisterUserDTO;
import com.flight.FlightSpotter.repositories.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserRepository userRepository;

    public UserController(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/v1/user/register")
    public UserDAO register(@RequestBody RegisterUserDTO user) {
        System.out.println("HellO!");
//        if(user.isValid()) {
//
//        }
        return new UserDAO(user.getUsername(), "pass", "pas@mass.com");
    }
}
