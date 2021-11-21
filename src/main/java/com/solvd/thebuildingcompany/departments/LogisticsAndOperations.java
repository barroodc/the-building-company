package com.solvd.thebuildingcompany.departments;

import java.util.Date;
import java.util.HashMap;

public abstract class LogisticsAndOperations {

    private boolean assessmentDone;
    private int forecastedSales;
    private boolean vendorFound;
    private String transportMethod;
    private boolean orderArrived;
    private boolean vehicleInUse;
    private String name;

    protected abstract String resourceAssessments();
    protected abstract String leadTimeAssessments();
    protected abstract String supplyAndDemandPlanning();
    protected abstract HashMap<String, Boolean> sourcingAndProcurement();
    protected abstract HashMap<String, Date> productionPlanningAndScheduling();
    protected abstract HashMap<String, String> packagingAndAssembly();
    protected abstract HashMap<String, Integer> inventoryManagement();
    protected abstract HashMap<String, Boolean> orderFulfilment();
    protected abstract String inboundTransportManagement();
    protected abstract String outboundTransportManagement();
    protected abstract HashMap<String, Integer> warehousing();
    protected abstract String materialsHandling(int moveItemOnSite);
    protected abstract HashMap<String, Boolean> onSiteVehicleManagement();
    protected abstract String plantManagement(boolean inGoodHealth, double costUsingMachines);
    protected abstract String customerServices();
    protected abstract String wasteManagement();

    public boolean isAssessmentDone() {
        return assessmentDone;
    }

    public void setAssessmentDone(boolean assessmentDone) {
        this.assessmentDone = assessmentDone;
    }

    public int getForecastedSales() {
        return forecastedSales;
    }

    public void setForecastedSales(int forecastedSales) {
        this.forecastedSales = forecastedSales;
    }

    public boolean isVendorFound() {
        return vendorFound;
    }

    public void setVendorFound(boolean vendorFound) {
        this.vendorFound = vendorFound;
    }

    public String getTransportMethod() {
        return transportMethod;
    }

    public void setTransportMethod(String transportMethod) {
        this.transportMethod = transportMethod;
    }

    public boolean isOrderArrived() {
        return orderArrived;
    }

    public void setOrderArrived(boolean orderArrived) {
        this.orderArrived = orderArrived;
    }

    public boolean isVehicleInUse() {
        return vehicleInUse;
    }

    public void setVehicleInUse(boolean vehicleInUse) {
        this.vehicleInUse = vehicleInUse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
