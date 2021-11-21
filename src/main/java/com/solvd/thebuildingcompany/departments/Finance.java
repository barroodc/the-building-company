package com.solvd.thebuildingcompany.departments;

public abstract class Finance {

    private int accountsPayable;
    private int moneyReceived;
    private int maxBudget;
    private int profitForecast;
    private double fixedInterestRate;
    private double shortTermRate;
    private String taxExemption;
    private int moneySpent;
    private String name;

    protected abstract String bookKeeping();
    protected abstract String cashFlowManagement();
    protected abstract String budgets();
    protected abstract String forecasting();
    protected abstract String longerTermFinancing();
    protected abstract String shorterTermFinancing();
    protected abstract String taxManagement();
    protected abstract String investmentManagement();
    protected abstract String financialReporting();
    protected abstract String financialAnalysis();
    protected abstract String managerAdvisement(String advice);

    public int getAccountsPayable() {
        return accountsPayable;
    }

    public void setAccountsPayable(int accountsPayable) {
        this.accountsPayable = accountsPayable;
    }

    public int getMoneyReceived() {
        return moneyReceived;
    }

    public void setMoneyReceived(int moneyReceived) {
        this.moneyReceived = moneyReceived;
    }

    public int getMaxBudget() {
        return maxBudget;
    }

    public void setMaxBudget(int maxBudget) {
        this.maxBudget = maxBudget;
    }

    public int getProfitForecast() {
        return profitForecast;
    }

    public void setProfitForecast(int profitForecast) {
        this.profitForecast = profitForecast;
    }

    public double getFixedInterestRate() {
        return fixedInterestRate;
    }

    public void setFixedInterestRate(double fixedInterestRate) {
        this.fixedInterestRate = fixedInterestRate;
    }

    public double getShortTermRate() {
        return shortTermRate;
    }

    public void setShortTermRate(double shortTermRate) {
        this.shortTermRate = shortTermRate;
    }

    public String getTaxExemption() {
        return taxExemption;
    }

    public void setTaxExemption(String taxExemption) {
        this.taxExemption = taxExemption;
    }

    public int getMoneySpent() {
        return moneySpent;
    }

    public void setMoneySpent(int moneySpent) {
        this.moneySpent = moneySpent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
