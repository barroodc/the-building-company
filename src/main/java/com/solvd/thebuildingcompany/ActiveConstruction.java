package com.solvd.thebuildingcompany;

import com.solvd.thebuildingcompany.contractors.residential.ResidentialContractor;
import com.solvd.thebuildingcompany.contractors.subcontractors.*;
import com.solvd.thebuildingcompany.interfaces.IBasement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ActiveConstruction implements IBasement  {
    private static Logger logger = LogManager.getLogger(ActiveConstruction.class);

    private void constructionSiteCleared() {

        try {
            DemolitionWorker nina = new DemolitionWorker("Nina", "XYZ Group");
            Method employeePunchedIn = DemolitionWorker.class.getDeclaredMethod("employeePunchIn");
            employeePunchedIn.setAccessible(true);
            employeePunchedIn.invoke(nina);
            logger.info(employeePunchedIn);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            DemolitionWorker janet = new DemolitionWorker("Janet", "XYZ Group");
            Method siteClearOfObstruction = DemolitionWorker.class.getDeclaredMethod("demolitionOfSite");
            siteClearOfObstruction.setAccessible(true);
            siteClearOfObstruction.invoke(janet);
            logger.info(siteClearOfObstruction);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void woodenFormsInstalled() {
        try {
            GeneralWorker jimmy = new GeneralWorker();
            Method woodenFormsInstallation = GeneralWorker.class.getDeclaredMethod("woodenFormInstallations");
            woodenFormsInstallation.setAccessible(true);
            woodenFormsInstallation.invoke(jimmy);
            logger.info(woodenFormsInstallation);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void basementBuilding() {

        try {
            ConcreteSpecialist cara = new ConcreteSpecialist("Cara", "NXE Group");
            Method concreteInTrenches = ConcreteSpecialist.class.getDeclaredMethod("mixAndPourConcrete");
            concreteInTrenches.setAccessible(true);
            concreteInTrenches.invoke(cara);
            logger.info(concreteInTrenches);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            ConcreteSpecialist jensen = new ConcreteSpecialist("Jensen", "NXE Group");
            Method dryingOfCement = ConcreteSpecialist.class.getDeclaredMethod("monitorDryingProcess");
            dryingOfCement.setAccessible(true);
            dryingOfCement.invoke(jensen);
            logger.info(jensen);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            ConcreteSpecialist reggie = new ConcreteSpecialist("Reggie", "NXE Group");
            Method postDryingProcess = ConcreteSpecialist.class.getDeclaredMethod("postDryingProcess");
            postDryingProcess.setAccessible(true);
            postDryingProcess.invoke(reggie);
            logger.info(postDryingProcess);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
           ConcreteSpecialist sebastian = new ConcreteSpecialist("Sebastian", "NXE Group");
           Method foundationFinalTouches = ConcreteSpecialist.class.getDeclaredMethod("foundationFinalSteps");
           foundationFinalTouches.setAccessible(true);
           foundationFinalTouches.invoke(sebastian);
           logger.info(foundationFinalTouches);
           Thread.sleep(2000);
           addBasement();
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InterruptedException e) {
            logger.error(e);
        }
    }

    private void flooringSystemSkeleton() {

        try {
            FloorLayer jenkins = new FloorLayer("Jenkins", "GHI Group");
            Method flooringRoots = FloorLayer.class.getDeclaredMethod("flooringSystemRoots");
            flooringRoots.setAccessible(true);
            flooringRoots.invoke(jenkins);
            logger.info(flooringRoots);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void wallsCompleted() {

        try {
            Carpenter joshua = new Carpenter("Joshua", "AYR Group");
            Method bareBonesWall = Carpenter.class.getDeclaredMethod("wallInstallationComplete");
            bareBonesWall.setAccessible(true);
            bareBonesWall.invoke(joshua);
            logger.info(bareBonesWall);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void roofInstallation() {

        try {
            Roofer ethan = new Roofer("Ethan", "ROF Group");
            Method roofingInstalled = Roofer.class.getDeclaredMethod("roofInstallationComplete");
            roofingInstalled.setAccessible(true);
            roofingInstalled.invoke(ethan);
            logger.info(roofingInstalled);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void pipingInstallation() {
        try {
          Plumber peach = new Plumber("Peach", "AZP Group");
          Method pipingInstall = Plumber.class.getDeclaredMethod("piping");
          pipingInstall.setAccessible(true);
          pipingInstall.invoke(peach);
          logger.info(pipingInstall);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void electricalInstallation() {
        try {
            Electrician frank = new Electrician("Frank","DEF Group");
            Method electricalWiringComplete = Electrician.class.getDeclaredMethod("installElectricalComponents");
            electricalWiringComplete.setAccessible(true);
            electricalWiringComplete.invoke(frank);
            logger.info(electricalWiringComplete);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void fiberglassAndDryWall() {
        try {
            DryWaller jerry = new DryWaller("Jerry", "YZW Group");
            Method rValueCalculation = DryWaller.class.getDeclaredMethod("rValueOfInsulation");
            Method fiberGlassAndDrywallInstall = DryWaller.class.getDeclaredMethod("fiberGlassAndDrywallInstall");
            rValueCalculation.setAccessible(true);
            fiberGlassAndDrywallInstall.setAccessible(true);
            rValueCalculation.invoke(jerry);
            fiberGlassAndDrywallInstall.invoke(jerry);
            logger.info(rValueCalculation);
            logger.info(fiberGlassAndDrywallInstall);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void brickFrontInstallation() {

        try {
            SidingContractor zachary = new SidingContractor("Zachary", "NAW Group");
            Method brickFrontInstalled = SidingContractor.class.getDeclaredMethod("installBrickSiding");
            brickFrontInstalled.setAccessible(true);
            brickFrontInstalled.invoke(zachary);
            logger.info(brickFrontInstalled);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void paintingTheRooms() {

        try {
           Painter ross = new Painter("Ross", "STU Group");
           Method paintingAllRooms = Painter.class.getDeclaredMethod("paintColorAndRoom");
           paintingAllRooms.setAccessible(true);
           paintingAllRooms.invoke(ross);
           logger.info(paintingAllRooms);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void applianceInstall() {
        try {
            ApplianceInstaller vanessa = new ApplianceInstaller("Vanessa", "WeInstallItAll");
            Method installAppliances = ApplianceInstaller.class.getDeclaredMethod("appliancesInstalled");
            installAppliances.setAccessible(true);
            installAppliances.invoke(vanessa);
            logger.info(installAppliances);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void stairCasesInstalled() {

        try {
          Joiner chris = new Joiner("Chris", "SOT Group");
          Method installStaircase = Joiner.class.getDeclaredMethod("buildingStairs");
          installStaircase.setAccessible(true);
          installStaircase.invoke(chris);
          logger.info(installStaircase);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
          logger.error(e);
        }
    }

    private void hardWoodFloorInstalled() {

        try {
          FloorLayer jeffery = new FloorLayer("Jeffery", "GHI Group");
          Method hardWoodFloorAdded = FloorLayer.class.getDeclaredMethod("hardwoodFloorInstalled");
          hardWoodFloorAdded.setAccessible(true);
          hardWoodFloorAdded.invoke(jeffery);
          logger.info(hardWoodFloorAdded);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
          logger.error(e);
        }
    }

    private void carpetInstalled() {

        try {
          FloorLayer penelope = new FloorLayer("Penelope", "GHI Group");
          Method carpetAdded = FloorLayer.class.getDeclaredMethod("carpetInstalled");
          carpetAdded.setAccessible(true);
          carpetAdded.invoke(penelope);
          logger.info(carpetAdded);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
          logger.error(e);
        }
    }

    private void HVACUnitInstalled() {

        try{
            HVACTechnician jackie = new HVACTechnician("Jackie", "MNO Group");
            Method hvacInstall = HVACTechnician.class.getDeclaredMethod("installationOfHVACUnit");
            hvacInstall.setAccessible(true);
            hvacInstall.invoke(jackie);
            logger.info(hvacInstall);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void lastMinuteInteriorInstalls() {

        try {
            ResidentialContractor jarvis = new ResidentialContractor("Jarvis", "PQR Group");
            Method mirrorAndShowerDoor = ResidentialContractor.class.getDeclaredMethod("lastMinuteInstallations");
            mirrorAndShowerDoor.setAccessible(true);
            mirrorAndShowerDoor.invoke(jarvis);
            logger.info(mirrorAndShowerDoor);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void cleanUpStage() {

        try {
          CleanupContractor david = new CleanupContractor("David", "ZWF Group");
          Method interiorCleaning = CleanupContractor.class.getDeclaredMethod("interiorCleanup");
          Method exteriorCleaning = CleanupContractor.class.getDeclaredMethod("exteriorCleanup");
          interiorCleaning.setAccessible(true);
          interiorCleaning.invoke(david);
          exteriorCleaning.setAccessible(true);
          exteriorCleaning.invoke(david);
          logger.info(interiorCleaning);
          logger.info(exteriorCleaning);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
           logger.error(e);
        }
    }

    private void landscapingStage() {

        try {
            LandScaper karl = new LandScaper("Karl", "NLX Group");
            Method plantingGreenery = LandScaper.class.getDeclaredMethod("plantTheGreenery");
            Method fertilizerAdded = LandScaper.class.getDeclaredMethod("applyFertilizer");
            plantingGreenery.setAccessible(true);
            plantingGreenery.invoke(karl);
            fertilizerAdded.setAccessible(true);
            fertilizerAdded.invoke(karl);
            logger.info(plantingGreenery);
            logger.info(fertilizerAdded);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    @Override
    public void addBasement() {
        logger.info("Basement added successfully");
        logger.info("Basement size: 28 feet by 34 feet");
    }
}
