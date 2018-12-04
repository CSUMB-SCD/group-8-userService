package edu.csumb.cst438.userservice.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.csumb.cst438.userservice.api.entities.User;
import edu.csumb.cst438.userservice.business.Manager;

@RestController
public class UserController {
    @Autowired
    Manager manager;

    @CrossOrigin
    @GetMapping("/User")
    @ResponseBody
    List<User> getUsers() {
        return manager.getUserList();
    }
    
    @CrossOrigin
    @RequestMapping(value="/validate", method = RequestMethod.POST)
    public User validate(@RequestBody User payload) throws Exception {
        return manager.validate(payload);
    }
    
    @GetMapping("/")
    public String home() {
        return "This is a trivial service that demonstrates how a Eureka Client can register with a Eureka Server";
    }
}