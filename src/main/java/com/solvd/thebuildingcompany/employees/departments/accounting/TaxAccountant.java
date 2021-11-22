package com.solvd.thebuildingcompany.employees.departments.accounting;

import com.solvd.thebuildingcompany.employees.abstractclass.Employees;

import java.util.logging.Logger;

public class TaxAccountant extends Employees {

    private String invoice;  //intro for current invoice
    private String spendApproval;
    private int unpaid;
    private String ledger;
    private String varianceAnalysis;
    private String financialData;
    private int accountsPayable;
    private boolean employeesPaid;
    private boolean auditPerformed;
    private boolean taxReturnsDone;
    private String name;

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getSpendApproval() {
        return spendApproval;
    }

    public void setSpendApproval(String spendApproval) {
        this.spendApproval = spendApproval;
    }

    public int getUnpaid() {
        return unpaid;
    }

    public void setUnpaid(int unpaid) {
        this.unpaid = unpaid;
    }

    public String getLedger() {
        return ledger;
    }

    public void setLedger(String ledger) {
        this.ledger = ledger;
    }

    public String getVarianceAnalysis() {
        return varianceAnalysis;
    }

    public void setVarianceAnalysis(String varianceAnalysis) {
        this.varianceAnalysis = varianceAnalysis;
    }

    public String getFinancialData() {
        return financialData;
    }

    public void setFinancialData(String financialData) {
        this.financialData = financialData;
    }

    public int getAccountsPayable() {
        return accountsPayable;
    }

    public void setAccountsPayable(int accountsPayable) {
        this.accountsPayable = accountsPayable;
    }

    public boolean isEmployeesPaid() {
        return employeesPaid;
    }

    public void setEmployeesPaid(boolean employeesPaid) {
        this.employeesPaid = employeesPaid;
    }

    public boolean isAuditPerformed() {
        return auditPerformed;
    }

    public void setAuditPerformed(boolean auditPerformed) {
        this.auditPerformed = auditPerformed;
    }

    public boolean isTaxReturnsDone() {
        return taxReturnsDone;
    }

    public void setTaxReturnsDone(boolean taxReturnsDone) {
        this.taxReturnsDone = taxReturnsDone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private final Logger logger = Logger.getLogger(TaxAccountant.class.getName());

    public TaxAccountant(String name) {
        this.setName(name);
    }

    private String internalReporting() {

        final TaxAccountant chelsea = new TaxAccountant("Chelsea");
        chelsea.setFinancialData("Tax reports completed");

        logger.info(chelsea.getFinancialData());

        return chelsea.getFinancialData();
    }

    private String payables() {
        final TaxAccountant natalia = new TaxAccountant("Natalia");
        natalia.setAccountsPayable(80000);

        logger.info("We need to pay off this amount to the IRS: " + natalia.getAccountsPayable());

        return "We need to pay off this amount to the IRS: " + natalia.getAccountsPayable();
    }

    private String payroll() {
        final TaxAccountant harold = new TaxAccountant("Harold");
        harold.setEmployeesPaid(true);

        logger.info("All Employees were pre-taxed: " + harold.isEmployeesPaid());

        return "All Employees were pre-taxed: " + harold.isEmployeesPaid();
    }

    private String taxes() {
        final TaxAccountant harvey = new TaxAccountant("Harvey");
        harvey.setAuditPerformed(true);

        logger.info("All taxes have been paid by our company in 2019: " + harvey.isAuditPerformed());

        return "All taxes have been paid by our company in 2019: " + harvey.isAuditPerformed();
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
