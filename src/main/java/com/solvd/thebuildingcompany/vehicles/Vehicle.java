package com.solvd.thebuildingcompany.vehicles;



public abstract class Vehicle {

    private String nameOfVehicle;
    private String operatorOfVehicle;


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


    public Vehicle(final String nameOfVehicle) {
      this.nameOfVehicle = nameOfVehicle;
    }

    public Vehicle(final String nameOfVehicle, final String operatorOfVehicle) {
        this.nameOfVehicle = nameOfVehicle;
        this.operatorOfVehicle = operatorOfVehicle;
    }
}
