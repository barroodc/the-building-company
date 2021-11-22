package com.solvd.thebuildingcompany.employees.departments.accounting;

import com.solvd.thebuildingcompany.employees.abstractclass.Employees;

import java.util.logging.Logger;

public class StaffAccountant extends Employees {

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

    private final Logger logger = Logger.getLogger(StaffAccountant.class.getName());

    public StaffAccountant(String name) {
        this.setName(name);
    }

    private String internalReporting() {

        final StaffAccountant jerry = new StaffAccountant("Jerry");
        jerry.setName("Jerry");
        jerry.setFinancialData("New financial analysis for 2020 in progress");

        logger.info(jerry.getFinancialData());

        return jerry.getFinancialData();
    }

    private String payables() {
        final StaffAccountant hannah = new StaffAccountant("Hannah");
        hannah.setName("Hannah");
        hannah.setAccountsPayable(40000);

        logger.info("Fiscal quarter ending in 2010 analysis report");

        return "Fiscal quarter ending in 2010 analysis report";
    }

    private String payroll() {
        final StaffAccountant frank = new StaffAccountant("Frank");
        frank.setName("Frank");
        frank.setEmployeesPaid(true);

        logger.info("Accounting department received a paycheck: " + frank.isEmployeesPaid());
        return "Accounting department received a paycheck: " + frank.isEmployeesPaid();
    }

    private String taxes() {
        final StaffAccountant william = new StaffAccountant("William");
        william.setName("Wiliam");
        william.setTaxReturnsDone(true);

        logger.info("Tax returns for 2020 have been completed: " + william.isTaxReturnsDone());
        return "Tax returns for 2020 have been completed: " + william.isTaxReturnsDone();
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
