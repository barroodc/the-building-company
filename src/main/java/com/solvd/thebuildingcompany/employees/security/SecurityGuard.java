package com.solvd.thebuildingcompany.employees.security;

import com.solvd.thebuildingcompany.departments.Security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class SecurityGuard extends Security {

    private final Logger logger = Logger.getLogger(SecurityGuard.class.getName());

    public SecurityGuard(String name) {
        this.setName(name);
    }

    @Override
    protected HashMap<String, Boolean> securitySystemInstallation() {
        final SecurityGuard rodger = new SecurityGuard("Rodger");
        rodger.setCamerasInstalled(true);

        HashMap<String, Boolean> securityInstallation = new HashMap<>();
        securityInstallation.put("Security Cameras Installed", rodger.isCamerasInstalled());

        for (Map.Entry<String, Boolean> set : securityInstallation.entrySet()) {
            logger.info(set.getKey());
        }

        return securityInstallation;
    }

    @Override
    protected HashMap<String, Integer> patrol() {
        final SecurityGuard alex = new SecurityGuard("Alex");
        alex.setOfficersPatrolling(5);

        HashMap<String, Integer> officersPatrolling = new HashMap<>();
        officersPatrolling.put("Number of officers patrolling New York site", alex.getOfficersPatrolling());

        for (Map.Entry<String, Integer> set : officersPatrolling.entrySet()) {
            logger.info(set.getKey());
        }

        return officersPatrolling;
    }

    @Override
    protected HashMap<String, Boolean> firstResponderCommunications() {
        final SecurityGuard samuel = new SecurityGuard("Samuel");
        samuel.setWorkingPhone(true);

        HashMap<String, Boolean> deviceInspected = new HashMap<>();

        deviceInspected.put(samuel.getName() + "performed phone test with first responders", samuel.isWorkingPhone());

        for (Map.Entry<String, Boolean> set : deviceInspected.entrySet()) {
            logger.info(set.getKey());
        }

        return deviceInspected;
    }

    @Override
    protected String monitoringAccess() {
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

    @Override
    protected HashMap<String, String> signage() {
        final SecurityGuard dean = new SecurityGuard("Dean");
        dean.setCorrectSignagePlaced(true);

        HashMap<String, String> guardAndSignage = new HashMap<>();
        guardAndSignage.put(dean.getName(), "Appropriate Signage placed");

        for (Map.Entry<String, String> set : guardAndSignage.entrySet()) {
            logger.info(set.getKey());
        }

        return guardAndSignage;
    }

    @Override
    protected HashMap<String, Boolean> gpsTrackingOfAssets() {
        final SecurityGuard amanda = new SecurityGuard("Amanda");
        amanda.setGpsOnTopAssets(true);

        HashMap<String, Boolean> guardAndAssetTracking = new HashMap<>();
        guardAndAssetTracking.put(amanda.getName() + ": all high value assets have tracking software installed", amanda.isGpsOnTopAssets());

        for (Map.Entry<String, Boolean> set : guardAndAssetTracking.entrySet()) {
            logger.info(set.getKey());
        }

        return guardAndAssetTracking;
    }

    @Override
    protected HashMap<String, ArrayList<String>> analyzeSecurityFootage() {
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

    @Override
    protected HashMap<String, Boolean> apprehendingViolators() {
        final SecurityGuard scarlett = new SecurityGuard("Scarlett");
        scarlett.setViolatorsCaught(true);

        HashMap<String, Boolean> violatorsCaught = new HashMap<>();
        violatorsCaught.put("All noted violators have been apprehended: ", scarlett.isViolatorsCaught());

        for (Map.Entry<String, Boolean> set : violatorsCaught.entrySet()) {
            logger.info(set.getKey());
        }

        return violatorsCaught;
    }

    @Override
    protected HashMap<String, Boolean> assetsLockedUp() {
        final SecurityGuard bruce = new SecurityGuard("Bruce");
        bruce.setAssetsSecured(true);

        HashMap<String, Boolean> assetsLockedUp = new HashMap<>();
        assetsLockedUp.put("All assets are locked up: ", bruce.isAssetsSecured());

        for (Map.Entry<String, Boolean> set : assetsLockedUp.entrySet()) {
            logger.info(set.getKey());
        }

        return assetsLockedUp;
    }
}
