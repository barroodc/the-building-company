package com.solvd.thebuildingcompany.contractors;

import java.util.Date;
import java.util.HashMap;

public abstract class Contractor {

    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;
    private double paymentPerHour;
    private double hoursWorked;
    private String nameOfCompany;
    private String typeOfService;
    private HashMap<Date, Date> startAndEndDate;

    public Contractor() {

    }

    public Contractor(String firstName, String lastName, double paymentPerHour, double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.paymentPerHour = paymentPerHour;
        this.hoursWorked = hoursWorked;
    }

    public Contractor (String firstName, String lastName, String email, int phoneNumber, String nameOfCompany) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.nameOfCompany = nameOfCompany;
    }

    public Contractor(String firstName, String lastName, String nameOfCompany, String typeOfService, HashMap<Date, Date> startAndEndDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nameOfCompany = nameOfCompany;
        this.typeOfService = typeOfService;
        this.startAndEndDate = startAndEndDate;
    }

    protected abstract Double earnings();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(double paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    public HashMap<Date, Date> getStartAndEndDate() {
        return startAndEndDate;
    }

    public void setStartAndEndDate(HashMap<Date, Date> startAndEndDate) {
        this.startAndEndDate = startAndEndDate;
    }
}
