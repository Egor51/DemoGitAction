package com.example.testgitaction.service;

import com.example.testgitaction.model.Flat;
import com.example.testgitaction.model.FlatAnalitics;
import com.example.testgitaction.repository.FlatRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;


@Log4j2
@Service
public class FlatService {
    final FlatRepository flatRepository;

    public FlatService(FlatRepository flatRepository) {
        this.flatRepository = flatRepository;
    }

    public List<FlatAnalitics> findFlat(Flat flat) {
// TODO сделать фильтр
        return flatRepository.getALlFlat()
                .stream()
                .filter(x -> x.getCity().equals(flat.getCity()))
                .filter(x -> x.getStreet().equals(flat.getStreet()))
                .filter(x -> x.getHouseNumber() == flat.getHouseNumber())
                .filter(x -> x.getCorpNumber().equals(flat.getCorpNumber()))
                .map(this::toFlatAnalitics).collect(Collectors.toList());

    }

    public FlatAnalitics toFlatAnalitics(Flat temp) {
        long priceMeter = temp.getPrice() / temp.getMeter();
        String source = temp.getCity() + "," + temp.getStreet() + " ," + temp.getCorpNumber() + " " + temp.getHouseNumber();
        return new FlatAnalitics(source, temp.getCountRoom(), temp.getPrice(), priceMeter);
    }
}

