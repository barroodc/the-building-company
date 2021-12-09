package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;

import java.util.function.Function;
import java.util.logging.Logger;

public class DryWaller extends Contractor implements IInstallable {

    private static final Logger logger = Logger.getLogger(DryWaller.class.getName());

    private boolean dryWallPanelsAvailable;
    private int rValue; //(degrees kelvin * meters squared) / (divided by Watts)

    private static int phiSubQ; // is the heat flux through the barrier.
    private int lambdaT;  //is the temperature difference between the warmer surface and the colder surface of a barrier.

    public boolean isDryWallPanelsAvailable() {
        return dryWallPanelsAvailable;
    }

    public void setDryWallPanelsAvailable(final boolean dryWallPanelsAvailable) {
        this.dryWallPanelsAvailable = dryWallPanelsAvailable;
    }

    public int getrValue() {
        return rValue;
    }

    public void setrValue(int rValue) {
        this.rValue = rValue;
    }

    public static int getPhiSubQ() {
        return phiSubQ;
    }

    public static void setPhiSubQ(int phiSubQ) {
        DryWaller.phiSubQ = phiSubQ;
    }

    public int getLambdaT() {
        return lambdaT;
    }

    public void setLambdaT(int lambdaT) {
        this.lambdaT = lambdaT;
    }

    public DryWaller(final String firstName, final String nameOfCompany) {
        super(firstName, nameOfCompany);
    }

    private void rValueOfInsulation() {
        final DryWaller steve = new DryWaller("Steve", "YZW Group");
        int min = 1;
        int max = 3;
        phiSubQ = 1;

        lambdaT = (int) Math.floor(Math.random() * (max - min + 1) + min);
        Function<Integer, Integer> initialEquation = a -> a / phiSubQ;
        rValue = (initialEquation.apply(lambdaT));

        int negativeResults = 1;
        do {
            if (rValue != 2) {
                logger.info("Now we must figure out the r value for the fiber glass insulation");
                logger.info("Steve measured the degrees for the r value equation in degrees celsius");
                logger.info("Better material for insulation is highly recommended.");
                logger.info("Please come back with better insulation material.");
                negativeResults++;
            }
        } while (negativeResults <= 5);

        int positiveResults = 0;

        do {
            logger.info("After many trials we finally got a good r-value for sufficient insulation");
            logger.info(steve.getFirstName() + "'s rvalue for the fiberglass is acceptable.");
            positiveResults++;
        } while (positiveResults < 1);
    }

    private void fiberGlassAndDrywallInstall() {
        final DryWaller robert = new DryWaller("Robert", "YZW Group");
        robert.setDryWallPanelsAvailable(true);

        if (robert.isDryWallPanelsAvailable()) {
            logger.info("Drywall is available and ready for use");
            robert.addComponents();
        } else {
            logger.warning("Need to order dry wall panels");
        }
    }

    //Hashcode example number 1;
    @Override
    public int hashCode(){
        final int hashLambda = 21;
        final int hashPhiSubQ = 7;

        return hashLambda/hashPhiSubQ;
    }

    @Override
    public void addComponents() {
        logger.info("Add fiberglass insulation:");
        logger.info("Fiberglass added to attic");
        logger.info("Fiberglass added to exterior walls");
        logger.info("Fiber glass added to basement floor");
        logger.info("Fiber glass added to bathroom");
        logger.info("Fiber glass added to crawl space");
        logger.info("Now Steve adds Drywall to all rooms in the house");
    }

}
