package com.solvd.thebuildingcompany.departments;

public abstract class InformationTechnology {

    private int helpDeskTickets;
    private boolean softwareInstall;
    private boolean maintenanceDone;
    private boolean websiteBuilt;
    private boolean testPlanCreated;
    private boolean defenseUpdated;
    private boolean taskDone;
    private String name;
    private boolean meetingsSet;
    private boolean memberAdded;
    private boolean acceptedIntoGroup;

    protected abstract boolean weeklyMeetingsSet();
    protected abstract boolean slackGroupAdded();
    protected abstract boolean peopleWhoJoinedSlack();


    public int getHelpDeskTickets() {
        return helpDeskTickets;
    }

    public void setHelpDeskTickets(int helpDeskTickets) {
        this.helpDeskTickets = helpDeskTickets;
    }

    public boolean isSoftwareInstall() {
        return softwareInstall;
    }

    public void setSoftwareInstall(boolean softwareInstall) {
        this.softwareInstall= softwareInstall;
    }

    public boolean isMaintenanceDone() {
        return maintenanceDone;
    }

    public void setMaintenanceDone(boolean maintenanceDone) {
        this.maintenanceDone = maintenanceDone;
    }

    public boolean isWebsiteBuilt() {
        return websiteBuilt;
    }

    public void setWebsiteBuilt(boolean websiteBuilt) {
        this.websiteBuilt = websiteBuilt;
    }

    public boolean isTestPlanCreated() {
        return testPlanCreated;
    }

    public void setTestPlanCreated(boolean testPlanCreated) {
        this.testPlanCreated = testPlanCreated;
    }

    public boolean isDefenseUpdated() {
        return defenseUpdated;
    }

    public void setDefenseUpdated(boolean defenseUpdated) {
        this.defenseUpdated = defenseUpdated;
    }

    public boolean isTaskDone() {
        return taskDone;
    }

    public void setTaskDone(boolean taskDone) {
        this.taskDone = taskDone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMeetingsSet() {
        return meetingsSet;
    }

    public void setMeetingsSet(boolean meetingsSet) {
        this.meetingsSet = meetingsSet;
    }

    public boolean isMemberAdded() {
        return memberAdded;
    }

    public void setMemberAdded(boolean memberAdded) {
        this.memberAdded = memberAdded;
    }

    public boolean isAcceptedIntoGroup() {
        return acceptedIntoGroup;
    }

    public void setAcceptedIntoGroup(boolean acceptedIntoGroup) {
        this.acceptedIntoGroup = acceptedIntoGroup;
    }
}
