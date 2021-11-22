package com.solvd.thebuildingcompany.employees.departments.informationtechnology;

import com.solvd.thebuildingcompany.employees.abstractclass.Employees;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class DatabaseAdministrator extends Employees {

    private int helpDeskTickets;
    private boolean maintenanceDone;
    private String name;
    private boolean meetingsSet;
    private boolean memberAdded;
    private boolean acceptedIntoGroup;

    public int getHelpDeskTickets() {
        return helpDeskTickets;
    }

    public void setHelpDeskTickets(int helpDeskTickets) {
        this.helpDeskTickets = helpDeskTickets;
    }

    public boolean isMaintenanceDone() {
        return maintenanceDone;
    }

    public void setMaintenanceDone(boolean maintenanceDone) {
        this.maintenanceDone = maintenanceDone;
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

    private final Logger logger = Logger.getLogger(DatabaseAdministrator.class.getName());

    public DatabaseAdministrator(String name) {
        this.setName(name);
    }

    private boolean weeklyMeetingsSet() {
        final DatabaseAdministrator deborah = new DatabaseAdministrator("Deborah");
        final Calendar meetingDate = Calendar.getInstance();
        meetingDate.set(Calendar.YEAR, 2022);
        meetingDate.set(Calendar.MONTH, Calendar.FEBRUARY);
        meetingDate.set(Calendar.DAY_OF_MONTH, 21);

        final Date databaseAdminUpdateMeeting = meetingDate.getTime();

        HashMap<String, Date> meetingAndDate = new HashMap<>();
        meetingAndDate.put("Database Administration Update Meeting", databaseAdminUpdateMeeting);

        for (Map.Entry<String, Date> set : meetingAndDate.entrySet()) {
            logger.info(set.getKey());
        }

        if (meetingAndDate.containsKey("Database Administration Update Meeting")) {
            logger.info("true");
            return deborah.isMeetingsSet();
        } else {
            logger.warning("Meeting has not been set");
            return false;
        }
    }

    private boolean slackGroupAdded() {
        final ITSpecialist cece = new ITSpecialist("Cece");
        HashMap<String, String> slackGroupList = new HashMap<>();
        slackGroupList.put("Clarkson","Deborah");
        slackGroupList.put("White", "Cece");

        for (Map.Entry<String, String> set : slackGroupList.entrySet()) {
            logger.info(set.getKey());
        }

        if(slackGroupList.containsValue("Cece")) {
            logger.info("Member has been added");
            return cece.isMemberAdded();
        } else {
            logger.warning("Member has not been added");
            return false;
        }
    }

    private boolean peopleWhoJoinedSlack() {
        final DatabaseAdministrator derek = new DatabaseAdministrator("Derek");
        HashMap<String, String> nameAndTitle = new HashMap<>();
        nameAndTitle.put("Derek", "Database Administrator");

        for (Map.Entry<String, String> set : nameAndTitle.entrySet()) {
            logger.info(set.getKey());
        }

        if (nameAndTitle.containsValue("User Experience Tester")){
            logger.info("true");
            return derek.isAcceptedIntoGroup();
        }
        logger.warning("Derek is denied access from group");
        return false;
    }

    private String databaseCreation() {
        final DatabaseAdministrator nicole = new DatabaseAdministrator("Nicole");
        nicole.setMaintenanceDone(true);

        logger.info("Databases Maintained: " + nicole.isMaintenanceDone());

        return "Databases Maintained: " + nicole.isMaintenanceDone();
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
