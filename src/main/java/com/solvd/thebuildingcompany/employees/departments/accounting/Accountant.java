package com.solvd.thebuildingcompany.employees.departments.accounting;

import com.solvd.thebuildingcompany.employees.abstractclass.Employees;

import java.util.logging.Logger;

public class Accountant extends Employees {

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

    private final Logger logger = Logger.getLogger(Accountant.class.getName());

    public Accountant(String name) {
        this.setName(name);
    }

    private String internalReporting() {

        final Accountant george = new Accountant("George");
        george.setVarianceAnalysis("The forecast for the last fiscal quarter was extremely accurate");
        logger.info(george.getVarianceAnalysis());
        return george.getVarianceAnalysis();
    }


    private String payables() {
        final Accountant jessie = new Accountant("Jessie");
        jessie.setAccountsPayable(50000);
        logger.info("Total liabilities for the current fiscal year total $50000");
        return "Total liabilities for the current fiscal year total $" + jessie.getAccountsPayable();
    }

    private String payroll() {
        final Accountant mike = new Accountant("Mike");
        mike.setEmployeesPaid(true);
        logger.info("Sales department received a paycheck: true");
        return "Sales department received a paycheck: " + mike.isEmployeesPaid();
    }


    private String taxes() {
        final Accountant richard = new Accountant("Richard");
        richard.setAuditPerformed(true);
        logger.info("Audits were performed last year: true");
        return "Audits were performed last year: " + richard.isAuditPerformed();
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
