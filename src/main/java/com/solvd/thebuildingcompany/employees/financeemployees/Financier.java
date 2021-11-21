package com.solvd.thebuildingcompany.employees.financeemployees;

import com.solvd.thebuildingcompany.departments.Finance;

import java.util.logging.Logger;

public class Financier extends Finance {

    private final Logger logger = Logger.getLogger(Financier.class.getName());

    public Financier(String name) {
        this.setName(name);
    }

    @Override
    protected String bookKeeping() {
        final Financier ivy = new Financier("Ivy");
        ivy.setAccountsPayable(50000);

        logger.info("Accounts payable as of quarter one 2021: " + ivy.getAccountsPayable());


        return "Accounts payable as of quarter one 2021: " + ivy.getAccountsPayable();
    }

    @Override
    protected String cashFlowManagement() {
        final Financier nora = new Financier("Nora");
        nora.setMoneyReceived(600000000);

        logger.info("Total money received in 2019: " + nora.getMoneyReceived());
        return "Total money received in 2019: " + nora.getMoneyReceived();
    }

    @Override
    protected String budgets() {
        final Financier addison = new Financier("Addison");

        addison.setMaxBudget(900000);

        logger.info("Maximum amount allowed to spend this calendar year: " + addison.getMaxBudget());

        return "Maximum amount allowed to spend this calendar year: " + addison.getMaxBudget();
    }

    @Override
    protected String forecasting() {
        final Financier eli = new Financier("Eli");
        eli.setProfitForecast(85000000);

        logger.info("Estimated gross profit in quarter one of 2022 is: " + eli.getProfitForecast());

        return "Estimated gross profit in quarter one of 2022 is: " + eli.getProfitForecast();
    }

    @Override
    protected String longerTermFinancing() {
        final Financier kai = new Financier("Kai");
        kai.setFixedInterestRate(3.567);

        logger.info("Long term financing for future projects secured at: " + kai.getFixedInterestRate() + "%");

        return "Long term financing for future projects secured at: " + kai.getFixedInterestRate() + "%";
    }

    @Override
    protected String shorterTermFinancing() {
        final Financier maverick = new Financier("Maverick");
        maverick.setShortTermRate(8.7);

        logger.info("Short term financing for future projects secured at: " + maverick.getShortTermRate() + "%");

        return "Short term financing for future projects secured at: " + maverick.getShortTermRate() + "%";
    }

    @Override
    protected String taxManagement() {
        final Financier fabio = new Financier("Fabio");
        fabio.setTaxExemption("Accounting Fees");

        logger.info("Make sure to have accounting apply the following exemption: " + fabio.getTaxExemption());

        return "Make sure to have accounting apply the following exemption: " + fabio.getTaxExemption();
    }

    @Override
    protected String investmentManagement() {
        final Financier willow = new Financier("Willow");
        willow.setMoneySpent(50000);

        logger.info("Total amount spent on client outings this year is: $" + willow.getMoneySpent());

        return "Total amount spent on client outings this year is: $" + willow.getMoneySpent();
    }

    @Override
    protected String financialReporting() {
        final Financier penelope = new Financier("Penelope");
        penelope.setMoneySpent(285000);

        logger.info("Total amount spent in quarter four of this year is: $" + penelope.getMoneySpent());

        return "Total amount spent in quarter four of this year is: $" + penelope.getMoneySpent();
    }

    @Override
    protected String financialAnalysis() {
        final Financier rylee = new Financier("Rylee");
        rylee.setMoneySpent(5000000);

        logger.info("Total amount spent in 2020 is: " + rylee.getMoneySpent());

        return "Total amount spent in 2020 is: " + rylee.getMoneySpent();
    }

    @Override
    protected String managerAdvisement(String advice) {
        final FinancialDirector hazel = new FinancialDirector("Hazel");

        //need to fix this:
        //logger.info(hazel.managerAdvisement("Be more conservative heading into the next fiscal year."));
        //return hazel.managerAdvisement("Be more conservative heading into the next fiscal year.");
       return null;
    }
}
