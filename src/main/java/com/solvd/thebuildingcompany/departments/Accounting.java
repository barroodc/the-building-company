package com.solvd.thebuildingcompany.departments;

public abstract class Accounting {

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

    protected abstract String internalReporting();
    protected abstract String payables();
    protected abstract String payroll();
    protected abstract String taxes();

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
}
