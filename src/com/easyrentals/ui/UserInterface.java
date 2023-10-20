package com.easyrentals.ui;

import com.easyrentals.model.Bike;
import com.easyrentals.model.Customer;
import com.easyrentals.service.BikeService;
import com.easyrentals.service.CustomerService;
import com.easyrentals.util.CustomerData;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UserInterface {

    private BikeService bikeService;
    private CustomerService customerService;

    public UserInterface(){
        this.bikeService = new BikeService();
        this.customerService = new CustomerService();
    }

    public void getDetails(){
        customerService.getCustomerDetails();
    }
    public void displayAvailableBikesForCustomer() {
        Set<Bike> availableBikes = bikeService.getAvailableBikesForCustomer();

        System.out.println("\nAvailable Bikes for Customer:\n");
        availableBikes.forEach(bike ->{System.out.println(bike.toString());});
    }
}
