package com.easyrentals.util;

import com.easyrentals.model.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerData {

    public static List<Customer> getSampleCustomerData() {
        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer(1, "Alice", LocalDate.of(1980, 5, 15), "P", "Female", "1234567890", "alice@example.com", LocalDate.of(2018, 1, 10), "USA"));
        customers.add(new Customer(2, "Bob", LocalDate.of(1992, 9, 3), "R", "Male", "9876543210", null, LocalDate.of(2017, 6, 22), "China"));
        customers.add(new Customer(3, "Eva", LocalDate.of(1975, 3, 28), "P", "Female", "1122334455", "eva@example.com", LocalDate.of(2015, 10, 5), "France"));
        customers.add(new Customer(4, "David", LocalDate.of(1968, 8, 10), "R", "Male", "9988776655", null, LocalDate.of(2019, 2, 17), "Spain"));

        return customers;
    }
}
