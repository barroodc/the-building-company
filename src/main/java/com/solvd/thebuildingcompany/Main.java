package com.solvd.thebuildingcompany;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.solvd.thebuildingcompany.contractors.subcontractors.ConcreteSpecialist;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Main {

    private static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
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
            TheBuildingCompany introduction = new TheBuildingCompany();
            Method aboutTheCompany = TheBuildingCompany.class.getDeclaredMethod("welcomeMessage");
            Method currentLocations = TheBuildingCompany.class.getDeclaredMethod("ourOfficeLocations");
            Method approvalStage = TheBuildingCompany.class.getDeclaredMethod("approvalStatusOfProjects");
            Method specializedHomeBuilds = TheBuildingCompany.class.getDeclaredMethod("specializations");
            Method locationAndName = TheBuildingCompany.class.getDeclaredMethod("locationAndNaming");
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
            PreConstructionPlanning architectMeeting = new PreConstructionPlanning();
            Method initialProjectTalks = PreConstructionPlanning.class.getDeclaredMethod("architectsPlanAndMeet");
            initialProjectTalks.setAccessible(true);
            initialProjectTalks.invoke(architectMeeting);
            logger.info(initialProjectTalks);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            PreConstructionPlanning engineerMeeting = new PreConstructionPlanning();
            Method initialProjectTalks = PreConstructionPlanning.class.getDeclaredMethod("engineersMeet");
            initialProjectTalks.setAccessible(true);
            initialProjectTalks.invoke(engineerMeeting);
            logger.info(initialProjectTalks);
        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            PreConstructionPlanning civilEngineerSitePlan = new PreConstructionPlanning();
            Method prePlanningSite = PreConstructionPlanning.class.getDeclaredMethod("civilEngineerPrePlanning");
            prePlanningSite.setAccessible(true);
            prePlanningSite.invoke(civilEngineerSitePlan);
            logger.info(prePlanningSite);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            PreConstructionPlanning electricalSystemPlan = new PreConstructionPlanning();
            Method electricalDesign = PreConstructionPlanning.class.getDeclaredMethod("electricalSystemPlanning");
            electricalDesign.setAccessible(true);
            electricalDesign.invoke(electricalSystemPlan);
            logger.info(electricalSystemPlan);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            PreConstructionPlanning hVACSystemDesign = new PreConstructionPlanning();
            Method hVACDesign = PreConstructionPlanning.class.getDeclaredMethod("hVACSystemDesignStage");
            hVACDesign.setAccessible(true);
            hVACDesign.invoke(hVACSystemDesign);
            logger.info(hVACDesign);

        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            PreConstructionPlanning plumbingDesignStage = new PreConstructionPlanning();
            Method plumbingDesign = PreConstructionPlanning.class.getDeclaredMethod("plumbingDesigns");
            plumbingDesign.setAccessible(true);
            plumbingDesign.invoke(plumbingDesignStage);
            logger.info(plumbingDesign);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            PreConstructionPlanning developmentLeadership = new PreConstructionPlanning();
            Method developmentAssigned = PreConstructionPlanning.class.getDeclaredMethod("assignedDevelopments");
            developmentAssigned.setAccessible(true);
            developmentAssigned.invoke(developmentLeadership);
            logger.info(developmentAssigned);
        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            PreConstructionPlanning timeToCompleteNJProject = new PreConstructionPlanning();
            Method completionOfProject = PreConstructionPlanning.class.getDeclaredMethod("estimatedCompletion");
            completionOfProject.setAccessible(true);
            completionOfProject.invoke(timeToCompleteNJProject);
            logger.info(completionOfProject);

        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            PreConstructionPlanning initialSitePreparations = new PreConstructionPlanning();
            Method preppingSite = PreConstructionPlanning.class.getDeclaredMethod("initialSitePreparations");
            preppingSite.setAccessible(true);
            preppingSite.invoke(initialSitePreparations);
            logger.info(preppingSite);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e){
            logger.error(e);
        }

        try {
            PreConstructionPlanning orderingTheItems = new PreConstructionPlanning();
            Method itemsOrderedList = PreConstructionPlanning.class.getDeclaredMethod("materialsForProject");
            itemsOrderedList.setAccessible(true);
            itemsOrderedList.invoke(orderingTheItems);
            logger.info(itemsOrderedList);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            PreConstructionPlanning subContractorsHired = new PreConstructionPlanning();
            Method brandNewSubContractors = PreConstructionPlanning.class.getDeclaredMethod("contractorsHired");
            brandNewSubContractors.setAccessible(true);
            brandNewSubContractors.invoke(subContractorsHired);
            logger.info(brandNewSubContractors);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            ActiveConstruction demolition = new ActiveConstruction();
            Method siteClearedOfObstructions = ActiveConstruction.class.getDeclaredMethod("constructionSiteCleared");
            siteClearedOfObstructions.setAccessible(true);
            siteClearedOfObstructions.invoke(demolition);
            logger.info(siteClearedOfObstructions);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            ActiveConstruction woodFormsInstalled = new ActiveConstruction();
            Method woodenForms = ActiveConstruction.class.getDeclaredMethod("woodenFormsInstalled");
            woodenForms.setAccessible(true);
            woodenForms.invoke(woodFormsInstalled);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e){
            logger.error(e);
        }


        try {
            ActiveConstruction basementConcretePoured = new ActiveConstruction();
            Method concreteInTrenches = ActiveConstruction.class.getDeclaredMethod("basementBuilding");
            concreteInTrenches.setAccessible(true);
            concreteInTrenches.invoke(basementConcretePoured);
            logger.info(concreteInTrenches);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            Inspections foundationInspected = new Inspections();
            Method foundationUpToCode = Inspections.class.getDeclaredMethod("foundationInspection");
            foundationUpToCode.setAccessible(true);
            foundationUpToCode.invoke(foundationInspected);
            logger.info(foundationUpToCode);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            ActiveConstruction flooringSkeleton = new ActiveConstruction();
            Method flooringRoots = ActiveConstruction.class.getDeclaredMethod("flooringSystemSkeleton");
            flooringRoots.setAccessible(true);
            flooringRoots.invoke(flooringSkeleton);
            logger.info(flooringRoots);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
           ActiveConstruction wallCompleted = new ActiveConstruction();
           Method bareWall = ActiveConstruction.class.getDeclaredMethod("wallsCompleted");
           bareWall.setAccessible(true);
           bareWall.invoke(wallCompleted);
           logger.info(bareWall);
           Thread.sleep(5000);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InterruptedException e) {
            logger.error(e);
        }

        try {
            ActiveConstruction roofingInstallation = new ActiveConstruction();
            Method roofingInstallComplete = ActiveConstruction.class.getDeclaredMethod("roofInstallation");
            roofingInstallComplete.setAccessible(true);
            roofingInstallComplete.invoke(roofingInstallation);
            logger.info(roofingInstallComplete);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
           ActiveConstruction pipingInstallation = new ActiveConstruction();
           Method pipingInstall = ActiveConstruction.class.getDeclaredMethod("pipingInstallation");
           pipingInstall.setAccessible(true);
           pipingInstall.invoke(pipingInstallation);
           logger.info(pipingInstall);
           Thread.sleep(5000);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InterruptedException e) {
            logger.error(e);
        }

        try {
            ActiveConstruction electricalWorkInstalled = new ActiveConstruction();
            Method electricalWiring = ActiveConstruction.class.getDeclaredMethod("electricalInstallation");
            electricalWiring.setAccessible(true);
            electricalWiring.invoke(electricalWorkInstalled);
            logger.info(electricalWiring);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
           Inspections plumbingInspected = new Inspections();
           Method plumbingInspection = Inspections.class.getDeclaredMethod("plumbingInspection");
           plumbingInspection.setAccessible(true);
           plumbingInspection.invoke(plumbingInspected);
           logger.info(plumbingInspection);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
          Inspections electricalInspected = new Inspections();
          Method electricalInspection = Inspections.class.getDeclaredMethod("electricalInspection");
          electricalInspection.setAccessible(true);
          electricalInspection.invoke(electricalInspected);
          logger.info(electricalInspection);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
           logger.error(e);
        }

        try {
          Inspections mechanicalSystemsInspected = new Inspections();
          Method mechanicalSystemsInspection = Inspections.class.getDeclaredMethod("mechanicalInspection");
          mechanicalSystemsInspection.setAccessible(true);
          mechanicalSystemsInspection.invoke(mechanicalSystemsInspected);
          logger.info(mechanicalSystemsInspection);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
           ActiveConstruction fiberglassAndDrywall = new ActiveConstruction();
           Method rValueCalculation = ActiveConstruction.class.getDeclaredMethod("fiberglassAndDryWall");
           rValueCalculation.setAccessible(true);
           rValueCalculation.invoke(fiberglassAndDrywall);
           logger.info(rValueCalculation);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
         ActiveConstruction brickSidingAdded = new ActiveConstruction();
         Method brickFrontInstalled = ActiveConstruction.class.getDeclaredMethod("brickFrontInstallation");
         brickFrontInstalled.setAccessible(true);
         brickFrontInstalled.invoke(brickSidingAdded);
         logger.info(brickFrontInstalled);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
         logger.error(e);
        }

    }
}
