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

    public Contractor(final String firstName, final String nameOfCompany) {

    }

    public Contractor(final String firstName, final String lastName, final double paymentPerHour, final double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.paymentPerHour = paymentPerHour;
        this.hoursWorked = hoursWorked;
    }

    public Contractor (final String firstName, final String lastName, final String email, final int phoneNumber, final String nameOfCompany) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.nameOfCompany = nameOfCompany;
    }

    public Contractor(final String firstName, final String lastName, final String nameOfCompany, final String typeOfService, final HashMap<Date, Date> startAndEndDate) {
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

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(final double paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(final double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(final String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(final String typeOfService) {
        this.typeOfService = typeOfService;
    }

    public HashMap<Date, Date> getStartAndEndDate() {
        return startAndEndDate;
    }

    public void setStartAndEndDate(final HashMap<Date, Date> startAndEndDate) {
        this.startAndEndDate = startAndEndDate;
    }
}
