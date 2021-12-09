package com.solvd.thebuildingcompany;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(final String[] args) {
        /*
        Order of classes accessed:
        Part 1: Pre-planning Stage:
         1.) Residential Architect
         2.) Interior Architect
         3.) Structural Engineer
         4.) Civil Engineer
         5.) Mechanical Engineer
         6.) Electrical Engineer
         7.) Plumbing Engineer
         8.) Construction Expeditor
         */

        try {
            //Intro to the company and the current project available to be worked on.
            final TheBuildingCompany introduction = new TheBuildingCompany();
            final Method aboutTheCompany = TheBuildingCompany.class.getDeclaredMethod("welcomeMessage");
            final Method currentLocations = TheBuildingCompany.class.getDeclaredMethod("ourOfficeLocations");
            final Method approvalStage = TheBuildingCompany.class.getDeclaredMethod("approvalStatusOfProjects");
            final Method specializedHomeBuilds = TheBuildingCompany.class.getDeclaredMethod("specializations");
            final Method locationAndName = TheBuildingCompany.class.getDeclaredMethod("locationAndNaming");
            aboutTheCompany.setAccessible(true);
            currentLocations.setAccessible(true);
            approvalStage.setAccessible(true);
            specializedHomeBuilds.setAccessible(true);
            locationAndName.setAccessible(true);
            aboutTheCompany.invoke(introduction);
            currentLocations.invoke(introduction);
            approvalStage.invoke(introduction);
            specializedHomeBuilds.invoke(introduction);
            locationAndName.invoke(introduction);

            logger.info(aboutTheCompany);
            logger.info(currentLocations);
            logger.info(approvalStage);
            logger.info(specializedHomeBuilds);
            logger.info(locationAndName);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }


        try {
            final PreConstructionPlanning architectMeeting = new PreConstructionPlanning();
            final Method initialProjectTalks = PreConstructionPlanning.class.getDeclaredMethod("architectsPlanAndMeet");
            initialProjectTalks.setAccessible(true);
            initialProjectTalks.invoke(architectMeeting);
            logger.info(initialProjectTalks);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final PreConstructionPlanning engineerMeeting = new PreConstructionPlanning();
            final Method initialProjectTalks = PreConstructionPlanning.class.getDeclaredMethod("engineersMeet");
            initialProjectTalks.setAccessible(true);
            initialProjectTalks.invoke(engineerMeeting);
            logger.info(initialProjectTalks);
        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final PreConstructionPlanning civilEngineerSitePlan = new PreConstructionPlanning();
            final Method prePlanningSite = PreConstructionPlanning.class.getDeclaredMethod("civilEngineerPrePlanning");
            prePlanningSite.setAccessible(true);
            prePlanningSite.invoke(civilEngineerSitePlan);
            logger.info(prePlanningSite);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final PreConstructionPlanning electricalSystemPlan = new PreConstructionPlanning();
            final Method electricalDesign = PreConstructionPlanning.class.getDeclaredMethod("electricalSystemPlanning");
            electricalDesign.setAccessible(true);
            electricalDesign.invoke(electricalSystemPlan);
            logger.info(electricalSystemPlan);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final PreConstructionPlanning hVACSystemDesign = new PreConstructionPlanning();
            final Method hVACDesign = PreConstructionPlanning.class.getDeclaredMethod("hVACSystemDesignStage");
            hVACDesign.setAccessible(true);
            hVACDesign.invoke(hVACSystemDesign);
            logger.info(hVACDesign);
        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final PreConstructionPlanning plumbingDesignStage = new PreConstructionPlanning();
            final Method plumbingDesign = PreConstructionPlanning.class.getDeclaredMethod("plumbingDesigns");
            plumbingDesign.setAccessible(true);
            plumbingDesign.invoke(plumbingDesignStage);
            logger.info(plumbingDesign);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final PreConstructionPlanning developmentLeadership = new PreConstructionPlanning();
            final Method developmentAssigned = PreConstructionPlanning.class.getDeclaredMethod("assignedDevelopments");
            developmentAssigned.setAccessible(true);
            developmentAssigned.invoke(developmentLeadership);
            logger.info(developmentAssigned);
        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final PreConstructionPlanning timeToCompleteNJProject = new PreConstructionPlanning();
            final Method completionOfProject = PreConstructionPlanning.class.getDeclaredMethod("estimatedCompletion");
            completionOfProject.setAccessible(true);
            completionOfProject.invoke(timeToCompleteNJProject);
            logger.info(completionOfProject);
        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final PreConstructionPlanning initialSitePreparations = new PreConstructionPlanning();
            final Method preppingSite = PreConstructionPlanning.class.getDeclaredMethod("initialSitePreparations");
            preppingSite.setAccessible(true);
            preppingSite.invoke(initialSitePreparations);
            logger.info(preppingSite);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e){
            logger.error(e);
        }

        try {
            final PreConstructionPlanning orderingTheItems = new PreConstructionPlanning();
            final Method itemsOrderedList = PreConstructionPlanning.class.getDeclaredMethod("materialsForProject");
            itemsOrderedList.setAccessible(true);
            itemsOrderedList.invoke(orderingTheItems);
            logger.info(itemsOrderedList);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final PreConstructionPlanning subContractorsHired = new PreConstructionPlanning();
            final Method brandNewSubContractors = PreConstructionPlanning.class.getDeclaredMethod("contractorsHired");
            brandNewSubContractors.setAccessible(true);
            brandNewSubContractors.invoke(subContractorsHired);
            logger.info(brandNewSubContractors);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final ActiveConstruction demolition = new ActiveConstruction();
            final Method siteClearedOfObstructions = ActiveConstruction.class.getDeclaredMethod("constructionSiteCleared");
            siteClearedOfObstructions.setAccessible(true);
            siteClearedOfObstructions.invoke(demolition);
            logger.info(siteClearedOfObstructions);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final ActiveConstruction woodFormsInstalled = new ActiveConstruction();
            final Method woodenForms = ActiveConstruction.class.getDeclaredMethod("woodenFormsInstalled");
            woodenForms.setAccessible(true);
            woodenForms.invoke(woodFormsInstalled);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e){
            logger.error(e);
        }


        try {
            final ActiveConstruction basementConcretePoured = new ActiveConstruction();
            final Method concreteInTrenches = ActiveConstruction.class.getDeclaredMethod("basementBuilding");
            concreteInTrenches.setAccessible(true);
            concreteInTrenches.invoke(basementConcretePoured);
            logger.info(concreteInTrenches);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final Inspections foundationInspected = new Inspections();
            final Method foundationUpToCode = Inspections.class.getDeclaredMethod("foundationInspection");
            foundationUpToCode.setAccessible(true);
            foundationUpToCode.invoke(foundationInspected);
            logger.info(foundationUpToCode);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final ActiveConstruction flooringSkeleton = new ActiveConstruction();
            final Method flooringRoots = ActiveConstruction.class.getDeclaredMethod("flooringSystemSkeleton");
            flooringRoots.setAccessible(true);
            flooringRoots.invoke(flooringSkeleton);
            logger.info(flooringRoots);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final ActiveConstruction wallCompleted = new ActiveConstruction();
            final Method bareWall = ActiveConstruction.class.getDeclaredMethod("wallsCompleted");
           bareWall.setAccessible(true);
           bareWall.invoke(wallCompleted);
           logger.info(bareWall);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final ActiveConstruction roofingInstallation = new ActiveConstruction();
            final Method roofingInstallComplete = ActiveConstruction.class.getDeclaredMethod("roofInstallation");
            roofingInstallComplete.setAccessible(true);
            roofingInstallComplete.invoke(roofingInstallation);
            logger.info(roofingInstallComplete);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final ActiveConstruction pipingInstallation = new ActiveConstruction();
            final Method pipingInstall = ActiveConstruction.class.getDeclaredMethod("pipingInstallation");
           pipingInstall.setAccessible(true);
           pipingInstall.invoke(pipingInstallation);
           logger.info(pipingInstall);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final ActiveConstruction electricalWorkInstalled = new ActiveConstruction();
            final Method electricalWiring = ActiveConstruction.class.getDeclaredMethod("electricalInstallation");
            electricalWiring.setAccessible(true);
            electricalWiring.invoke(electricalWorkInstalled);
            logger.info(electricalWiring);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final Inspections plumbingInspected = new Inspections();
            final Method plumbingInspection = Inspections.class.getDeclaredMethod("plumbingInspection");
           plumbingInspection.setAccessible(true);
           plumbingInspection.invoke(plumbingInspected);
           logger.info(plumbingInspection);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final Inspections electricalInspected = new Inspections();
            final Method electricalInspection = Inspections.class.getDeclaredMethod("electricalInspection");
          electricalInspection.setAccessible(true);
          electricalInspection.invoke(electricalInspected);
          logger.info(electricalInspection);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
           logger.error(e);
        }

        try {
            final Inspections mechanicalSystemsInspected = new Inspections();
            final Method mechanicalSystemsInspection = Inspections.class.getDeclaredMethod("mechanicalInspection");
          mechanicalSystemsInspection.setAccessible(true);
          mechanicalSystemsInspection.invoke(mechanicalSystemsInspected);
          logger.info(mechanicalSystemsInspection);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final ActiveConstruction fiberglassAndDrywall = new ActiveConstruction();
            final Method rValueCalculation = ActiveConstruction.class.getDeclaredMethod("fiberglassAndDryWall");
           rValueCalculation.setAccessible(true);
           rValueCalculation.invoke(fiberglassAndDrywall);
           logger.info(rValueCalculation);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final ActiveConstruction brickSidingAdded = new ActiveConstruction();
            final Method brickFrontInstalled = ActiveConstruction.class.getDeclaredMethod("brickFrontInstallation");
         brickFrontInstalled.setAccessible(true);
         brickFrontInstalled.invoke(brickSidingAdded);
         logger.info(brickFrontInstalled);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
         logger.error(e);
        }

        try {
            final ActiveConstruction paintingTheRooms = new ActiveConstruction();
            final Method paintingAllRooms = ActiveConstruction.class.getDeclaredMethod("paintingTheRooms");
          paintingAllRooms.setAccessible(true);
          paintingAllRooms.invoke(paintingTheRooms);
          logger.info(paintingAllRooms);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
          logger.error(e);
        }

        try {
            final ActiveConstruction installingAppliances = new ActiveConstruction();
            final Method appliancesAdded = ActiveConstruction.class.getDeclaredMethod("applianceInstall");
          appliancesAdded.setAccessible(true);
          appliancesAdded.invoke(installingAppliances);
          logger.info(appliancesAdded);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
           logger.error(e);
        }

        try {
            final ActiveConstruction stairCaseInstall = new ActiveConstruction();
            final Method stairCasesAdded = ActiveConstruction.class.getDeclaredMethod("stairCasesInstalled");
          stairCasesAdded.setAccessible(true);
          stairCasesAdded.invoke(stairCaseInstall);
          logger.info(stairCasesAdded);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
           logger.error(e);
        }

        try {
            final ActiveConstruction hardWoodFloorInstall = new ActiveConstruction();
            final Method hardWoodFloorAdded = ActiveConstruction.class.getDeclaredMethod("hardWoodFloorInstalled");
          hardWoodFloorAdded.setAccessible(true);
          hardWoodFloorAdded.invoke(hardWoodFloorInstall);
          logger.info(hardWoodFloorAdded);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
           logger.error(e);
        }

        try {
            final ActiveConstruction carpetInstallation = new ActiveConstruction();
            final Method carpetAdded = ActiveConstruction.class.getDeclaredMethod("carpetInstalled");
          carpetAdded.setAccessible(true);
          carpetAdded.invoke(carpetInstallation);
          logger.info(carpetAdded);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
          logger.error(e);
        }

        try {
            final Inspections drainageZoneCheck = new Inspections();
            final Method propertyDrainageCheck = Inspections.class.getDeclaredMethod("propertyDrainageCheck");
            propertyDrainageCheck.setAccessible(true);
            propertyDrainageCheck.invoke(drainageZoneCheck);
            logger.info(propertyDrainageCheck);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final Inspections foundationAreaCheck = new Inspections();
            final Method levelingNeededCheck = Inspections.class.getDeclaredMethod("foundationAreaCheck");
          levelingNeededCheck.setAccessible(true);
          levelingNeededCheck.invoke(foundationAreaCheck);
          logger.info(levelingNeededCheck);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
           logger.error(e);
        }

        try {
            final Inspections electricalPanelEvaluation = new Inspections();
            final Method electricalPanelCheck = Inspections.class.getDeclaredMethod("electricalPanelInspection");
          electricalPanelCheck.setAccessible(true);
          electricalPanelCheck.invoke(electricalPanelEvaluation);
          logger.info(electricalPanelCheck);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
           logger.error(e);
        }

        try {
            final ActiveConstruction hvacInstallationStage = new ActiveConstruction();
            final Method hvacInstall = ActiveConstruction.class.getDeclaredMethod("HVACUnitInstalled");
          hvacInstall.setAccessible(true);
          hvacInstall.invoke(hvacInstallationStage);
          logger.info(hvacInstall);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
           logger.error(e);
        }

        try {
            final ActiveConstruction lastMinuteInteriorInstallations = new ActiveConstruction();
            final Method mirrorAndShowerDoor = ActiveConstruction.class.getDeclaredMethod("lastMinuteInteriorInstalls");
            mirrorAndShowerDoor.setAccessible(true);
            mirrorAndShowerDoor.invoke(lastMinuteInteriorInstallations);
            logger.info(mirrorAndShowerDoor);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final ActiveConstruction propertyCleaning = new ActiveConstruction();
            final Method interiorAndExteriorCleaned = ActiveConstruction.class.getDeclaredMethod("cleanUpStage");
          interiorAndExteriorCleaned.setAccessible(true);
          interiorAndExteriorCleaned.invoke(propertyCleaning);
          logger.info(interiorAndExteriorCleaned);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
           logger.error(e);
        }

        try {
            final ActiveConstruction landscaping = new ActiveConstruction();
            final Method greeneryAndFertilizer = ActiveConstruction.class.getDeclaredMethod("landscapingStage");
          greeneryAndFertilizer.setAccessible(true);
          greeneryAndFertilizer.invoke(landscaping);
          logger.info(greeneryAndFertilizer);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
           logger.error(e);
        }

        try {
            final Inspections lastInspection = new Inspections();
            final Method lastWalkThrough = Inspections.class.getDeclaredMethod("lastInspection");
         lastWalkThrough.setAccessible(true);
         lastWalkThrough.invoke(lastInspection);
         logger.info(lastWalkThrough);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
          logger.error(e);
        }
    }
}
