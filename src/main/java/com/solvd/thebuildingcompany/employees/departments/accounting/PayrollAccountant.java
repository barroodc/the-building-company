package com.solvd.thebuildingcompany.employees.departments.accounting;

import com.solvd.thebuildingcompany.employees.abstractclass.Employees;

import java.util.logging.Logger;

public class PayrollAccountant extends Employees {

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

    private final Logger logger = Logger.getLogger(PayrollAccountant.class.getName());

    public PayrollAccountant(String name) {
        this.setName(name);
    }

    private String internalReporting() {

        final PayrollAccountant marsha = new PayrollAccountant("Marsha");
        marsha.setVarianceAnalysis("The forecast for the last fiscal quarter was extremely accurate");

        logger.info("The forecast for the last fiscal quarter was extremely accurate");
        return marsha.getVarianceAnalysis();
    }

    private String payables() {
        final PayrollAccountant brian = new PayrollAccountant("Brian");
        brian.setAccountsPayable(5000);

        logger.info("Brian set accounts payable to $10,000 for most recent transaction with xyz company");

        return "Brian set accounts payable to $10,000 for most recent transaction with xyz company";
    }

    private String payroll() {
        final PayrollAccountant clark = new PayrollAccountant("Clark");
        clark.setEmployeesPaid(true);

        logger.info("Were all employees paid their annual salary: " + clark.isEmployeesPaid());

        return "Were all employees paid their annual salary: " + clark.isEmployeesPaid();
    }

    private String taxes() {
        final PayrollAccountant nathaniel = new PayrollAccountant("Nathaniel");
        nathaniel.setTaxReturnsDone(true);

        logger.info("Did company employees file tax returns?: " + nathaniel.isTaxReturnsDone());

        return "Did company employees file tax returns?: " + nathaniel.isTaxReturnsDone();
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
