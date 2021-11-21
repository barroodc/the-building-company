package com.solvd.thebuildingcompany.employees.managementemployees;

import com.solvd.thebuildingcompany.departments.EngineeringManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class EngineerManager extends EngineeringManagement {

    private final Logger logger = Logger.getLogger(EngineerManager.class.getName());

    public EngineerManager(String name) {
        this.setName(name);
    }

    @Override
    protected HashMap<String, Boolean> riskAnalysis() {
        final EngineerManager chris = new EngineerManager("Chris");
        chris.setCostEstimates(20000000.00);
        chris.setRiskAverse(true);

        HashMap<String, Double> rebuildCost = new HashMap<>();
        rebuildCost.put("Total cost to rebuild Brooklyn project: ", chris.getCostEstimates());

        for (Map.Entry<String, Double> set : rebuildCost.entrySet()) {
            logger.info(set.getKey());
        }

        HashMap<String, Boolean> riskLevel = new HashMap<>();
        riskLevel.put("Risk averse if the deal loses money?: ", chris.isRiskAverse());

        for (Map.Entry<String, Boolean> set : riskLevel.entrySet()) {
            logger.info(set.getKey());
        }

        return riskLevel;
    }

    @Override
    protected String laborEstimate() {
        final EngineerManager jessica = new EngineerManager("Jessica");
        jessica.setLaborCalculation(5000000);

        logger.info("Total amount required to compensate new hired crew: $" + jessica.getLaborCalculation());

        return "Total amount required to compensate new hired crew: $" + jessica.getLaborCalculation();
    }

    @Override
    protected String costEstimate() {
        final EngineerManager robyn = new EngineerManager("Robyn");
        robyn.setCostEstimate(25000);

        logger.info("Electrical wiring cost for Brooklyn project $" + robyn.getCostEstimate());

        return "Electrical wiring cost for Brooklyn project $" + robyn.getCostEstimate();
    }

    @Override
    protected HashMap<String, Boolean> negotiateServiceAgreements() {
        final EngineerManager devyn = new EngineerManager("Devyn");
        devyn.setAgreementSigned(true);

        HashMap<String, Boolean> agreementStatus = new HashMap<>();
        agreementStatus.put("The EPC agreement is signed: ", devyn.isAgreementSigned());

        for (Map.Entry<String, Boolean> set : agreementStatus.entrySet()) {
            logger.info(set.getKey());
        }

        return agreementStatus;
    }
}
