package com.example.testgitaction.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FlatAnalitics {
    String sours;
    int countRoom;
    long price;
    long priceFoMeter;
@JsonCreator
    public FlatAnalitics(@JsonProperty("sours")String sours,@JsonProperty("countRoom")int countRoom,@JsonProperty("price") long price,@JsonProperty("priceFoMetr") long priceFoMeter) {
        this.sours = sours;
        this.countRoom = countRoom;
        this.price = price;
        this.priceFoMeter = priceFoMeter;
    }
}
