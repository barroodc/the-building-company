package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;

import java.util.*;
import java.util.logging.Logger;

public class Electrician extends Contractor implements IInstallable {

    private boolean passedInspection;
    private int evaluationCount;

    public boolean isPassedInspection() {
        return passedInspection;
    }

    public void setPassedInspection(final boolean passedInspection) {
        this.passedInspection = passedInspection;
    }

    public int getEvaluationCount() {
        return evaluationCount;
    }

    public void setEvaluationCount(final int evaluationCount) {
        this.evaluationCount = evaluationCount;
    }


    private final Logger logger = Logger.getLogger(Electrician.class.getName());

    public Electrician(final String firstName, final String nameOfCompany) {
        super(firstName, nameOfCompany);
    }

    private void installElectricalComponents() {
        final Electrician brandon = new Electrician("Brandon", "DEF Group");
        logger.info("Brandon the Electrician begins doing electrical work on the home: ");
        brandon.addComponents();
    }

    private void electricalPanelFinalCheck() {
      final Electrician robert = new Electrician("Robert", "DEF Group");
      HashMap<String, Boolean> electricalPanelCheckList = new HashMap<>();
      electricalPanelCheckList.put("Any electrical corrosion or oxidization of wiring?", false);
      electricalPanelCheckList.put("Any water leakage?", true);
      electricalPanelCheckList.put("Was there any insect or rodent nesting damage?", false);
      electricalPanelCheckList.put("Were there any arcing wires?", false);
      evaluationCount = 1;

      ArrayList<String> listOfThingsWrong = new ArrayList<>();
      ArrayList<String> listOfThingsRight = new ArrayList<>();

        electricalPanelCheckList.forEach((key, value) -> {
            while (value.equals(false) && evaluationCount < 5) {
                logger.info(robert.getFirstName() + " the Electrician checked function number: " + evaluationCount + " of the electrical panel.");
                evaluationCount++;
            }
        });

        electricalPanelCheckList.forEach((key, value) -> {
            if (value.equals(true)) {
                listOfThingsWrong.add(key);
                logger.info(Arrays.toString(listOfThingsWrong.toArray()) + ": Yes, this needs fixing before moving forward.");
            } else {
                listOfThingsRight.add(key);
                logger.info(Arrays.toString(listOfThingsRight.toArray()) + ": No, we are all set on these functions and ready to move forward.");
            }
        });
    }


    @Override
    public void addComponents() {
      logger.info("runs wires from the breaker panel to each receptacle");
      logger.info("ductwork for HVAC system applied");
      logger.info("receptacles for outlets are installed");
      logger.info("lights and switches are installed");
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
