package com.example.testgitaction.controller;


import com.example.testgitaction.model.Flat;
import com.example.testgitaction.model.FlatAnalitics;
import com.example.testgitaction.model.User;
import com.example.testgitaction.repository.FlatRepository;
import com.example.testgitaction.service.FlatService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Log4j2
@RestController
@CrossOrigin(origins = "*")
public class Controller {
    public Controller(FlatRepository flatRepository, FlatService flatService) {
        this.flatRepository = flatRepository;
        this.flatService = flatService;
    }

    FlatRepository flatRepository;
    FlatService flatService;
    private final ConcurrentHashMap<Long, User> data = new ConcurrentHashMap<>();

    @GetMapping("/hello")
    public String welcome() {
        return "Welcome";
    }

    @GetMapping("/user")
    public Collection<User> user() {
        return new ArrayList<>(data.values());
    }

    @PostMapping(
            path = "/",
            consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})

    public ResponseEntity<String> test(User user) {
        data.put(1234234L, user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/add-flat")
    public ResponseEntity<String> saveFlat(@RequestBody Flat flat) {
        flatRepository.saveFlat(flat);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/allFlat")
    public List<Flat> getAllFlat() {
        return flatRepository.getALlFlat();
    }

    @GetMapping(value = "/check-flat/",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<FlatAnalitics>> checkFlat(@ModelAttribute("flat") Flat flat) {
        log.info("Get /check-flat " + flat );
        return new ResponseEntity<>(flatService.findFlat(flat),HttpStatus.OK);
    }

    @GetMapping("/analytics")
    public ResponseEntity<List<FlatAnalitics>>getAnalitycs(){
        return new ResponseEntity<>(flatRepository.getAnalytics(),HttpStatus.OK);
    }
}
