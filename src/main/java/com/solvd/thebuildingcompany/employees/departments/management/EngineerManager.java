package com.solvd.thebuildingcompany.employees.departments.management;

import com.solvd.thebuildingcompany.employees.Employee;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Function;
import java.util.logging.Logger;

public class EngineerManager extends Employee {

    private static final Logger logger = Logger.getLogger(EngineerManager.class.getName());

    private double costEstimates;
    private boolean riskAverse;
    private int laborCalculation;
    private double singleEstimate;

    public double getCostEstimates() {
        return costEstimates;
    }

    public double setCostEstimates(final double costEstimates) {
        this.costEstimates = costEstimates;
        return costEstimates;
    }

    public boolean isRiskAverse() {
        return riskAverse;
    }

    public void setRiskAverse(final boolean riskAverse) {
        this.riskAverse = riskAverse;
    }

    public int getLaborCalculation() {
        return laborCalculation;
    }

    public void setLaborCalculation(final int laborCalculation) {
        this.laborCalculation = laborCalculation;
    }

    public double getSingleEstimate() {
        return singleEstimate;
    }

    public void setSingleEstimate(final double singleEstimate) {
        this.singleEstimate = singleEstimate;
    }

    public EngineerManager(final String name, final String nameOfCompany){
        super(name, nameOfCompany);
    }


    private HashMap<String, Boolean> riskAnalysis() {
        final EngineerManager chris = new EngineerManager("Chris", "The Building Company");
        chris.setCostEstimates(20000000.00);
        chris.setRiskAverse(true);

        final HashMap<String, Double> rebuildCost = new HashMap<>();
        rebuildCost.put("Estimated cost to rebuild any of the projects: ", chris.getCostEstimates());

        rebuildCost.forEach((key, value) -> logger.info(key + value));

        final HashMap<String, Boolean> riskLevel = new HashMap<>();
        riskLevel.put("Risk averse if the deal loses money?: ", chris.isRiskAverse());

        riskLevel.forEach((key, value) -> logger.info(key + value));

        return riskLevel;
    }

    private void laborEstimate() {
        final EngineerManager jessica = new EngineerManager("Jessica", "The Building Company");
        logger.info("Please enter current amount spent on labor:");
        Scanner laborPayLimit = new Scanner(System.in);
        Function<Integer, Integer> laborPay = a -> a / 2;
        jessica.setLaborCalculation(5000000);

        if (laborPay.apply(laborPayLimit.nextInt()) / 2 > (laborCalculation / 2)){
            logger.info("We need to start firing employees");
        } else {
            logger.info("Total amount required to compensate new hired crew: $" + jessica.getLaborCalculation());
        }

    }

    @Override
    public int hashCode(){
        final EngineerManager bobby = new EngineerManager("Bobby", "The Building Company");
        final int hashSingleEstimate = 20000000;
        bobby.setSingleEstimate(hashSingleEstimate);

        final HashMap<String, Double> rebuildCost = new HashMap<>();
        rebuildCost.put("Estimated cost to rebuild any of the projects: ", bobby.getSingleEstimate());

        rebuildCost.forEach((key, value) -> logger.info(key + value));

        final HashMap<String, Boolean> riskLevel = new HashMap<>();
        riskLevel.put("Risk averse if the deal loses money?: ", bobby.isRiskAverse());

        riskLevel.forEach((key, value) -> logger.info(key + value));

        return hashSingleEstimate;

    }
}
