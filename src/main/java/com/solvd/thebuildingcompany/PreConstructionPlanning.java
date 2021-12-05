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


public class PreConstructionPlanning {
    private static final Logger logger = LogManager.getLogger(PreConstructionPlanning.class);

    public PreConstructionPlanning() {

    }

    private void architectsPlanAndMeet() {

        try {
            final ResidentialArchitect jane = new ResidentialArchitect("Jane", "The Building Company");
            final Method projectDiscussions = ResidentialArchitect.class.getDeclaredMethod("projectDiscussions");
            projectDiscussions.setAccessible(true);
            projectDiscussions.invoke(jane);
            logger.info(projectDiscussions);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final InteriorArchitect happy = new InteriorArchitect("Happy", "The Building Company");
            final Method projectDiscussions = InteriorArchitect.class.getDeclaredMethod("projectDiscussions");
            projectDiscussions.setAccessible(true);
            projectDiscussions.invoke(happy);
            logger.info(projectDiscussions);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e){
            logger.error(e);
        }

        try {
            final ResidentialArchitect brendan = new ResidentialArchitect("Brendan", "The Building Company");
            final Method bluePrintPlanning = ResidentialArchitect.class.getDeclaredMethod("documentationAndDrawings");
            bluePrintPlanning.setAccessible(true);
            bluePrintPlanning.invoke(brendan);
            logger.info(bluePrintPlanning);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final InteriorArchitect james = new InteriorArchitect("James", "The Building Company");
            final Method bluePrintPlanning = InteriorArchitect.class.getDeclaredMethod("documentationAndDrawings");
            bluePrintPlanning.setAccessible(true);
            bluePrintPlanning.invoke(james);
            logger.info(bluePrintPlanning);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void engineersMeet() {

        try {
            final CivilEngineer lana = new CivilEngineer("Lana", "The Building Company");
            final Method projectDiscussions = CivilEngineer.class.getDeclaredMethod("projectDiscussions");
            projectDiscussions.setAccessible(true);
            projectDiscussions.invoke(lana);
            logger.info(projectDiscussions);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final MechanicalEngineer dwayne = new MechanicalEngineer("Dwayne", "The Building Company");
            final Method projectDiscussions = MechanicalEngineer.class.getDeclaredMethod("projectDiscussions");
            projectDiscussions.setAccessible(true);
            projectDiscussions.invoke(dwayne);
            logger.info(projectDiscussions);

        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final StructuralEngineer bart = new StructuralEngineer("Bart", "The Building Company");
            final Method projectDiscussions = StructuralEngineer.class.getDeclaredMethod("projectDiscussions");
            projectDiscussions.setAccessible(true);
            projectDiscussions.invoke(bart);
            logger.info(projectDiscussions);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final PlumbingEngineer peter = new PlumbingEngineer("Peter", "The Building Company");
            final Method projectDiscussions = PlumbingEngineer.class.getDeclaredMethod("projectDiscussions");
            projectDiscussions.setAccessible(true);
            projectDiscussions.invoke(peter);
            logger.info(projectDiscussions);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        try {
            final ElectricalEngineer valerie = new ElectricalEngineer("Valerie", "The Building Company");
            final Method projectDiscussions = ElectricalEngineer.class.getDeclaredMethod("projectDiscussions");
            projectDiscussions.setAccessible(true);
            projectDiscussions.invoke(valerie);
            logger.info(projectDiscussions);

        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void civilEngineerPrePlanning() {

        try {
            final CivilEngineer daisy = new CivilEngineer("Daisy", "The Building Company");
            final Method sitePlanning = CivilEngineer.class.getDeclaredMethod("sitePlanning");
            sitePlanning.setAccessible(true);
            sitePlanning.invoke(daisy);
            logger.info(sitePlanning);
        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void electricalSystemPlanning() {
        try {
            final ElectricalEngineer brian = new ElectricalEngineer("Brian", "The Building Company");
            final Method electricalSystemDesign = ElectricalEngineer.class.getDeclaredMethod("designingElectricalSystems");
            electricalSystemDesign.setAccessible(true);
            electricalSystemDesign.invoke(brian);
            logger.info(electricalSystemDesign);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void hVACSystemDesignStage() {
        try {
            final MechanicalEngineer bobby = new MechanicalEngineer("Bobby", "The Building Company");
            final Method HVACDesign = MechanicalEngineer.class.getDeclaredMethod("hVACDesign");
            HVACDesign.setAccessible(true);
            HVACDesign.invoke(bobby);
            logger.info(HVACDesign);
        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void plumbingDesigns() {
        try {
            final PlumbingEngineer paul = new PlumbingEngineer("Paul", "The Building Company");
            final Method plumbingSystemDesign = PlumbingEngineer.class.getDeclaredMethod("designingPlumbingSystems");
            plumbingSystemDesign.setAccessible(true);
            plumbingSystemDesign.invoke(paul);
            logger.info(plumbingSystemDesign);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void assignedDevelopments() {

        try {
            final BusinessDeveloper kathleen = new BusinessDeveloper("Kathleen", "The Building Company", 27);
            final Method assignedProjects = BusinessDeveloper.class.getDeclaredMethod("developmentProjects");
            assignedProjects.setAccessible(true);
            assignedProjects.invoke(kathleen);
            logger.info(assignedProjects);
        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void estimatedCompletion() {

        try {
            final CivilSupervisor rodger = new CivilSupervisor("Rodger", "The Building Company");
            final Method completionDate = CivilSupervisor.class.getDeclaredMethod("constructionPlanDevelopment");
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
            final ProjectManager harvey = new ProjectManager("Harvey", "The Building Company");
            final Method preppingSite = ProjectManager.class.getDeclaredMethod("constructionSitePreparations");
            preppingSite.setAccessible(true);
            preppingSite.invoke(harvey);
            logger.info(preppingSite);

        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void materialsForProject() {

        try {
            final ConstructionExpeditor damian = new ConstructionExpeditor("Damian", "The Building Company");
            final Method listOfItemsOrdered = ConstructionExpeditor.class.getDeclaredMethod("materialsOrdered");
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
            final ResidentialContractor john = new ResidentialContractor("John", "PQR Group");
            final Method brandNewSubcontractors = ResidentialContractor.class.getDeclaredMethod("brandNewSubcontractorCompanies");
            brandNewSubcontractors.setAccessible(true);
            brandNewSubcontractors.invoke(john);
            logger.info(brandNewSubcontractors);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }
}
