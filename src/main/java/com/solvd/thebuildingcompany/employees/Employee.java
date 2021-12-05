package com.solvd.thebuildingcompany.employees;

import java.util.Date;

public abstract class Employee {
    private String name;
    private String nameOfCompany;
    private int employeeID;  //primary key
    private int departmentID;  //foreign key

    public Employee() {

    }


    public Employee(final String name, final String nameOfCompany) {
        this.name = name;
        this.nameOfCompany = nameOfCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
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
}
