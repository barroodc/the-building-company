package com.solvd.thebuildingcompany.departments;

public abstract class Marketing {

    private double brandGrowth;
    private int marketingBudget;
    private String currentDesign;
    private int campaignBudget;
    private int dataMining;
    private int postsPerHour;
    private String slackGroup;
    private int uniqueDateFound;
    private String name;

    protected abstract String brandManagement();
    protected abstract String brandDefinition();
    protected abstract String campaignManagement();
    protected abstract String marketingMaterials();
    protected abstract String searchEngineOptimization();
    protected abstract String socialMediaManagement();
    protected abstract String internalCommunications();
    protected abstract String customerResearch();
    protected abstract String marketResearch();
    protected abstract String trackingOutsideVendors();
    protected abstract String pricingOfProjects();

    public double getBrandGrowth() {
        return brandGrowth;
    }

    public void setBrandGrowth(double brandGrowth) {
        this.brandGrowth = brandGrowth;
    }

    public int getMarketingBudget() {
        return marketingBudget;
    }

    public void setMarketingBudget(int marketingBudget) {
        this.marketingBudget = marketingBudget;
    }

    public String getCurrentDesign() {
        return currentDesign;
    }

    public void setCurrentDesign(String currentDesign) {
        this.currentDesign = currentDesign;
    }

    public int getCampaignBudget() {
        return campaignBudget;
    }

    public void setCampaignBudget(int campaignBudget) {
        this.campaignBudget = campaignBudget;
    }

    public int getDataMining() {
        return dataMining;
    }

    public void setDataMining(int dataMining) {
        this.dataMining = dataMining;
    }

    public int getPostsPerHour() {
        return postsPerHour;
    }

    public void setPostsPerHour(int postsPerHour) {
        this.postsPerHour = postsPerHour;
    }

    public String getSlackGroup() {
        return slackGroup;
    }

    public void setSlackGroup(String slackGroup) {
        this.slackGroup = slackGroup;
    }

    public int getUniqueDateFound() {
        return uniqueDateFound;
    }

    public void setUniqueDateFound(int uniqueDateFound) {
        this.uniqueDateFound = uniqueDateFound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
