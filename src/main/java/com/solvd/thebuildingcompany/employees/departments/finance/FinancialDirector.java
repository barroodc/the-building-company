package com.solvd.thebuildingcompany.employees.departments.finance;

import com.solvd.thebuildingcompany.employees.abstractclass.Employees;

import java.util.logging.Logger;

public class FinancialDirector extends Employees {

    private String name;
    private int accountsPayable;
    private int moneyReceived;
    private int maxBudget;
    private int profitForecast;
    private double fixedInterestRate;
    private double shortTermRate;
    private String taxExemption;
    private int moneySpent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    private final Logger logger = Logger.getLogger(FinancialDirector.class.getName());

    public FinancialDirector(String name) {
        this.setName(name);
    }

    private String bookKeeping() {
        final Financier nelson = new Financier("Nelson");
        nelson.setAccountsPayable(50000);

        logger.info("Accounts payable as of quarter one 2021: " + nelson.getAccountsPayable());

        return "Accounts payable as of quarter one 2021: " + nelson.getAccountsPayable();
    }

    private String cashFlowManagement() {
        final Financier arthur = new Financier("Arthur");
        arthur.setMoneyReceived(600000000);

        logger.info("Total money received in 2019: " + arthur.getMoneyReceived());

        return "Total money received in 2019: " + arthur.getMoneyReceived();
    }

    private String budgets() {
        final Financier dominick = new Financier("Dominick");

        dominick.setMaxBudget(900000);

        logger.info("Maximum amount allowed to spend this calendar year: " + dominick.getMaxBudget());

        return "Maximum amount allowed to spend this calendar year: " + dominick.getMaxBudget();
    }

    private String forecasting() {
        final Financier andrew = new Financier("Andrew");
        andrew.setProfitForecast(85000000);

        logger.info("Maximum amount allowed to spend this calendar year: " + andrew.getProfitForecast());

        return "Estimated gross profit in quarter one of 2022 is: " + andrew.getProfitForecast();
    }

    private String longerTermFinancing() {
        final Financier charlie = new Financier("Charlie");
        charlie.setFixedInterestRate(3.567);

        logger.info("Long term financing for future projects secured at: " + charlie.getFixedInterestRate() + "%");

        return "Long term financing for future projects secured at: " + charlie.getFixedInterestRate() + "%";
    }

    private String shorterTermFinancing() {
        final Financier samantha = new Financier("Samantha");
        samantha.setShortTermRate(8.7);

        logger.info("Short term financing for future projects secured at: " + samantha.getShortTermRate() + "%");

        return "Short term financing for future projects secured at: " + samantha.getShortTermRate() + "%";
    }

    private String taxManagement() {
        final Financier derek = new Financier("Derek");
        derek.setTaxExemption("Accounting Fees");

        logger.info("Make sure to have accounting apply the following exemption: " + derek.getTaxExemption());

        return "Make sure to have accounting apply the following exemption: " + derek.getTaxExemption();
    }

    private String investmentManagement() {
        final Financier trevor = new Financier("Trevor");
        trevor.setMoneySpent(50000);

        logger.info("Total amount spent on client outings this year is: $" + trevor.getMoneySpent());

        return "Total amount spent on client outings this year is: $" + trevor.getMoneySpent();
    }

    private String financialReporting() {
        final Financier harley = new Financier("Harley");
        harley.setMoneySpent(285000);

        logger.info("Total amount spent in quarter four of this year is: $" + harley.getMoneySpent());

        return "Total amount spent in quarter four of this year is: $" + harley.getMoneySpent();
    }

    private String financialAnalysis() {
        final Financier ashley = new Financier("Ashley");
        ashley.setMoneySpent(5000000);

        logger.info("Total amount spent in 2020 is: " + ashley.getMoneySpent());

        return "Total amount spent in 2020 is: " + ashley.getMoneySpent();
    }

    private String managerAdvisement(String advice) {
        final FinancialDirector debbie = new FinancialDirector("Debbie");

        logger.info(debbie.managerAdvisement("Be more conservative heading into the next fiscal year."));
        return debbie.managerAdvisement("Be more conservative heading into the next fiscal year.");

    }

    @Override
    protected Double earnings() {
        return null;
    }
}
