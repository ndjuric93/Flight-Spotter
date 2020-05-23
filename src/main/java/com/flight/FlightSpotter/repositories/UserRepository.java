package com.flight.FlightSpotter.repositories;

import com.flight.FlightSpotter.models.dao.UserDAO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserDAO, String> {

    public UserDAO findByUsername(String username);
    public void registerUser(UserDAO user);

}
