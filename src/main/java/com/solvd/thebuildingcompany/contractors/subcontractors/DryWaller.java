package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;

import java.util.Scanner;
import java.util.function.Function;
import java.util.logging.Logger;

public class DryWaller extends Contractor implements IInstallable {

    private static final Logger logger = Logger.getLogger(DryWaller.class.getName());

    private boolean dryWallPanelsAvailable;
    private static double rValue; //(degrees kelvin * meters squared) / (divided by Watts)
    private static double lambdaT; //is the temperature difference between the warmer surface and the colder surface of a barrier.
    private static double phiSubQ; // is the heat flux through the barrier.

    public boolean isDryWallPanelsAvailable() {
        return dryWallPanelsAvailable;
    }

    public void setDryWallPanelsAvailable(final boolean dryWallPanelsAvailable) {
        this.dryWallPanelsAvailable = dryWallPanelsAvailable;
    }

    public double getrValue() {
        return rValue;
    }

    public void setrValue(double rValue) {
        DryWaller.rValue = rValue;
    }

    public double getLambdaT() {
        return lambdaT;
    }

    public void setLambdaT(double lambdaT) {
        DryWaller.lambdaT = lambdaT;
    }

    public double getPhiSubQ() {
        return phiSubQ;
    }

    public void setPhiSubQ(double phiSubQ) {
        DryWaller.phiSubQ = phiSubQ;
    }

    public DryWaller(final String firstName, final String nameOfCompany) {
        super(firstName, nameOfCompany);
    }

    private void rValueOfInsulation() {
        //Indicates how well the insulation material resists heat transfer
        final DryWaller steve = new DryWaller("Steve", "YZW Group");
        logger.info("Please enter in your measured lambda value: ");
        Scanner lambdaT = new Scanner(System.in);
        Function<Integer, Integer> insulationReadiness = a -> lambdaT.nextInt() / 2;
        phiSubQ = 8.12;
        rValue = (insulationReadiness.apply(lambdaT.nextInt()) / phiSubQ);
        logger.info("Now we must figure out the r value for the fiber glass insulation");
        logger.info("Steve measured the degrees for the r value equation in degrees celsius");
        logger.info("The current temperature outside is 5.31 degrees Celsius");
        logger.info("The current temperature inside is 22.7 degrees Celsius");
        logger.info("The temperature difference between outside and inside is 17.39 degrees Celsius");
        logger.info("The heat flux through the barrier is calculated to be around 8.12 degrees Celsius");
        if (rValue >= 2.1 && rValue <= 2.7) {
            logger.info("This is a good r value for insulation");
            logger.info(steve.getFirstName() + "'s rvalue for the fiberglass is acceptable.");
        } else {
            logger.info("Better material for insulation is highly recommended.");
        }

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
