package com.solvd.thebuildingcompany;

import com.solvd.thebuildingcompany.contractors.subcontractors.Electrician;
import com.solvd.thebuildingcompany.contractors.subcontractors.GradingContractor;
import com.solvd.thebuildingcompany.inspectors.CityInspector;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Inspections {

    private static final  Logger logger = LogManager.getLogger(Inspections.class);

    public Inspections() {

    }

    private void foundationInspection() {

        try {
            final CityInspector margo = new CityInspector("Margo");
            final Method inspectionOfFoundation = CityInspector.class.getDeclaredMethod("generalInspection");
            inspectionOfFoundation.setAccessible(true);
            inspectionOfFoundation.invoke(margo);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void plumbingInspection() {

        try {
          final CityInspector christina = new CityInspector("Christina");
          final Method plumbingInspected = CityInspector.class.getDeclaredMethod("plumbingInspection");
          plumbingInspected.setAccessible(true);
          plumbingInspected.invoke(christina);
          logger.info(plumbingInspected);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void electricalInspection() {

        try {
            final CityInspector otto = new CityInspector("Otto");
            final Method electricalInspected = CityInspector.class.getDeclaredMethod("electricalInspection");
            electricalInspected.setAccessible(true);
            electricalInspected.invoke(otto);
            logger.info(electricalInspected);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void mechanicalInspection() {

        try {
          final CityInspector peter = new CityInspector("Peter");
          final Method mechanicalInspection = CityInspector.class.getDeclaredMethod("mechanicalInspection");
          mechanicalInspection.setAccessible(true);
          mechanicalInspection.invoke(peter);
          logger.info(mechanicalInspection);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
          logger.error(e);
        }
    }

    private void propertyDrainageCheck() {

        try {
            final GradingContractor william = new GradingContractor("William", "LBV Group");
            final Method drainageAbilityCheck = GradingContractor.class.getDeclaredMethod("propertyDrainageAssured");
            drainageAbilityCheck.setAccessible(true);
            drainageAbilityCheck.invoke(william);
            logger.info(drainageAbilityCheck);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void foundationAreaCheck() {

        try {
         final GradingContractor curtis = new GradingContractor("Curtis", "LBV Group");
         final Method levelingNeededCheck = GradingContractor.class.getDeclaredMethod("foundationAreaCheck");
         levelingNeededCheck.setAccessible(true);
         levelingNeededCheck.invoke(curtis);
         logger.info(levelingNeededCheck);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
           logger.error(e);
        }
    }

    private void electricalPanelInspection() {

        try {
            final Electrician bruce = new Electrician("Bruce", "DEF Group");
            final Method electricalPanelCheck = Electrician.class.getDeclaredMethod("electricalPanelFinalCheck");
            electricalPanelCheck.setAccessible(true);
            electricalPanelCheck.invoke(bruce);
            logger.info(electricalPanelCheck);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void nationalRankingOfQuality() {
        try {
          final CityInspector marshall = new CityInspector("Marshall", "National");
          final Method homesNationallyRanked = CityInspector.class.getDeclaredMethod("nationalHomeRatings");
          homesNationallyRanked.setAccessible(true);
          homesNationallyRanked.invoke(marshall);
          logger.info(homesNationallyRanked);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }

    private void lastInspection() {

        try {
          final CityInspector joyce = new CityInspector("Joyce", "General Inspection");
          final Method lastWalkThrough = CityInspector.class.getDeclaredMethod("generalInspection");
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
