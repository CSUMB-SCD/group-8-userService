package edu.csumb.cst438.userservice.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.csumb.cst438.userservice.api.entities.User;
import edu.csumb.cst438.userservice.data.UserDbClient;

@Service
public class Manager{
    @Autowired
    UserDbClient userDbClient;
    
    public List<User> getUserList(){
        return userDbClient.getAll();
    }

    public User validate(User payload) {
        return userDbClient.validate(payload);
    }
}