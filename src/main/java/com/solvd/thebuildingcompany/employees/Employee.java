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

    public Employee(String firstName, String lastName, int employeeID, int departmentID, Date hireDate, int paymentPerHour) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.departmentID = departmentID;
        this.hireDate = hireDate;
        this.paymentPerHour = paymentPerHour;
    }

    public Employee(String firstName, String lastName, String email, int phoneNumber, String homeStreetAddress,
                    String homeCity, String homeState) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.homeStreetAddress = homeStreetAddress;
        this.homeCity = homeCity;
        this.homeState = homeState;
    }

    public Employee(String firstName, String lastName, double paymentPerHour, double hoursWorked){
        this.firstName = firstName;
        this.lastName = lastName;
        this.paymentPerHour = paymentPerHour;
        this.hoursWorked = hoursWorked;
    }

    protected abstract Double earnings();  //change to earned income?

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

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
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

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
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

    public String getHomeStreetAddress() {
        return homeStreetAddress;
    }

    public void setHomeStreetAddress(String homeStreetAddress) {
        this.homeStreetAddress = homeStreetAddress;
    }

    public String getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity;
    }

    public String getHomeState() {
        return homeState;
    }

    public void setHomeState(String homeState) {
        this.homeState = homeState;
    }
}
