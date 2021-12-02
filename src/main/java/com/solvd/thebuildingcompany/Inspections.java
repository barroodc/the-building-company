package com.solvd.thebuildingcompany;

import com.solvd.thebuildingcompany.contractors.subcontractors.Electrician;
import com.solvd.thebuildingcompany.contractors.subcontractors.GradingContractor;
import com.solvd.thebuildingcompany.inspectors.CityInspector;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Inspections {

    private static Logger logger = LogManager.getLogger(Inspections.class);

    private void foundationInspection() {

        try {
            CityInspector margo = new CityInspector("Margo");
            Method inspectionOfFoundation = CityInspector.class.getDeclaredMethod("generalInspection");
            inspectionOfFoundation.setAccessible(true);
            inspectionOfFoundation.invoke(margo);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void plumbingInspection() {

        try {
          CityInspector christina = new CityInspector("Christina");
          Method plumbingInspected = CityInspector.class.getDeclaredMethod("plumbingInspection");
          plumbingInspected.setAccessible(true);
          plumbingInspected.invoke(christina);
          logger.info(plumbingInspected);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void electricalInspection() {

        try {
            CityInspector otto = new CityInspector("Otto");
            Method electricalInspected = CityInspector.class.getDeclaredMethod("electricalInspection");
            electricalInspected.setAccessible(true);
            electricalInspected.invoke(otto);
            logger.info(electricalInspected);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void mechanicalInspection() {

        try {
          CityInspector peter = new CityInspector("Peter");
          Method mechanicalInspection = CityInspector.class.getDeclaredMethod("mechanicalInspection");
          mechanicalInspection.setAccessible(true);
          mechanicalInspection.invoke(peter);
          logger.info(mechanicalInspection);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
          logger.error(e);
        }
    }

    private void propertyDrainageCheck() {

        try {
            GradingContractor william = new GradingContractor("William", "LBV Group");
            Method drainageAbilityCheck = GradingContractor.class.getDeclaredMethod("propertyDrainageAssured");
            drainageAbilityCheck.setAccessible(true);
            drainageAbilityCheck.invoke(william);
            logger.info(drainageAbilityCheck);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void foundationAreaCheck() {

        try {
         GradingContractor curtis = new GradingContractor("Curtis", "LBV Group");
         Method levelingNeededCheck = GradingContractor.class.getDeclaredMethod("foundationAreaCheck");
         levelingNeededCheck.setAccessible(true);
         levelingNeededCheck.invoke(curtis);
         logger.info(levelingNeededCheck);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
           logger.error(e);
        }
    }

    private void electricalPanelInspection() {

        try {
            Electrician bruce = new Electrician("Bruce", "DEF Group");
            Method electricalPanelCheck = Electrician.class.getDeclaredMethod("electricalPanelFinalCheck");
            electricalPanelCheck.setAccessible(true);
            electricalPanelCheck.invoke(bruce);
            logger.info(electricalPanelCheck);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void lastInspection() {

        try {
          CityInspector joyce = new CityInspector("Joyce", "General Inspection");
          Method lastWalkThrough = CityInspector.class.getDeclaredMethod("generalInspection");
          lastWalkThrough.setAccessible(true);
          lastWalkThrough.invoke(joyce);
          logger.info(lastWalkThrough);
          logger.info("The home building process is now complete!");
          logger.info("Now time for an open house!");
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
          logger.error(e);
        }
    }
}
