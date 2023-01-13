package com.example.testgitaction.repository;

import com.example.testgitaction.model.Flat;
import com.example.testgitaction.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class FlatRepository {

    private final ConcurrentHashMap<Long, Flat> data = new ConcurrentHashMap<>();
    List<Flat> flats = Arrays.asList(
            new Flat(123, "20-01-2022", "Москва", "ул Ленина", 30, "корп 2", 2, 1, 60, 5550000),
            new Flat(123, "20-01-2022", "Мурманск", "ул Мира", 30, "корп 2", 2, 1, 60, 5550000),
            new Flat(123, "20-01-2022", "Москва", "ул Ленина", 30, "корп 2", 2, 2, 60, 5550000),
            new Flat(124, "20-01-2022", "Москва", "ул Ленина", 30, "корп 2", 2, 3, 120, 5550000),
            new Flat(125, "20-01-2022", "Москва", "ул Ленина", 30, "корп 2", 2, 4, 30, 5550000),
            new Flat(126, "20-01-2022", "Москва", "ул Ленина", 32, "корп 2", 2, 1, 45, 5550000),
            new Flat(127, "20-01-2022", "Москва", "ул Ленина", 32, "корп 2", 2, 2, 40, 5550000),
            new Flat(128, "20-01-2022", "Москва", "ул Ленина", 33, "корп 2", 2, 1, 80, 5550000),
            new Flat(129, "20-01-2022", "Москва", "ул Ленина", 33, "корп 2", 2, 2, 90, 5550000),
            new Flat(130, "20-01-2022", "Москва", "ул Ленина", 33, "корп 2", 2, 3, 100, 5550000),
            new Flat(130, "20-01-2022", "Москва", "ул Ленина", 33, "корп 2", 2, 3, 100, 3550000),
            new Flat(130, "20-01-2022", "Москва", "ул Ленина", 33, "корп 2", 2, 1, 100, 3550000),
            new Flat(130, "20-01-2022", "Москва", "ул Ленина", 33, "корп 2", 2, 1, 100, 3550000),
            new Flat(130, "20-01-2022", "Москва", "ул Ленина", 29, "корп 2", 2, 1, 100, 3550000),
            new Flat(134, "20-01-2022", "Moscow", "Lenina", 29, "corp 2", 2, 2, 30, 1000000),
            new Flat(134, "20-01-2022", "Moscow", "Lenina", 29, "corp 2", 2, 1, 30, 1000000),
            new Flat(134, "20-01-2022", "Moscow", "Lenina", 29, "corp 2", 2, 3, 30, 1000000),
            new Flat(134, "20-01-2022", "Moscow", "Lenina", 29, "corp 2", 2, 1, 30, 1000000)
    );


    public List<Flat> getALlFlat() {
        return flats;
    }

    public Flat saveFlat(Flat flat) {
        return flat;
    }
}
