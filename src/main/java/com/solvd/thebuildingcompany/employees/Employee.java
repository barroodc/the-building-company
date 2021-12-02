package com.solvd.thebuildingcompany.employees;

import java.util.Date;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;  //primary key
    private int departmentID;  //foreign key
    private String email;
    private int phoneNumber;
    private Date hireDate;
    private double paymentPerHour;
    private double hoursWorked;
    private String homeStreetAddress;
    private String homeCity;
    private String homeState;

    public Employee() {

    }

    public Employee(final String firstName, final String lastName, final int employeeID, final int departmentID, final Date hireDate, final int paymentPerHour) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.departmentID = departmentID;
        this.hireDate = hireDate;
        this.paymentPerHour = paymentPerHour;
    }

    public Employee(final String firstName, final String lastName, final String email, final int phoneNumber, final String homeStreetAddress,
                    final String homeCity, final String homeState) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.homeStreetAddress = homeStreetAddress;
        this.homeCity = homeCity;
        this.homeState = homeState;
    }

    public Employee(final String firstName, final String lastName, final double paymentPerHour, final double hoursWorked){
        this.firstName = firstName;
        this.lastName = lastName;
        this.paymentPerHour = paymentPerHour;
        this.hoursWorked = hoursWorked;
    }

    protected abstract Double earnings();  //change to earned income?

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

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(final int employeeID) {
        this.employeeID = employeeID;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(final int departmentID) {
        this.departmentID = departmentID;
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

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(final Date hireDate) {
        this.hireDate = hireDate;
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

    public String getHomeStreetAddress() {
        return homeStreetAddress;
    }

    public void setHomeStreetAddress(final String homeStreetAddress) {
        this.homeStreetAddress = homeStreetAddress;
    }

    public String getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(final String homeCity) {
        this.homeCity = homeCity;
    }

    public String getHomeState() {
        return homeState;
    }

    public void setHomeState(final String homeState) {
        this.homeState = homeState;
    }
}
