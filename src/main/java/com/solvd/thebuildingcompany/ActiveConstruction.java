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
    }
}
