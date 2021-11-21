package com.solvd.thebuildingcompany.accountantemployees;

import com.solvd.thebuildingcompany.departments.Accounting;

import java.util.logging.Logger;

public class PayrollAccountant extends Accounting {

    private final Logger logger = Logger.getLogger(PayrollAccountant.class.getName());

    public PayrollAccountant(String name) {
        this.setName(name);
    }

    @Override
    protected String internalReporting() {

        final PayrollAccountant marsha = new PayrollAccountant("Marsha");
        marsha.setVarianceAnalysis("The forecast for the last fiscal quarter was extremely accurate");

        logger.info("The forecast for the last fiscal quarter was extremely accurate");
        return marsha.getVarianceAnalysis();
    }

    @Override
    protected String payables() {
        final PayrollAccountant brian = new PayrollAccountant("Brian");
        brian.setAccountsPayable(5000);

        logger.info("Brian set accounts payable to $10,000 for most recent transaction with xyz company");

        return "Brian set accounts payable to $10,000 for most recent transaction with xyz company";
    }

    @Override
    protected String payroll() {
        final PayrollAccountant clark = new PayrollAccountant("Clark");
        clark.setEmployeesPaid(true);

        logger.info("Were all employees paid their annual salary: " + clark.isEmployeesPaid());

        return "Were all employees paid their annual salary: " + clark.isEmployeesPaid();
    }

    @Override
    protected String taxes() {
        final PayrollAccountant nathaniel = new PayrollAccountant("Nathaniel");
        nathaniel.setTaxReturnsDone(true);

        logger.info("Did company employees file tax returns?: " + nathaniel.isTaxReturnsDone());

        return "Did company employees file tax returns?: " + nathaniel.isTaxReturnsDone();
    }
}
