package com.easyrentals.model;

import java.time.LocalDate;
import java.time.Period;

public class Customer {
    public int id;
    public String name;

    public Customer(){}

    public Customer(int id, String name, LocalDate dob, String custType, String gender, String contactNo, String emailId, LocalDate registrationDate, String country) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.custType = custType;
        this.gender = gender;
        this.contactNo = contactNo;
        this.emailId = emailId;
        this.registrationDate = registrationDate;
        this.country = country;
    }

    private LocalDate dob;
    private String custType;
    private String gender;
    private String contactNo;
    private String emailId;
    private LocalDate registrationDate;
    private String country;
    private String age;

    public String getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCustomerType() {
        if (custType.equals("P")) {
            return "ER" + custType;
        }
        return custType;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", custType='" + custType + '\'' +
                ", gender='" + gender + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", emailId='" + emailId + '\'' +
                ", registrationDate=" + registrationDate +
                ", country='" + country + '\'' +
                '}';
    }

    public void setAge(int age) {
    }
}
