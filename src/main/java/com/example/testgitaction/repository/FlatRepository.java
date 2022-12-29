package com.example.testgitaction.repository;

import com.example.testgitaction.model.Flat;
import com.example.testgitaction.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class FlatRepository {

    private final ConcurrentHashMap<Long,Flat> data = new ConcurrentHashMap<>();
    List<Flat> flats = Arrays.asList(
        new Flat(123,"Москва","ул Ленина",30,"корп 2",2,1,60,5550000),
        new Flat(123,"Москва","ул Ленина",30,"корп 2",2,2,60,5550000),
        new Flat(124,"Москва","ул Ленина",30,"корп 2",2,3,120,5550000),
        new Flat(125,"Москва","ул Ленина",30,"корп 2",2,4,30,5550000),
        new Flat(126,"Москва","ул Ленина",32,"корп 2",2,1,45,5550000),
        new Flat(127,"Москва","ул Ленина",32,"корп 2",2,2,40,5550000),
        new Flat(128,"Москва","ул Ленина",33,"корп 2",2,1,80,5550000),
        new Flat(129,"Москва","ул Ленина",33,"корп 2",2,2,90,5550000),
        new Flat(130,"Москва","ул Ленина",33,"корп 2",2,3,100,5550000)
);



    public List<Flat> getALlFlat(){
        return flats;
    }

    public Flat saveFlat(Flat flat){
        return flat;
    }
}
