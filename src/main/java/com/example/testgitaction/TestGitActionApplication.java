package com.example.testgitaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class TestGitActionApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestGitActionApplication.class, args);
    }
@GetMapping("/hello")
    public String welcome(){
        return "Welcome";
}
    @GetMapping("/user")
    public String user(){
        return "new User";
    }
    @PostMapping("/")
    public ResponseEntity<String> test() {
        // if (string.equals("test")) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
