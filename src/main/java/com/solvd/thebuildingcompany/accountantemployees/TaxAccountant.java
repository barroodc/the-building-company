package com.solvd.thebuildingcompany.accountantemployees;

import com.solvd.thebuildingcompany.departments.Accounting;

import java.util.logging.Logger;

public class TaxAccountant extends Accounting {

    private final Logger logger = Logger.getLogger(TaxAccountant.class.getName());

    public TaxAccountant(String name) {
        this.setName(name);
    }

    @Override
    protected String internalReporting() {

        final TaxAccountant chelsea = new TaxAccountant("Chelsea");
        chelsea.setFinancialData("Tax reports completed");

        logger.info(chelsea.getFinancialData());

        return chelsea.getFinancialData();
    }

    @Override
    protected String payables() {
        final TaxAccountant natalia = new TaxAccountant("Natalia");
        natalia.setAccountsPayable(80000);

        logger.info("We need to pay off this amount to the IRS: " + natalia.getAccountsPayable());

        return "We need to pay off this amount to the IRS: " + natalia.getAccountsPayable();
    }

    @Override
    protected String payroll() {
        final TaxAccountant harold = new TaxAccountant("Harold");
        harold.setEmployeesPaid(true);

        logger.info("All Employees were pre-taxed: " + harold.isEmployeesPaid());

        return "All Employees were pre-taxed: " + harold.isEmployeesPaid();
    }

    @Override
    protected String taxes() {
        final TaxAccountant harvey = new TaxAccountant("Harvey");
        harvey.setAuditPerformed(true);

        logger.info("All taxes have been paid by our company in 2019: " + harvey.isAuditPerformed());

        return "All taxes have been paid by our company in 2019: " + harvey.isAuditPerformed();
    }
}
