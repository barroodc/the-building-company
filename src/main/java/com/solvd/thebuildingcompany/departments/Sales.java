package com.solvd.thebuildingcompany.departments;

public abstract class Sales {

    private int surveysCompleted;
    private boolean marketingSent;
    private int prospectsReached;
    private int prospectsConverted;
    private boolean bidsAreSteady; //Consistent
    private boolean proposalCheckIn;
    private String name;

    protected abstract String marketResearch();
    protected abstract String advertisingForSales();
    protected abstract String businessProspecting();
    protected abstract String constructionBidConsistency();
    protected abstract String customerService();

    public int getSurveysCompleted() {
        return surveysCompleted;
    }

    public void setSurveysCompleted(int surveysCompleted) {
        this.surveysCompleted = surveysCompleted;
    }

    public boolean isMarketingSent() {
        return marketingSent;
    }

    public void setMarketingSent(boolean marketingSent) {
        this.marketingSent = marketingSent;
    }

    public int getProspectsReached() {
        return prospectsReached;
    }

    public void setProspectsReached(int prospectsReached) {
        this.prospectsReached = prospectsReached;
    }

    public int getProspectsConverted() {
        return prospectsConverted;
    }

    public void setNumberOfProspectsConverted(int prospectsConverted) {
        this.prospectsConverted = prospectsConverted;
    }

    public boolean isBidsAreSteady() {
        return bidsAreSteady;
    }

    public void setBidsAreSteady(boolean bidsAreSteady) {
        this.bidsAreSteady = bidsAreSteady;
    }

    public boolean isProposalCheckIn() {
        return proposalCheckIn;
    }

    public void setProposalCheckIn(boolean proposalCheckIn) {
        this.proposalCheckIn = proposalCheckIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
