package com.easyrentals.service;

import com.easyrentals.dao.BikeDAO;
import com.easyrentals.model.Bike;
import com.easyrentals.model.Customer;

import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BikeService {
    private BikeDAO bikeDAO;

    public BikeService(){
        this.bikeDAO = new BikeDAO();
    }

    public Set<Bike> getAvailableBikesForCustomer() {
        Set<Bike> allBikes = bikeDAO.getBikeDetails();
        return allBikes;
    }
}
