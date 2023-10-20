package com.easyrentals.dao;

import com.easyrentals.model.Bike;
import com.easyrentals.util.BikeData;

import java.util.Set;

public class BikeDAO {
    public Set<Bike> getBikeDetails(){
        return BikeData.getSampleBikeData();
    }
}

