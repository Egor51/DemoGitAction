package com.example.testgitaction.service;

import com.example.testgitaction.model.Flat;
import com.example.testgitaction.model.FlatAnalitics;
import com.example.testgitaction.repository.FlatRepository;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class FlatService {
    final FlatRepository flatRepository;

    public FlatService(FlatRepository flatRepository) {
        this.flatRepository = flatRepository;
    }

    public List<FlatAnalitics> findFlat(Flat flat) {

        List<FlatAnalitics> list = flatRepository.getALlFlat()
                .stream()
                .filter(x -> x.getCity().equals(flat.getCity()))
                .filter(x -> x.getStreet().equals(flat.getStreet()))
                .filter(x -> x.getHouseNumber() == flat.getHouseNumber())
                .map(temp -> {

                    long priceMeter = temp.getPrice() / temp.getMeter();
                    String source = temp.getCity() + "," + temp.getStreet() + " ," + temp.getCorpNumber() + " " + temp.getHouseNumber();
                    return new FlatAnalitics(source,temp.getCountRoom(), temp.getPrice(), priceMeter);
                }).toList();


        return list;
    }
}
