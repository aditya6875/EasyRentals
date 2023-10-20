package com.easyrentals.service;

import com.easyrentals.model.Customer;
import com.easyrentals.util.CustomerData;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerService {

    public void getCustomerDetails() {
        List<Customer> cust = CustomerData.getSampleCustomerData();

        // 1. Use internal iteration to print all Customer Details in ascending order of their dob.
        cust.stream()
                .sorted((c1, c2) -> c1.getDob().compareTo(c2.getDob()))
                .forEach(System.out::println);

        System.out.println("\n");
        // 2. Discount for customers associated for 5+ years
        LocalDate fiveYearsAgo = LocalDate.now().minusYears(5);
        cust.stream()
                .filter(customer -> customer.getRegistrationDate().isBefore(fiveYearsAgo))
                .forEach(customer -> System.out.println("Customer " + customer.getName() + " gets 10% discount!"));

        // 3. Filters using lambda and stream
        List<Customer> regularCustomersFromChinaAbove18 = cust.stream()
                .filter(customer -> "R".equals(customer.getCustType()) && "China".equals(customer.getCountry()) && customer.getDob().isBefore(LocalDate.now().minusYears(18)))
                .collect(Collectors.toList());

        System.out.println("\n\nRegular Customers from China aged above 18:\n");
        regularCustomersFromChinaAbove18.forEach(System.out::println);

        long countAge50Plus = cust.stream()
                .filter(customer -> customer.getDob().isBefore(LocalDate.now().minusYears(50)))
                .count();
        System.out.println("\n\nNumber of customers whose age is 50+ years: " + countAge50Plus);

        List<Customer> privilegedUSACustomers = cust.stream()
                .filter(customer -> "P".equals(customer.getCustType()) && "USA".equals(customer.getCountry()))
                .collect(Collectors.toList());

        System.out.println("\n\nPrivileged Customers of USA:");
        privilegedUSACustomers.forEach(System.out::println);

        // 4. Handle null emailId for customers
        List<Customer> customersWithNullEmail = cust.stream()
                .filter(customer -> customer.getEmailId() == null)
                .collect(Collectors.toList());
        System.out.println("\nCustomers with Null Email:");
        customersWithNullEmail.forEach(System.out::println);
    }

}

