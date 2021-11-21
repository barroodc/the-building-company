package com.solvd.thebuildingcompany.departments;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Security {

    private boolean camerasInstalled;
    private int officersPatrolling;
    private boolean workingPhone;
    private boolean correctSignagePlaced;
    private boolean gpsOnTopAssets;
    private boolean violatorsCaught;
    private boolean assetsSecured;
    private String name;

    protected abstract HashMap<String, Boolean> securitySystemInstallation();
    protected abstract HashMap<String, Integer> patrol();
    protected abstract HashMap<String, Boolean> firstResponderCommunications();
    protected abstract String monitoringAccess();
    protected abstract HashMap<String, String> signage();
    protected abstract HashMap<String, Boolean> gpsTrackingOfAssets();
    protected abstract HashMap<String, ArrayList<String>> analyzeSecurityFootage();
    protected abstract HashMap<String, Boolean> apprehendingViolators();
    protected abstract HashMap<String, Boolean> assetsLockedUp();

    public boolean isCamerasInstalled() {
        return camerasInstalled;
    }

    public void setCamerasInstalled(boolean camerasInstalled) {
        this.camerasInstalled = camerasInstalled;
    }

    public int getOfficersPatrolling() {
        return officersPatrolling;
    }

    public void setOfficersPatrolling(int officersPatrolling) {
        this.officersPatrolling = officersPatrolling;
    }

    public boolean isWorkingPhone() {
        return workingPhone;
    }

    public void setWorkingPhone(boolean workingPhone) {
        this.workingPhone = workingPhone;
    }

    public boolean isCorrectSignagePlaced() {
        return correctSignagePlaced;
    }

    public void setCorrectSignagePlaced(boolean correctSignagePlaced) {
        this.correctSignagePlaced = correctSignagePlaced;
    }

    public boolean isGpsOnTopAssets() {
        return gpsOnTopAssets;
    }

    public void setGpsOnTopAssets(boolean gpsOnTopAssets) {
        this.gpsOnTopAssets = gpsOnTopAssets;
    }

    public boolean isViolatorsCaught() {
        return violatorsCaught;
    }

    public void setViolatorsCaught(boolean violatorsCaught) {
        this.violatorsCaught = violatorsCaught;
    }

    public boolean isAssetsSecured() {
        return assetsSecured;
    }

    public void setAssetsSecured(boolean assetsSecured) {
        this.assetsSecured = assetsSecured;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
