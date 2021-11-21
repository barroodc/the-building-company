package com.solvd.thebuildingcompany.employees.informationtechemployees;

import com.solvd.thebuildingcompany.departments.InformationTechnology;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class DatabaseAdministrator extends InformationTechnology {

    private final Logger logger = Logger.getLogger(DatabaseAdministrator.class.getName());

    public DatabaseAdministrator(String name) {
        this.setName(name);
    }

    @Override
    protected boolean weeklyMeetingsSet() {
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

    @Override
    protected boolean slackGroupAdded() {
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

    @Override
    protected boolean peopleWhoJoinedSlack() {
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

    protected String databaseCreation() {
        final DatabaseAdministrator nicole = new DatabaseAdministrator("Nicole");
        nicole.setMaintenanceDone(true);

        logger.info("Databases Maintained: " + nicole.isMaintenanceDone());

        return "Databases Maintained: " + nicole.isMaintenanceDone();
    }
}
