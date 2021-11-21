package com.solvd.thebuildingcompany.employees.financeemployees;

import com.solvd.thebuildingcompany.departments.Finance;

import java.util.logging.Logger;

public class FinancialDirector extends Finance {

    private final Logger logger = Logger.getLogger(FinancialDirector.class.getName());

    public FinancialDirector(String name) {
        this.setName(name);
    }

    @Override
    protected String bookKeeping() {
        final Financier nelson = new Financier("Nelson");
        nelson.setAccountsPayable(50000);


        logger.info("Accounts payable as of quarter one 2021: " + nelson.getAccountsPayable());

        return "Accounts payable as of quarter one 2021: " + nelson.getAccountsPayable();
    }

    @Override
    protected String cashFlowManagement() {
        final Financier arthur = new Financier("Arthur");
        arthur.setMoneyReceived(600000000);

        logger.info("Total money received in 2019: " + arthur.getMoneyReceived());

        return "Total money received in 2019: " + arthur.getMoneyReceived();
    }

    @Override
    protected String budgets() {
        final Financier dominick = new Financier("Dominick");

        dominick.setMaxBudget(900000);

        logger.info("Maximum amount allowed to spend this calendar year: " + dominick.getMaxBudget());

        return "Maximum amount allowed to spend this calendar year: " + dominick.getMaxBudget();
    }

    @Override
    protected String forecasting() {
        final Financier andrew = new Financier("Andrew");
        andrew.setProfitForecast(85000000);

        logger.info("Maximum amount allowed to spend this calendar year: " + andrew.getProfitForecast());

        return "Estimated gross profit in quarter one of 2022 is: " + andrew.getProfitForecast();
    }

    @Override
    protected String longerTermFinancing() {
        final Financier charlie = new Financier("Charlie");
        charlie.setFixedInterestRate(3.567);

        logger.info("Long term financing for future projects secured at: " + charlie.getFixedInterestRate() + "%");

        return "Long term financing for future projects secured at: " + charlie.getFixedInterestRate() + "%";
    }

    @Override
    protected String shorterTermFinancing() {
        final Financier samantha = new Financier("Samantha");
        samantha.setShortTermRate(8.7);

        logger.info("Short term financing for future projects secured at: " + samantha.getShortTermRate() + "%");

        return "Short term financing for future projects secured at: " + samantha.getShortTermRate() + "%";
    }

    @Override
    protected String taxManagement() {
        final Financier derek = new Financier("Derek");
        derek.setTaxExemption("Accounting Fees");

        logger.info("Make sure to have accounting apply the following exemption: " + derek.getTaxExemption());

        return "Make sure to have accounting apply the following exemption: " + derek.getTaxExemption();
    }

    @Override
    protected String investmentManagement() {
        final Financier trevor = new Financier("Trevor");
        trevor.setMoneySpent(50000);

        logger.info("Total amount spent on client outings this year is: $" + trevor.getMoneySpent());

        return "Total amount spent on client outings this year is: $" + trevor.getMoneySpent();
    }

    @Override
    protected String financialReporting() {
        final Financier harley = new Financier("Harley");
        harley.setMoneySpent(285000);

        logger.info("Total amount spent in quarter four of this year is: $" + harley.getMoneySpent());

        return "Total amount spent in quarter four of this year is: $" + harley.getMoneySpent();
    }

    @Override
    protected String financialAnalysis() {
        final Financier ashley = new Financier("Ashley");
        ashley.setMoneySpent(5000000);

        logger.info("Total amount spent in 2020 is: " + ashley.getMoneySpent());

        return "Total amount spent in 2020 is: " + ashley.getMoneySpent();
    }

    @Override
    protected String managerAdvisement(String advice) {
        final FinancialDirector debbie = new FinancialDirector("Debbie");

        logger.info(debbie.managerAdvisement("Be more conservative heading into the next fiscal year."));
        return debbie.managerAdvisement("Be more conservative heading into the next fiscal year.");

    }
}
