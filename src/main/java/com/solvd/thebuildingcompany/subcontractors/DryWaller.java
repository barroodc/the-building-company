package com.solvd.thebuildingcompany.subcontractors;

import com.solvd.thebuildingcompany.interfaces.IFixable;
import com.solvd.thebuildingcompany.interfaces.IInstallable;
import com.solvd.thebuildingcompany.interfaces.IModifiable;
import com.solvd.thebuildingcompany.subcontractordepartments.DryWalling;
import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Logger;

public class DryWaller extends DryWalling implements IInstallable, IModifiable, IFixable {

    private final Logger logger = Logger.getLogger(DryWaller.class.getName());


    public DryWaller(String name, String nameOfCompany) {
        super(name, nameOfCompany);
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    @Override
    protected boolean drywallInstallation() {
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

    @Override
    protected boolean measureDryWallPanels()  {
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

    @Override
    protected HashMap<String, String> modifyMaterials() {
        final DryWaller jerome = new DryWaller("Jerome", "YZW Group");
        return null;
    }

    @Override
    protected ArrayList<String> mistakesToFix() {
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

    public static void main(String[] args) throws IOException {
        DryWaller example = new DryWaller("","");
        example.measureDryWallPanels();
    }
}
