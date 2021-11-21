package com.solvd.thebuildingcompany.accountantemployees;

import com.solvd.thebuildingcompany.departments.Accounting;
import java.util.logging.Logger;

public class Accountant extends Accounting {

    private final Logger logger = Logger.getLogger(Accountant.class.getName());

    public Accountant(String name) {
        this.setName(name);
    }
    @Override
    protected String internalReporting() {

        final Accountant george = new Accountant("George");
        george.setVarianceAnalysis("The forecast for the last fiscal quarter was extremely accurate");
        logger.info(george.getVarianceAnalysis());
        return george.getVarianceAnalysis();
    }

    @Override
    protected String payables() {
        final Accountant jessie = new Accountant("Jessie");
        jessie.setAccountsPayable(50000);
        logger.info("Total liabilities for the current fiscal year total $50000");
        return "Total liabilities for the current fiscal year total $" + jessie.getAccountsPayable();
    }

    @Override
    protected String payroll() {
        final Accountant mike = new Accountant("Mike");
        mike.setEmployeesPaid(true);
        logger.info("Sales department received a paycheck: true");
        return "Sales department received a paycheck: " + mike.isEmployeesPaid();
    }

    @Override
    protected String taxes() {
        final Accountant richard = new Accountant("Richard");
        richard.setAuditPerformed(true);
        logger.info("Audits were performed last year: true");
        return "Audits were performed last year: " + richard.isAuditPerformed();
    }
}
