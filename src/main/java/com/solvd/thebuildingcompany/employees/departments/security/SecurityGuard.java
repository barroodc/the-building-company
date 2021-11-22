package com.solvd.thebuildingcompany.employees.departments.security;

import com.solvd.thebuildingcompany.employees.abstractclass.Employees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class SecurityGuard extends Employees {

    private boolean camerasInstalled;
    private int officersPatrolling;
    private boolean workingPhone;
    private boolean correctSignagePlaced;
    private boolean gpsOnTopAssets;
    private boolean violatorsCaught;
    private boolean assetsSecured;
    private String name;

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

    private final Logger logger = Logger.getLogger(SecurityGuard.class.getName());

    public SecurityGuard(String name) {
        this.setName(name);
    }


    private HashMap<String, Boolean> securitySystemInstallation() {
        final SecurityGuard rodger = new SecurityGuard("Rodger");
        rodger.setCamerasInstalled(true);

        HashMap<String, Boolean> securityInstallation = new HashMap<>();
        securityInstallation.put("Security Cameras Installed", rodger.isCamerasInstalled());

        for (Map.Entry<String, Boolean> set : securityInstallation.entrySet()) {
            logger.info(set.getKey());
        }

        return securityInstallation;
    }

    private HashMap<String, Integer> patrol() {
        final SecurityGuard alex = new SecurityGuard("Alex");
        alex.setOfficersPatrolling(5);

        HashMap<String, Integer> officersPatrolling = new HashMap<>();
        officersPatrolling.put("Number of officers patrolling New York site", alex.getOfficersPatrolling());

        for (Map.Entry<String, Integer> set : officersPatrolling.entrySet()) {
            logger.info(set.getKey());
        }

        return officersPatrolling;
    }

    private HashMap<String, Boolean> firstResponderCommunications() {
        final SecurityGuard samuel = new SecurityGuard("Samuel");
        samuel.setWorkingPhone(true);

        HashMap<String, Boolean> deviceInspected = new HashMap<>();

        deviceInspected.put(samuel.getName() + "performed phone test with first responders", samuel.isWorkingPhone());

        for (Map.Entry<String, Boolean> set : deviceInspected.entrySet()) {
            logger.info(set.getKey());
        }

        return deviceInspected;
    }

    private String monitoringAccess() {
        final SecurityGuard leroy = new SecurityGuard("Leroy");

        HashMap<String, String> nameAndDepartment = new HashMap<>();
        nameAndDepartment.put("John", "Accounting");
        nameAndDepartment.put("Paul", "Loans");
        nameAndDepartment.put("Jerry", "Civil Engineering");

        for (Map.Entry<String, String> set : nameAndDepartment.entrySet()) {
            logger.info(set.getKey());
        }

        return leroy.getName() + "'s building access list " + nameAndDepartment;
    }

    private HashMap<String, String> signage() {
        final SecurityGuard dean = new SecurityGuard("Dean");
        dean.setCorrectSignagePlaced(true);

        HashMap<String, String> guardAndSignage = new HashMap<>();
        guardAndSignage.put(dean.getName(), "Appropriate Signage placed");

        for (Map.Entry<String, String> set : guardAndSignage.entrySet()) {
            logger.info(set.getKey());
        }

        return guardAndSignage;
    }

    private HashMap<String, Boolean> gpsTrackingOfAssets() {
        final SecurityGuard amanda = new SecurityGuard("Amanda");
        amanda.setGpsOnTopAssets(true);

        HashMap<String, Boolean> guardAndAssetTracking = new HashMap<>();
        guardAndAssetTracking.put(amanda.getName() + ": all high value assets have tracking software installed", amanda.isGpsOnTopAssets());

        for (Map.Entry<String, Boolean> set : guardAndAssetTracking.entrySet()) {
            logger.info(set.getKey());
        }

        return guardAndAssetTracking;
    }

    private HashMap<String, ArrayList<String>> analyzeSecurityFootage() {
        final SecurityGuard jessica = new SecurityGuard("Jessica");
        final ArrayList<String> footageTimeStamp = new ArrayList<>();
        footageTimeStamp.add("2014-08-19 at 5:18 am est");
        footageTimeStamp.add("2016-12-12 at 6:45 pm est");

        HashMap<String, ArrayList<String>> guardAndFootage = new HashMap<>();
        guardAndFootage.put(jessica.getName() + ": moments requested by law enforcement: ", footageTimeStamp);

        for (Map.Entry<String, ArrayList<String>> set : guardAndFootage.entrySet()) {
            logger.info(set.getKey());
        }

        return guardAndFootage;
    }

    private HashMap<String, Boolean> apprehendingViolators() {
        final SecurityGuard scarlett = new SecurityGuard("Scarlett");
        scarlett.setViolatorsCaught(true);

        HashMap<String, Boolean> violatorsCaught = new HashMap<>();
        violatorsCaught.put("All noted violators have been apprehended: ", scarlett.isViolatorsCaught());

        for (Map.Entry<String, Boolean> set : violatorsCaught.entrySet()) {
            logger.info(set.getKey());
        }

        return violatorsCaught;
    }

    private HashMap<String, Boolean> assetsLockedUp() {
        final SecurityGuard bruce = new SecurityGuard("Bruce");
        bruce.setAssetsSecured(true);

        HashMap<String, Boolean> assetsLockedUp = new HashMap<>();
        assetsLockedUp.put("All assets are locked up: ", bruce.isAssetsSecured());

        for (Map.Entry<String, Boolean> set : assetsLockedUp.entrySet()) {
            logger.info(set.getKey());
        }

        return assetsLockedUp;
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
