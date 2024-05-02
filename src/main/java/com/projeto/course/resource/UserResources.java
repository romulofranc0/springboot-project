package com.projeto.course.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.course.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResources {
    
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u=new User(1L, "maria", "sdnsdno@jdfnjkd", "56756756756", "vsdc2323");
        return ResponseEntity.ok().body(u);
        }

}
