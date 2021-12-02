package com.solvd.thebuildingcompany.vehicles;



public abstract class Vehicle {

    private String nameOfVehicle;
    private String operatorOfVehicle;
    private String categoryOfVehicle; //different types of bulldozers etc.
    private String manufacturer;
    private String color;
    private int yearMade;


    //need to add in abstract methods


    public String getNameOfVehicle() {
        return nameOfVehicle;
    }

    public void setNameOfVehicle(final String nameOfVehicle) {
        this.nameOfVehicle = nameOfVehicle;
    }

    public String getOperatorOfVehicle() {
        return operatorOfVehicle;
    }

    public void setOperatorOfVehicle(final String operatorOfVehicle) {
        this.operatorOfVehicle = operatorOfVehicle;
    }

    public String getCategoryOfVehicle() {
        return categoryOfVehicle;
    }

    public void setCategoryOfVehicle(final String categoryOfVehicle) {
        this.categoryOfVehicle = categoryOfVehicle;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(final String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(final int yearMade) {
        this.yearMade = yearMade;
    }

    public Vehicle(final String nameOfVehicle) {
      this.nameOfVehicle = nameOfVehicle;
    }

    public Vehicle(final String nameOfVehicle, final String operatorOfVehicle) {
        this.nameOfVehicle = nameOfVehicle;
        this.operatorOfVehicle = operatorOfVehicle;
    }
}
