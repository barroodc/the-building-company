package com.solvd.thebuildingcompany.employees.informationtechemployees;

import com.solvd.thebuildingcompany.departments.InformationTechnology;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class NetworkAdministrator extends InformationTechnology {

    private final Logger logger = Logger.getLogger(NetworkAdministrator.class.getName());

    public NetworkAdministrator(String name) {
        this.setName(name);
    }

    @Override
    protected boolean weeklyMeetingsSet() {
        final NetworkAdministrator elon = new NetworkAdministrator("Elon");
        final Calendar meetingDate = Calendar.getInstance();
        meetingDate.set(Calendar.YEAR, 2022);
        meetingDate.set(Calendar.MONTH, Calendar.FEBRUARY);
        meetingDate.set(Calendar.DAY_OF_MONTH, 21);

        final Date networkBreachMeeting = meetingDate.getTime();

        HashMap<String, Date> meetingAndDate = new HashMap<>();
        meetingAndDate.put("Network Breaches in Quarter One", networkBreachMeeting);

        for (Map.Entry<String, Date> set :  meetingAndDate.entrySet()) {
            logger.info(set.getKey());
        }

        if (meetingAndDate.containsKey("Network Breaches in Quarter One")) {
            logger.info("true");
            return elon.isMeetingsSet();
        } else {
            logger.warning("false");
            return false;
        }
    }

    @Override
    protected boolean slackGroupAdded() {
        final NetworkAdministrator caitlin = new NetworkAdministrator("Caitlin");
        HashMap<String, String> slackGroupList = new HashMap<>();
        slackGroupList.put("Musk","Elon");
        slackGroupList.put("Blanche", "Caitlin");

        for (Map.Entry<String, String> set : slackGroupList.entrySet()) {
            logger.info(set.getKey());
        }

        if(slackGroupList.containsValue("Caitlin")) {
            logger.info("true");
            return caitlin.isMemberAdded();
        } else {
            logger.warning("false");
            return false;
        }
    }

    @Override
    protected boolean peopleWhoJoinedSlack() {
        final NetworkAdministrator edward = new NetworkAdministrator("Edward");
        HashMap<String, String> nameAndTitle = new HashMap<>();
        nameAndTitle.put("Edward", "Network Administrator");

        for (Map.Entry<String, String> set : nameAndTitle.entrySet()) {
            logger.info(set.getKey());
        }

        if (nameAndTitle.containsValue("Network Administrator")){
            logger.info("true");
            return edward.isAcceptedIntoGroup();
        }

        logger.warning("false");
        return false;
    }

    protected String maintenanceOfInternalNetwork() {
        final NetworkAdministrator andy = new NetworkAdministrator("Andy");
        andy.setDefenseUpdated(true);

        logger.info("Network Defense Layers Updated Successfully: " + andy.isDefenseUpdated());

        return "Network Defense Layers Updated Successfully: " + andy.isDefenseUpdated();
    }
}
