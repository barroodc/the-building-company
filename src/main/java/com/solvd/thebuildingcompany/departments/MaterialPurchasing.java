package com.solvd.thebuildingcompany.departments;

import java.util.HashMap;

public abstract class MaterialPurchasing {

    private boolean proposalSent;
    private boolean feasible;
    private double maintenanceCosts;
    private double operatingCosts;
    private boolean deadlinesAreMade;
    private boolean arrivedOnTime;
    private boolean contractsHonored;
    private String name;

    protected abstract String materialsToOrder();
    protected abstract String materialsOrdered();
    protected abstract String requestForProposalEvaluation();
    protected abstract String bidEvaluation();
    protected abstract HashMap<String, Boolean> resourceManagement();
    protected abstract HashMap<String, Boolean> itemDeadlines();
    protected abstract String orderChanges();
    protected abstract String contractManagement();



    public boolean isProposalSent() {
        return proposalSent;
    }

    public void setProposalSent(boolean proposalSent) {
        this.proposalSent = proposalSent;
    }

    public boolean isFeasible() {
        return feasible;
    }

    public void setFeasible(boolean feasible) {
        this.feasible = feasible;
    }

    public double getMaintenanceCosts() {
        return maintenanceCosts;
    }

    public void setMaintenanceCosts(double maintenanceCosts) {
        this.maintenanceCosts = maintenanceCosts;
    }

    public double getOperatingCosts() {
        return operatingCosts;
    }

    public void setOperatingCosts(double operatingCosts) {
        this.operatingCosts = operatingCosts;
    }

    public boolean isDeadlinesAreMade() {
        return deadlinesAreMade;
    }

    public void setDeadlinesAreMade(boolean deadlinesAreMade) {
        this.deadlinesAreMade = deadlinesAreMade;
    }

    public boolean isArrivedOnTime() {
        return arrivedOnTime;
    }

    public void setArrivedOnTime(boolean arrivedOnTime) {
        this.arrivedOnTime = arrivedOnTime;
    }

    public boolean isContractsHonored() {
        return contractsHonored;
    }

    public void setContractsHonored(boolean contractsHonored) {
        this.contractsHonored = contractsHonored;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
