package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;

import java.util.*;
import java.util.logging.Logger;

public class Electrician extends Contractor implements IInstallable {

    private String name;
    private String nameOfCompany;
    private boolean passedInspection;
    private int evaluationCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isPassedInspection() {
        return passedInspection;
    }

    public void setPassedInspection(boolean passedInspection) {
        this.passedInspection = passedInspection;
    }

    public int getEvaluationCount() {
        return evaluationCount;
    }

    public void setEvaluationCount(int evaluationCount) {
        this.evaluationCount = evaluationCount;
    }


    private final Logger logger = Logger.getLogger(Electrician.class.getName());

    public Electrician(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
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

          for (Map.Entry<String, Boolean> set : electricalPanelCheckList.entrySet()) {
              while (set.getValue().equals(false) && evaluationCount < 5) {
                  logger.info(robert.getName() + " the Electrician checked function number: " + evaluationCount + " of the electrical panel.");
                  evaluationCount++;
              }
          }

          for (Map.Entry<String, Boolean> failureCheck: electricalPanelCheckList.entrySet()) {
              if (failureCheck.getValue().equals(true)){
                  listOfThingsWrong.add(failureCheck.getKey());
                  logger.info(Arrays.toString(listOfThingsWrong.toArray()) + ": Yes, this needs fixing before moving forward.");
              } else {
                  listOfThingsRight.add(failureCheck.getKey());
                  logger.info(Arrays.toString(listOfThingsRight.toArray()) + ": No, we are all set on these functions and ready to move forward.");
              }
          }
    }

    public static void main(String[] args) {
        Electrician example = new Electrician("Johnny", "Walker");
        example.electricalPanelFinalCheck();
    }

    @Override
    public void addComponents() {
      logger.info("runs wires from the breaker panel to each receptacle");
      logger.info("ductwork for HVAC system applied");
      logger.info("receptacles for outlets are installed");
      logger.info("lights and switches are installed");
    }
}
