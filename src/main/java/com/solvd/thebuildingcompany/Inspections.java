package com.solvd.thebuildingcompany;

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
}
