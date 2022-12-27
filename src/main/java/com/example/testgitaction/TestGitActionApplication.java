package com.example.testgitaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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
    @PostMapping()
    public HttpStatus test(@RequestBody String string){
        if (string.equals("test")) {
            return HttpStatus.OK;
        }
        return HttpStatus.I_AM_A_TEAPOT;
    }
}
