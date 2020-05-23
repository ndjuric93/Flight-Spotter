package com.flight.FlightSpotter.models.dto;

public class RegisterUserDTO {
    private String username;
    private String password;
    private String email;

    public RegisterUserDTO() {
    }

    public String getUsername() {
        return this.username;
    }

    public String getEmail() {
        return this.email;
    }
}
