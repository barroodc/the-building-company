package com.solvd.thebuildingcompany;

import com.solvd.thebuildingcompany.contractors.residential.ResidentialContractor;
import com.solvd.thebuildingcompany.employees.departments.architecture.InteriorArchitect;
import com.solvd.thebuildingcompany.employees.departments.architecture.ResidentialArchitect;
import com.solvd.thebuildingcompany.employees.departments.businessdevelopment.BusinessDeveloper;
import com.solvd.thebuildingcompany.employees.departments.engineering.*;
import com.solvd.thebuildingcompany.employees.departments.management.CivilSupervisor;
import com.solvd.thebuildingcompany.employees.departments.management.ProjectManager;
import com.solvd.thebuildingcompany.employees.departments.materialpurchasing.ConstructionExpeditor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class PreConstructionPlanning {
    private static Logger logger = LogManager.getLogger(PreConstructionPlanning.class);

    private void architectsPlanAndMeet() {

        try {
            ResidentialArchitect jane = new ResidentialArchitect("Jane");
            Method projectDiscussions = ResidentialArchitect.class.getDeclaredMethod("projectDiscussions");
            projectDiscussions.setAccessible(true);
            projectDiscussions.invoke(jane);
            logger.info(projectDiscussions);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            InteriorArchitect happy = new InteriorArchitect("Happy");
            Method projectDiscussions = InteriorArchitect.class.getDeclaredMethod("projectDiscussions");
            projectDiscussions.setAccessible(true);
            projectDiscussions.invoke(happy);
            logger.info(projectDiscussions);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e){
            logger.error(e);
        }

        try {
            ResidentialArchitect brendan = new ResidentialArchitect("Brendan");
            Method bluePrintPlanning = ResidentialArchitect.class.getDeclaredMethod("documentationAndDrawings");
            bluePrintPlanning.setAccessible(true);
            bluePrintPlanning.invoke(brendan);
            logger.info(bluePrintPlanning);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            InteriorArchitect james = new InteriorArchitect("James");
            Method bluePrintPlanning = InteriorArchitect.class.getDeclaredMethod("documentationAndDrawings");
            bluePrintPlanning.setAccessible(true);
            bluePrintPlanning.invoke(james);
            logger.info(bluePrintPlanning);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void engineersMeet() {

        try {
            CivilEngineer lana = new CivilEngineer("Lana");
            Method projectDiscussions = CivilEngineer.class.getDeclaredMethod("projectDiscussions");
            projectDiscussions.setAccessible(true);
            projectDiscussions.invoke(lana);
            logger.info(projectDiscussions);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            MechanicalEngineer dwayne = new MechanicalEngineer("Dwayne");
            Method projectDiscussions = MechanicalEngineer.class.getDeclaredMethod("projectDiscussions");
            projectDiscussions.setAccessible(true);
            projectDiscussions.invoke(dwayne);
            logger.info(projectDiscussions);

        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            StructuralEngineer bart = new StructuralEngineer("Bart");
            Method projectDiscussions = StructuralEngineer.class.getDeclaredMethod("projectDiscussions");
            projectDiscussions.setAccessible(true);
            projectDiscussions.invoke(bart);
            logger.info(projectDiscussions);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            PlumbingEngineer peter = new PlumbingEngineer("Peter");
            Method projectDiscussions = PlumbingEngineer.class.getDeclaredMethod("projectDiscussions");
            projectDiscussions.setAccessible(true);
            projectDiscussions.invoke(peter);
            logger.info(projectDiscussions);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            ElectricalEngineer valerie = new ElectricalEngineer("Valerie");
            Method projectDiscussions = ElectricalEngineer.class.getDeclaredMethod("projectDiscussions");
            projectDiscussions.setAccessible(true);
            projectDiscussions.invoke(valerie);
            logger.info(projectDiscussions);

        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void civilEngineerPrePlanning() {

        try {
            CivilEngineer daisy = new CivilEngineer("Daisy");
            Method sitePlanning = CivilEngineer.class.getDeclaredMethod("sitePlanning");
            sitePlanning.setAccessible(true);
            sitePlanning.invoke(daisy);
            logger.info(sitePlanning);
        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void electricalSystemPlanning() {
        try {
            ElectricalEngineer brian = new ElectricalEngineer("Brian");
            Method electricalSystemDesign = ElectricalEngineer.class.getDeclaredMethod("designingElectricalSystems");
            electricalSystemDesign.setAccessible(true);
            electricalSystemDesign.invoke(brian);
            logger.info(electricalSystemDesign);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void hVACSystemDesignStage() {
        try {
            MechanicalEngineer bobby = new MechanicalEngineer("Bobby");
            Method HVACDesign = MechanicalEngineer.class.getDeclaredMethod("hVACDesign");
            HVACDesign.setAccessible(true);
            HVACDesign.invoke(bobby);
            logger.info(HVACDesign);
        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void plumbingDesigns() {
        try {
            PlumbingEngineer paul = new PlumbingEngineer("Paul");
            Method plumbingSystemDesign = PlumbingEngineer.class.getDeclaredMethod("designingPlumbingSystems");
            plumbingSystemDesign.setAccessible(true);
            plumbingSystemDesign.invoke(paul);
            logger.info(plumbingSystemDesign);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void assignedDevelopments() {

        try {
            BusinessDeveloper kathleen = new BusinessDeveloper("Kathleen");
            Method assignedProjects = BusinessDeveloper.class.getDeclaredMethod("developmentProjects");
            assignedProjects.setAccessible(true);
            assignedProjects.invoke(kathleen);
            logger.info(assignedProjects);
        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void estimatedCompletion() {

        try {
            CivilSupervisor rodger = new CivilSupervisor("Rodger");
            Method completionDate = CivilSupervisor.class.getDeclaredMethod("constructionPlanDevelopment");
            completionDate.setAccessible(true);
            completionDate.invoke(rodger);
            logger.info(completionDate);
        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void initialSitePreparations() {
        //Can probably lump material ordering in here.
        try {
            ProjectManager harvey = new ProjectManager("Harvey");
            Method preppingSite = ProjectManager.class.getDeclaredMethod("constructionSitePreparations");
            preppingSite.setAccessible(true);
            preppingSite.invoke(harvey);
            logger.info(preppingSite);

        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void materialsForProject() {

        try {
            ConstructionExpeditor damian = new ConstructionExpeditor("Damian");
            Method listOfItemsOrdered = ConstructionExpeditor.class.getDeclaredMethod("materialsOrdered");
            listOfItemsOrdered.setAccessible(true);
            listOfItemsOrdered.invoke(damian);
            logger.info("Materials currently ordered for project:");
            logger.info(listOfItemsOrdered);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void contractorsHired() {

        try {
            ResidentialContractor john = new ResidentialContractor("John", "PQR Group");
            Method brandNewSubcontractors = ResidentialContractor.class.getDeclaredMethod("brandNewSubcontractorCompanies");
            brandNewSubcontractors.setAccessible(true);
            brandNewSubcontractors.invoke(john);
            logger.info(brandNewSubcontractors);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    public static void main(String[] args) {
        PreConstructionPlanning example = new PreConstructionPlanning();
        example.contractorsHired();
    }
}
