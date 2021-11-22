package com.solvd.thebuildingcompany.employees.departments.management;

import com.solvd.thebuildingcompany.employees.abstractclass.Employees;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class LogisticsManager extends Employees {

    private boolean assessmentDone;
    private int forecastedSales;
    private boolean vendorFound;
    private String transportMethod;
    private boolean orderArrived;
    private boolean vehicleInUse;
    private String name;

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

    private final Logger logger = Logger.getLogger(LogisticsManager.class.getName());

    public LogisticsManager(String name) {
        this.setName(name);
    }

    private String resourceAssessments() {
        final LogisticsManager kevin = new LogisticsManager("Kevin");
        kevin.setAssessmentDone(false);

        logger.info("Resource Assessment Complete: " + kevin.isAssessmentDone());

        return "Resource Assessment Complete: " + kevin.isAssessmentDone();
    }

    private String leadTimeAssessments() {
        final LogisticsManager beverly = new LogisticsManager("Beverly");
        beverly.setAssessmentDone(true);

        logger.info("Lead Time Testing Complete: " + beverly.isAssessmentDone());

        return "Lead Time Testing Complete: " + beverly.isAssessmentDone();
    }

    private String supplyAndDemandPlanning() {
        final LogisticsManager jose = new LogisticsManager("Jose");
        jose.setForecastedSales(500);

        logger.info("Predicted number of units sold for new apartment project is " + jose.getForecastedSales());

        return "Predicted number of units sold for new apartment project is " + jose.getForecastedSales();
    }

    private HashMap<String, Boolean> sourcingAndProcurement() {
        final LogisticsManager gabriel = new LogisticsManager("Gabriel");
        gabriel.setVendorFound(true);

        final HashMap<String, Boolean> materialSource = new HashMap<>();
        materialSource.put("Piping Source Established:", gabriel.isVendorFound());

        for (Map.Entry<String, Boolean> set : materialSource.entrySet()) {
            logger.info(set.getKey());
        }

        return materialSource;
    }

    private HashMap<String, Date> productionPlanningAndScheduling() {
        final LogisticsManager travis = new LogisticsManager("Travis");

        final Calendar beginProjectDate = Calendar.getInstance();
        beginProjectDate.set(Calendar.YEAR, 2022);
        beginProjectDate.set(Calendar.MONTH, Calendar.OCTOBER);
        beginProjectDate.set(Calendar.DAY_OF_MONTH, 17);

        final Date date = beginProjectDate.getTime();

        final HashMap<String, Date> deliveryDate = new HashMap<>();
        deliveryDate.put(travis.getName() + ": Steele is needed for production by: ", date);
        deliveryDate.put(travis.getName() + ": Concrete is needed for production by: ", date);
        deliveryDate.put(travis.getName() + ":Wood is needed for production by: ", date);

        for (Map.Entry<String, Date> set : deliveryDate.entrySet()) {
            logger.info(set.getKey());
        }

        return deliveryDate;
    }

    private HashMap<String, String> packagingAndAssembly() {
        final LogisticsManager hunter = new LogisticsManager("Hunter");
        final HashMap<String, String> contractorsTask = new HashMap<>();
        contractorsTask.put(hunter.getName() + ": Contractor XYZ", "Knock down walls");
        contractorsTask.put(hunter.getName() + ": Contractor ABC", "provide temporary utilities on site");
        contractorsTask.put(hunter.getName() + ":Contractor NLX", "manage personnel on site");

        for (Map.Entry<String, String> set : contractorsTask.entrySet()) {
            logger.info(set.getKey());
        }


        return contractorsTask;
    }

    private HashMap<String, Integer> inventoryManagement() {
        final LogisticsManager jessie = new LogisticsManager("Jessie");
        final HashMap<String, Integer> itemAndQuantity = new HashMap<>();
        itemAndQuantity.put(jessie.getName() + ": Stone Count(Low)", 50);
        itemAndQuantity.put(jessie.getName() + ": Brick Count (Low)", 25);

        for (Map.Entry<String, Integer> set : itemAndQuantity.entrySet()) {
            logger.info(set.getKey());
        }

        return itemAndQuantity;
    }

    private HashMap<String, Boolean> orderFulfilment() {
        final LogisticsManager jordan = new LogisticsManager("Jordan");
        jordan.setOrderArrived(true);

        final HashMap<String, Boolean> deliveryStatus = new HashMap<>();
        deliveryStatus.put("Steele was successfully delivered", jordan.isOrderArrived());

        for (Map.Entry<String, Boolean> set : deliveryStatus.entrySet()) {
            logger.info(set.getKey());
        }

        return deliveryStatus;
    }

    private String inboundTransportManagement() {
        final LogisticsManager josiah = new LogisticsManager("Josiah");
        josiah.setTransportMethod("moving truck");

        logger.info("Supplies will be coming this afternoon in a: " + josiah.getTransportMethod());

        return "Supplies will be coming this afternoon in a: " + josiah.getTransportMethod();
    }

    private String outboundTransportManagement() {
        final LogisticsManager julian = new LogisticsManager("Julian");
        julian.setTransportMethod("moving truck");

        logger.info("Supplies will be shipped to other project via a: " + julian.getTransportMethod());

        return "Supplies will be shipped to other project via a: " + julian.getTransportMethod();
    }

    private HashMap<String, Integer> warehousing() {
        final LogisticsManager jayden = new LogisticsManager("Jayden");
        final HashMap<String, Integer> itemAndQuantity = new HashMap<>();
        itemAndQuantity.put("Total supply of wood in California warehouse", 50);
        itemAndQuantity.put("Total supply of steele in California warehouse",100);
        itemAndQuantity.put("Total supply of brick in California warehouse", 1000);

        for (Map.Entry<String, Integer> set : itemAndQuantity.entrySet()) {
            logger.info(set.getKey());
        }

        return itemAndQuantity;
    }

    private String materialsHandling(int moveItemOnSite) {
        final LogisticsManager pearson = new LogisticsManager("Pearson");

        logger.info("Number of items that were moved on site: " + moveItemOnSite);

        return "Number of items that were moved on site: " + moveItemOnSite;
    }

    private HashMap<String, Boolean> onSiteVehicleManagement() {
        final LogisticsManager nova = new LogisticsManager("Nova");
        final HashMap<String, Boolean> vehicles = new HashMap<>();
        vehicles.put(nova.getName() + ": Bulldozer in use", isVehicleInUse());
        vehicles.put(nova.getName() + ": Crane in use", isVehicleInUse());
        vehicles.put(nova.getName() + ": Cement truck in use", isVehicleInUse());

        for (Map.Entry<String, Boolean> set : vehicles.entrySet()) {
            logger.info(set.getKey());
        }

        return vehicles;
    }

    private String plantManagement(boolean inGoodHealth, double costUsingMachines) {
        final LogisticsManager cassidy = new LogisticsManager("Cassidy");
        final HashMap<String, Boolean> machineHealth = new HashMap<>();
        machineHealth.put(cassidy.getName() + ": Machines are in good health: ", inGoodHealth);

        final HashMap<String, Double> costToUse = new HashMap<>();
        costToUse.put(cassidy.getName() + ": Cost of machinery while in use: ", costUsingMachines);

        for (Map.Entry<String, Boolean> set : machineHealth.entrySet()) {
            logger.info(set.getKey());
        }

        for (Map.Entry<String, Double> set : costToUse.entrySet()) {
            logger.info(set.getKey());
        }


        if (!inGoodHealth){
            logger.info("Machine needs immediate attention.");
            return "Machine needs immediate attention.";
        } else {
            logger.info("Machine is in good standing");
            return "Machine is in good standing";
        }
    }

    private String customerServices() {
        final LogisticsManager hudson = new LogisticsManager("Hudson");
        boolean statusGiven = true;

        logger.info("Status updates successfully given: " + statusGiven);
        return "Status updates successfully given: " + statusGiven;
    }

    private String wasteManagement() {
        final LogisticsManager hudson = new LogisticsManager("Hudson");
        boolean wastePlanActive = true;
        logger.info(hudson.getName() + ": Construction site has an active waist management plan: " + wastePlanActive);
        return hudson.getName() + ": Construction site has an active waist management plan: " + wastePlanActive;
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
