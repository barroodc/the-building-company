package com.solvd.thebuildingcompany.accountantemployees;

import com.solvd.thebuildingcompany.departments.Accounting;

import java.util.logging.Logger;

public class StaffAccountant extends Accounting {

    private final Logger logger = Logger.getLogger(StaffAccountant.class.getName());

    public StaffAccountant(String name) {
        this.setName(name);
    }

    @Override
    protected String internalReporting() {

        final StaffAccountant jerry = new StaffAccountant("Jerry");
        jerry.setName("Jerry");
        jerry.setFinancialData("New financial analysis for 2020 in progress");

        logger.info(jerry.getFinancialData());

        return jerry.getFinancialData();
    }

    @Override
    protected String payables() {
        final StaffAccountant hannah = new StaffAccountant("Hannah");
        hannah.setName("Hannah");
        hannah.setAccountsPayable(40000);

        logger.info("Fiscal quarter ending in 2010 analysis report");

        return "Fiscal quarter ending in 2010 analysis report";
    }

    @Override
    protected String payroll() {
        final StaffAccountant frank = new StaffAccountant("Frank");
        frank.setName("Frank");
        frank.setEmployeesPaid(true);

        logger.info("Accounting department received a paycheck: " + frank.isEmployeesPaid());
        return "Accounting department received a paycheck: " + frank.isEmployeesPaid();
    }

    @Override
    protected String taxes() {
        final StaffAccountant william = new StaffAccountant("William");
        william.setName("Wiliam");
        william.setTaxReturnsDone(true);

        logger.info("Tax returns for 2020 have been completed: " + william.isTaxReturnsDone());
        return "Tax returns for 2020 have been completed: " + william.isTaxReturnsDone();
    }
}
