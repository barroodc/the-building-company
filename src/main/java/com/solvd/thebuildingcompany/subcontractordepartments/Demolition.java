package com.solvd.thebuildingcompany.subcontractordepartments;

import com.solvd.thebuildingcompany.employees.ResidentialContractor;

public abstract class Demolition extends ResidentialContractor {

    private String name;
    private String nameOfCompany;
    private boolean siteLeveled;
    private boolean siteClean;
    private boolean roadBlocksUp;
    private boolean assistanceRequired;

    public Demolition(String name, String contractorCompany) {
        super(name, contractorCompany);
    }

    protected abstract boolean demolitionOfSite();
    protected abstract boolean cleanUpSite();
    protected abstract boolean trafficControl();
    protected abstract boolean equipmentOperatorAssistance();
    protected abstract boolean cleanToolsAndEquipment();

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

    public boolean isSiteLeveled() {
        return siteLeveled;
    }

    public void setSiteLeveled(boolean siteLeveled) {
        this.siteLeveled = siteLeveled;
    }

    public boolean isSiteClean() {
        return siteClean;
    }

    public void setSiteClean(boolean siteClean) {
        this.siteClean = siteClean;
    }

    public boolean isRoadBlocksUp() {
        return roadBlocksUp;
    }

    public void setRoadBlocksUp(boolean roadBlocksUp) {
        this.roadBlocksUp = roadBlocksUp;
    }

    public boolean isAssistanceRequired() {
        return assistanceRequired;
    }

    public void setAssistanceRequired(boolean assistanceRequired) {
        this.assistanceRequired = assistanceRequired;
    }
}
