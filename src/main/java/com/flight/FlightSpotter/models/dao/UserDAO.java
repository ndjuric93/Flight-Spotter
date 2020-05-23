package com.flight.FlightSpotter.models.dao;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    @Id
    public String id;

    public String username;
    public String email;
    public String password;

    public UserDAO(final String username, final String password, final String email) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format(
            "User[name=%s]", this.username
        );
    }
}
