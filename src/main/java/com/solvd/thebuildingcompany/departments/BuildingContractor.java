package com.solvd.thebuildingcompany.departments;

import java.util.HashMap;

public abstract class BuildingContractor {

    private boolean suppliesAvailable;
    private String name;
    private String contractorCompany;
    private int totalNumberOfNeededSupplies;

    protected abstract HashMap<String, String> whoOverseesConstruction();
    protected abstract HashMap<String, String> whoHandlesPaperwork();
    protected abstract Boolean ensuresBuildingSuppliesComplete();
    protected abstract HashMap<String, String> brandNewSubcontractorsHired();

    public boolean isSuppliesAvailable() {
        return suppliesAvailable;
    }

    public void setSuppliesAvailable(boolean suppliesAvailable) {
        this.suppliesAvailable = suppliesAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContractorCompany() {
        return contractorCompany;
    }

    public void setContractorCompany(String contractorCompany) {
        this.contractorCompany = contractorCompany;
    }

    public int getTotalNumberOfNeededSupplies() {
        return totalNumberOfNeededSupplies;
    }

    public void setTotalNumberOfNeededSupplies(int totalNumberOfNeededSupplies) {
        this.totalNumberOfNeededSupplies = totalNumberOfNeededSupplies;
    }
}
