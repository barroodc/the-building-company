package com.solvd.thebuildingcompany.employees.informationtechemployees;

import com.solvd.thebuildingcompany.departments.InformationTechnology;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class ITSpecialist extends InformationTechnology {

    private final Logger logger = Logger.getLogger(ITSpecialist.class.getName());

    public ITSpecialist(String name) {
        this.setName(name);
    }

    @Override
    protected boolean weeklyMeetingsSet() {
        final ITSpecialist ursula = new ITSpecialist("Ursula");
        final Calendar meetingDate = Calendar.getInstance();
        meetingDate.set(Calendar.YEAR, 2022);
        meetingDate.set(Calendar.MONTH, Calendar.MARCH);
        meetingDate.set(Calendar.DAY_OF_MONTH, 17);

        final Date routineCheckupMeeting = meetingDate.getTime();

        HashMap<String, Date> meetingAndDate = new HashMap<>();
        meetingAndDate.put("Routine Checkup Meeting", routineCheckupMeeting);

        for (Map.Entry<String, Date> set : meetingAndDate.entrySet()) {
            logger.info(set.getKey());
        }

        if (meetingAndDate.containsKey("Routine Checkup Meeting")) {
            logger.info("true");
            return ursula.isMeetingsSet();
        } else {
            logger.warning("false");
            return false;
        }
    }

    @Override
    protected boolean slackGroupAdded() {
        final ITSpecialist janet = new ITSpecialist("Janet");
        HashMap<String, String> slackGroupList = new HashMap<>();
        slackGroupList.put("Smith","Ursula");
        slackGroupList.put("Jackson", "Janet");

        for (Map.Entry<String, String> set : slackGroupList.entrySet()) {
            logger.info(set.getKey());
        }

        if(slackGroupList.containsValue("Janet")) {
            logger.info("true");
            return janet.isMemberAdded();
        } else {
            logger.warning("false");
            return false;
        }
    }

    @Override
    protected boolean peopleWhoJoinedSlack() {
        final ITSpecialist gabriella = new ITSpecialist("Gabriella");
        HashMap<String, String> nameAndTitle = new HashMap<>();
        nameAndTitle.put("Gabriella", "IT Specialist");

        for (Map.Entry<String, String> set : nameAndTitle.entrySet()) {
            logger.info(set.getKey());
        }

        if (nameAndTitle.containsValue("IT Specialist")){
            logger.info("true");
            return gabriella.isAcceptedIntoGroup();
        }
        logger.warning("false");
        return false;
    }

    protected String technicalSupport() {
        final ITSpecialist lincoln = new ITSpecialist("Lincoln");

        lincoln.setHelpDeskTickets(50);

        logger.info("On average in a day," + lincoln.getName() + " handles " + lincoln.getHelpDeskTickets() + "employee inquiries.");

        return "On average in a day," + lincoln.getName() + " handles " + lincoln.getHelpDeskTickets() + "employee inquiries.";
    }

    protected HashMap<String, Boolean> installCommunicationTechnology() {
        final ITSpecialist richard = new ITSpecialist("Richard");
        richard.setSoftwareInstall(true);


        final HashMap<String, Boolean> installedSoftware = new HashMap<>();
        installedSoftware.put("Bid Management Software Installed: ", richard.isSoftwareInstall());
        installedSoftware.put("BIM Software Installed", richard.isSoftwareInstall());

        for (Map.Entry<String, Boolean> set : installedSoftware.entrySet()) {
            logger.info(set.getKey());
        }
        return installedSoftware;
    }

    protected String communicationTechnologySupport() {
        final ITSpecialist karen = new ITSpecialist("Karen");
        karen.setHelpDeskTickets(20);

        logger.info("Communication Department Help Desk Ticket Total: " + karen.getHelpDeskTickets());

        return "Communication Department Help Desk Ticket Total: " + karen.getHelpDeskTickets();
    }

    protected HashMap<String, Boolean> graphicEditingSoftware() {
        //When I have more functions I should incorporate UX Designer and UI designer here
        final ITSpecialist james = new ITSpecialist("James");
        james.setSoftwareInstall(true);

        final HashMap<String, Boolean> softwareInstall = new HashMap<>();
        softwareInstall.put("The computer aided design systems were installed: ", james.isSoftwareInstall());

        logger.info("The computer aided design systems were installed: true");

        return softwareInstall;
    }

    protected String businessSoftware() {
        //Figure out a way to incorporate a tech role object in here (ITSpecialist)
        boolean updateAvailable = true;

        logger.info("Firmware Update Available: " + updateAvailable);
        return "Firmware Update Available: " + updateAvailable;
    }
}
