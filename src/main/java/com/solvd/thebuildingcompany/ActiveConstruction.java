package com.solvd.thebuildingcompany;

import com.solvd.thebuildingcompany.contractors.subcontractors.ConcreteSpecialist;
import com.solvd.thebuildingcompany.contractors.subcontractors.DemolitionWorker;
import com.solvd.thebuildingcompany.contractors.subcontractors.GeneralWorker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ActiveConstruction {
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

    private void basementWorkersClockInAndOut() {
        try {
            ConcreteSpecialist baxter = new ConcreteSpecialist("Baxter", "NXE Group");
            Method punchIn = ConcreteSpecialist.class.getDeclaredMethod("employeePunchIn");
            punchIn.setAccessible(true);
            punchIn.invoke(baxter);
            logger.info(punchIn);
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
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }

        //If time permits I can even try creating another method to draw a foundation.

    }

}
