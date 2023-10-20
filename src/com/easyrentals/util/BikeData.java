package com.easyrentals.util;

import com.easyrentals.model.Bike;

import java.util.HashSet;
import java.util.Set;

public class BikeData {

    public static Set<Bike> getSampleBikeData(){
        Set<Bike> bike = new HashSet<Bike>();
        bike.add(new Bike(1001,"Hon:1001","CBR",500.0,"Honda"));
        bike.add(new Bike(1002,"Her:1002","CBZ",800.0,"Hero"));
        bike.add(new Bike(1003,"Enf:1003","Bullet",900.0,"Enfield"));
        bike.add(new Bike(1004,"Her:1004","Karizma",700.0,"Hero"));

        return bike;
    }
}
