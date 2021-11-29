package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IFixable;
import com.solvd.thebuildingcompany.interfaces.IInstallable;
import com.solvd.thebuildingcompany.interfaces.IModifiable;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.logging.Logger;

public class DryWaller extends Contractor implements IInstallable, IModifiable, IFixable {

    private String name;
    private String nameOfCompany;
    private boolean dryWallPanelsAvailable;
    private boolean measurementsTook;
    private int numberOfMistakesMade;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected HashMap<String, Boolean> employeePunchIn() {
        return null;
    }

    @Override
    protected HashMap<String, Boolean> employeePunchOut() {
        return null;
    }

    @Override
    protected Double earnings() {
        return null;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public boolean isDryWallPanelsAvailable() {
        return dryWallPanelsAvailable;
    }

    public void setDryWallPanelsAvailable(boolean dryWallPanelsAvailable) {
        this.dryWallPanelsAvailable = dryWallPanelsAvailable;
    }

    public boolean isMeasurementsTook() {
        return measurementsTook;
    }

    public void setMeasurementsTook(boolean measurementsTook) {
        this.measurementsTook = measurementsTook;
    }

    public int getNumberOfMistakesMade() {
        return numberOfMistakesMade;
    }

    public void setNumberOfMistakesMade(int numberOfMistakesMade) {
        this.numberOfMistakesMade = numberOfMistakesMade;
    }

    private final Logger logger = Logger.getLogger(DryWaller.class.getName());


    public DryWaller(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    private boolean drywallInstallation() {
        final DryWaller robert = new DryWaller("Robert", "YZW Group");
        robert.setDryWallPanelsAvailable(true);

        if (robert.isDryWallPanelsAvailable()) {
            robert.addComponents();
            return true;
        } else {
            logger.warning("Need to order dry wall panels");
            return false;
        }
    }

    private boolean measureDryWallPanels()  {
        final DryWaller kevin = new DryWaller("Kevin", "YZW Group");
        kevin.setDryWallPanelsAvailable(true);

        if (kevin.isMeasurementsTook()) {
            logger.info("Measurements have been taken");
            return true;
        } else {
            logger.warning("Measurements need to be taken");
            return false;
        }
    }

    private HashMap<String, String> modifyMaterials() {
        final DryWaller jerome = new DryWaller("Jerome", "YZW Group");
        return null;
    }


    private ArrayList<String> mistakesToFix() {
        final DryWaller clarance = new DryWaller("Clarance", "YZW Group");
        clarance.setNumberOfMistakesMade(5);
        LinkedList<String> mistakesMade = new LinkedList<>();
        mistakesMade.add("New wood needs to be added.");
        //Need to implement Node with LinkedList
        //Node head, Node value, etc.
        return null;
    }

    @Override
    public void addComponents() {
      logger.info("Add drywall");
    }

    @Override
    public void materialAltered() {
      logger.info("Cut dry wall panels");
    }

    @Override
    public void fixBuildingMaterial() {
         logger.info("Building material needs fixing");
    }

}
