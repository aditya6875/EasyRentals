package com.easyrentals.model;

import java.time.LocalDate;

public class Bike {

    public Bike(int bikeId, String serialNumber, String bikeName, double rentPrice, String companyName) {
        this.bikeId = bikeId;
        this.serialNumber = serialNumber;
        this.bikeName = bikeName;
        this.rentPrice = rentPrice;
        this.companyName = companyName;
    }
    public int getBikeId() {
        return bikeId;
    }

    @Override
    public String toString() {
        return "Bike -->" +
                "bikeId=" + bikeId +
                ", serialNumber='" + serialNumber + '\'' +
                ", bikeName='" + bikeName + '\'' +
                ", rentPrice=" + rentPrice +
                ", companyName='" + companyName + '\''
                ;
    }

    public void setBikeId(int bikeId) {
        this.bikeId = bikeId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
    }

    private int bikeId;
    private String serialNumber;
    private String bikeName;
    private double rentPrice;
    private String companyName;
    private LocalDate rentDate;
    private String custType;

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }
    public int getAge() {
        return LocalDate.now().getYear() - rentDate.getYear();
    }
}
