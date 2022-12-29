package com.example.testgitaction;

import com.example.testgitaction.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;


@SpringBootApplication
public class TestGitActionApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestGitActionApplication.class, args);
    }

}
