package com.solvd.thebuildingcompany.departments;

import java.util.ArrayList;

public abstract class CommunityRelations {

    private double totalBuyoutAmount;
    private boolean landBought;
    private int positiveFeedback;
    private int negativeFeedback;
    private int communityCalls;
    private int communityEmails;
    private boolean buildingSiteClean;
    private String name;

    protected abstract String offeringFinancialCompensation();
    protected abstract ArrayList<String> communitySurvey();
    protected abstract ArrayList<String> openCommunicationNetwork();
    protected abstract ArrayList<String> listOfConcerns();
    protected abstract String siteCleanliness();

    public double getTotalBuyoutAmount() {
        return totalBuyoutAmount;
    }

    public void setTotalBuyoutAmount(double totalBuyoutAmount) {
        this.totalBuyoutAmount = totalBuyoutAmount;
    }

    public boolean isLandBought() {
        return landBought;
    }

    public void setLandBought(boolean landBought) {
        this.landBought = landBought;
    }

    public int getPositiveFeedback() {
        return positiveFeedback;
    }

    public void setPositiveFeedback(int positiveFeedback) {
        this.positiveFeedback = positiveFeedback;
    }

    public int getNegativeFeedback() {
        return negativeFeedback;
    }

    public void setNegativeFeedback(int negativeFeedback) {
        this.negativeFeedback = negativeFeedback;
    }

    public int getCommunityCalls() {
        return communityCalls;
    }

    public void setCommunityCalls(int communityCalls) {
        this.communityCalls = communityCalls;
    }

    public int getCommunityEmails() {
        return communityEmails;
    }

    public void setCommunityEmails(int communityEmails) {
        this.communityEmails = communityEmails;
    }

    public boolean isBuildingSiteClean() {
        return buildingSiteClean;
    }

    public void setBuildingSiteClean(boolean buildingSiteClean) {
        this.buildingSiteClean = buildingSiteClean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*private String offeringFinancialCompensation() {
        final CommunityRelations buyOut = new CommunityRelations();
        buyOut.setTotalBuyoutAmount(100000000);
        buyOut.setLandBought(false);


        return "Have they all been bought out yet?: " + buyOut.landBought;
    }

    private ArrayList<String> communitySurvey() {
        final CommunityRelations opinionsOnProject = new CommunityRelations();
        opinionsOnProject.setPositiveFeedback(250);
        opinionsOnProject.setNegativeFeedback(45);

        final ArrayList<String> communityOpinion = new ArrayList<>();
        communityOpinion.add("Number of positive survey results" + opinionsOnProject.getPositiveFeedback());
        communityOpinion.add("Number of negative survey results" + opinionsOnProject.getNegativeFeedback());

        return communityOpinion;
    }

    private ArrayList<String> openCommunicationNetwork() {
         final CommunityRelations contactedUs = new CommunityRelations();
         contactedUs.setCommunityCalls(34);
         contactedUs.setCommunityEmails(87);

         final ArrayList<String> contactCount = new ArrayList<>();
         contactCount.add("Number of calls regarding project: " + contactedUs.getCommunityCalls());
         contactCount.add("Number of emails regarding project: " + contactedUs.getCommunityEmails());

         return contactCount;
    }

    private ArrayList<String> listOfConcerns() {
        final ArrayList<String> communityConcerns = new ArrayList<>();
        communityConcerns.add("Construction will contaminate water supply.");
        communityConcerns.add("Not wanting to move from their forever home.");
        communityConcerns.add("Relocation compensation not enough.");

        return communityConcerns;
    }

    private String siteCleanliness() {
       final CommunityRelations isSiteClean = new CommunityRelations();
       isSiteClean.setBuildingSiteClean(true);

       return "Is the construction site clean?: " + isSiteClean.isBuildingSiteClean();
    }

     */
}
