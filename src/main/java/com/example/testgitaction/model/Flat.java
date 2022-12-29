package com.example.testgitaction.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Flat {
    long id;
    String city;
    String street;
    int houseNumber;
    String corpNumber;
    int flatNumber;
    int countRoom;

    int meter;
    long price;

    @JsonCreator
    public Flat(@JsonProperty("id") long id,
                @JsonProperty("city") String city,
                @JsonProperty("street") String street,
                @JsonProperty("houseNumber") int houseNumber,
                @JsonProperty("corpNumber") String corpNumber,
                @JsonProperty("flatNumber") int flatNumber,
                @JsonProperty("countRoom") int countRoom,
                @JsonProperty("meter") int meter,
                @JsonProperty("price") long price) {

        this.id = id;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.corpNumber = corpNumber;
        this.flatNumber = flatNumber;
        this.countRoom = countRoom;
        this.meter = meter;
        this.price = price;
    }
}
