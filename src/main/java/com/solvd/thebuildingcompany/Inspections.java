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
            Method inspectionOfFoundation = CityInspector.class.getDeclaredMethod("inspection");
            inspectionOfFoundation.setAccessible(true);
            inspectionOfFoundation.invoke(margo);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }
    }
}
