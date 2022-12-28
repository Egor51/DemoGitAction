package com.example.testgitaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@SpringBootApplication
public class TestGitActionApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestGitActionApplication.class, args);
    }

    private final ConcurrentHashMap<Long, User> data = new ConcurrentHashMap<>();
@GetMapping("/hello")
    public String welcome(){
        return "Welcome";
}
    @GetMapping("/user")
    public Collection<User> user(){
         return new ArrayList<>(data.values());
    }
    @PostMapping(
        path = "/",
        consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})

        public ResponseEntity<String> test(User user) {
        data.put(1234234L,user);

    return new ResponseEntity<>(HttpStatus.OK);
    }
}
