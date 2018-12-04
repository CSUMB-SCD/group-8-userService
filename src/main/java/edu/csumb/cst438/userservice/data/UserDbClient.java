package edu.csumb.cst438.userservice.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import edu.csumb.cst438.userservice.api.entities.User;

@Repository
public class UserDbClient {

    public List<User> getAll(){
        final String uri = "https://proj-zuul.herokuapp.com/userdb/User";

        RestTemplate restTemplate = new RestTemplate();
        List<User> result = restTemplate.getForObject(uri, List.class);
    
        return result;
    }
}