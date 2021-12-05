package com.solvd.thebuildingcompany;

import com.solvd.thebuildingcompany.contractors.residential.ResidentialContractor;
import com.solvd.thebuildingcompany.contractors.subcontractors.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ActiveConstruction {
    private static final Logger logger = LogManager.getLogger(ActiveConstruction.class);

    public ActiveConstruction() {

    }

    private void constructionSiteCleared() {

        try {
            final DemolitionWorker janet = new DemolitionWorker("Janet", "XYZ Group");
            final Method siteClearOfObstruction = DemolitionWorker.class.getDeclaredMethod("demolitionOfSite");
            siteClearOfObstruction.setAccessible(true);
            siteClearOfObstruction.invoke(janet);
            logger.info(siteClearOfObstruction);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void woodenFormsInstalled() {
        try {
            final GeneralWorker jimmy = new GeneralWorker();
            final Method woodenFormsInstallation = GeneralWorker.class.getDeclaredMethod("woodenFormInstallations");
            woodenFormsInstallation.setAccessible(true);
            woodenFormsInstallation.invoke(jimmy);
            logger.info(woodenFormsInstallation);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void basementBuilding() {

        try {
            final ConcreteSpecialist cara = new ConcreteSpecialist("Cara", "NXE Group");
            final Method concreteInTrenches = ConcreteSpecialist.class.getDeclaredMethod("mixAndPourConcrete");
            concreteInTrenches.setAccessible(true);
            concreteInTrenches.invoke(cara);
            logger.info(concreteInTrenches);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final ConcreteSpecialist jensen = new ConcreteSpecialist("Jensen", "NXE Group");
            final Method dryingOfCement = ConcreteSpecialist.class.getDeclaredMethod("monitorDryingProcess");
            dryingOfCement.setAccessible(true);
            dryingOfCement.invoke(jensen);
            logger.info(jensen);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final ConcreteSpecialist reggie = new ConcreteSpecialist("Reggie", "NXE Group");
            final Method postDryingProcess = ConcreteSpecialist.class.getDeclaredMethod("postDryingProcess");
            postDryingProcess.setAccessible(true);
            postDryingProcess.invoke(reggie);
            logger.info(postDryingProcess);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
           final ConcreteSpecialist sebastian = new ConcreteSpecialist("Sebastian", "NXE Group");
           final Method foundationFinalTouches = ConcreteSpecialist.class.getDeclaredMethod("foundationFinalSteps");
           foundationFinalTouches.setAccessible(true);
           foundationFinalTouches.invoke(sebastian);
           logger.info(foundationFinalTouches);
           Thread.sleep(2000);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InterruptedException e) {
            logger.error(e);
        }
    }

    private void flooringSystemSkeleton() {

        try {
            final FloorLayer jenkins = new FloorLayer("Jenkins", "GHI Group");
            final Method flooringRoots = FloorLayer.class.getDeclaredMethod("flooringSystemRoots");
            flooringRoots.setAccessible(true);
            flooringRoots.invoke(jenkins);
            logger.info(flooringRoots);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void wallsCompleted() {

        try {
            final Carpenter joshua = new Carpenter("Joshua", "AYR Group");
            final Method bareBonesWall = Carpenter.class.getDeclaredMethod("wallInstallationComplete");
            bareBonesWall.setAccessible(true);
            bareBonesWall.invoke(joshua);
            logger.info(bareBonesWall);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void roofInstallation() {

        try {
            final Roofer ethan = new Roofer("Ethan", "ROF Group");
            final Method roofingInstalled = Roofer.class.getDeclaredMethod("roofInstallationComplete");
            roofingInstalled.setAccessible(true);
            roofingInstalled.invoke(ethan);
            logger.info(roofingInstalled);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void pipingInstallation() {
        try {
          final Plumber peach = new Plumber("Peach", "AZP Group");
          final Method pipingInstall = Plumber.class.getDeclaredMethod("piping");
          pipingInstall.setAccessible(true);
          pipingInstall.invoke(peach);
          logger.info(pipingInstall);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void electricalInstallation() {
        try {
            final Electrician frank = new Electrician("Frank","DEF Group");
            final Method electricalWiringComplete = Electrician.class.getDeclaredMethod("installElectricalComponents");
            electricalWiringComplete.setAccessible(true);
            electricalWiringComplete.invoke(frank);
            logger.info(electricalWiringComplete);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void fiberglassAndDryWall() {
        try {
            final DryWaller jerry = new DryWaller("Jerry", "YZW Group");
            final Method rValueCalculation = DryWaller.class.getDeclaredMethod("rValueOfInsulation");
            final Method fiberGlassAndDrywallInstall = DryWaller.class.getDeclaredMethod("fiberGlassAndDrywallInstall");
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
            final SidingContractor zachary = new SidingContractor("Zachary", "NAW Group");
            final Method brickFrontInstalled = SidingContractor.class.getDeclaredMethod("installBrickSiding");
            brickFrontInstalled.setAccessible(true);
            brickFrontInstalled.invoke(zachary);
            logger.info(brickFrontInstalled);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void paintingTheRooms() {

        try {
           final Painter ross = new Painter("Ross", "STU Group");
           final Method paintingAllRooms = Painter.class.getDeclaredMethod("paintColorAndRoom");
           paintingAllRooms.setAccessible(true);
           paintingAllRooms.invoke(ross);
           logger.info(paintingAllRooms);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void applianceInstall() {
        try {
            final ApplianceInstaller vanessa = new ApplianceInstaller("Vanessa", "WeInstallItAll");
            final Method installAppliances = ApplianceInstaller.class.getDeclaredMethod("appliancesInstalled");
            installAppliances.setAccessible(true);
            installAppliances.invoke(vanessa);
            logger.info(installAppliances);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void stairCasesInstalled() {

        try {
          final Joiner chris = new Joiner("Chris", "SOT Group");
          final Method installStaircase = Joiner.class.getDeclaredMethod("buildingStairs");
          installStaircase.setAccessible(true);
          installStaircase.invoke(chris);
          logger.info(installStaircase);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
          logger.error(e);
        }
    }

    private void hardWoodFloorInstalled() {

        try {
          final FloorLayer jeffery = new FloorLayer("Jeffery", "GHI Group");
          final Method hardWoodFloorAdded = FloorLayer.class.getDeclaredMethod("hardwoodFloorInstalled");
          hardWoodFloorAdded.setAccessible(true);
          hardWoodFloorAdded.invoke(jeffery);
          logger.info(hardWoodFloorAdded);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
          logger.error(e);
        }
    }

    private void carpetInstalled() {

        try {
          final FloorLayer penelope = new FloorLayer("Penelope", "GHI Group");
          final Method carpetAdded = FloorLayer.class.getDeclaredMethod("carpetInstalled");
          carpetAdded.setAccessible(true);
          carpetAdded.invoke(penelope);
          logger.info(carpetAdded);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
          logger.error(e);
        }
    }

    private void HVACUnitInstalled() {

        try{
            final HVACTechnician jackie = new HVACTechnician("Jackie", "MNO Group");
            final Method hvacInstall = HVACTechnician.class.getDeclaredMethod("installationOfHVACUnit");
            hvacInstall.setAccessible(true);
            hvacInstall.invoke(jackie);
            logger.info(hvacInstall);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void lastMinuteInteriorInstalls() {

        try {
            final ResidentialContractor jarvis = new ResidentialContractor("Jarvis", "PQR Group");
            final Method mirrorAndShowerDoor = ResidentialContractor.class.getDeclaredMethod("lastMinuteInstallations");
            mirrorAndShowerDoor.setAccessible(true);
            mirrorAndShowerDoor.invoke(jarvis);
            logger.info(mirrorAndShowerDoor);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void cleanUpStage() {

        try {
          final CleanupContractor david = new CleanupContractor("David", "ZWF Group");
          final Method interiorCleaning = CleanupContractor.class.getDeclaredMethod("interiorCleanup");
          final Method exteriorCleaning = CleanupContractor.class.getDeclaredMethod("exteriorCleanup");
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
            final LandScaper karl = new LandScaper("Karl", "NLX Group");
            final Method plantingGreenery = LandScaper.class.getDeclaredMethod("plantTheGreenery");
            final Method fertilizerAdded = LandScaper.class.getDeclaredMethod("applyFertilizer");
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
}
