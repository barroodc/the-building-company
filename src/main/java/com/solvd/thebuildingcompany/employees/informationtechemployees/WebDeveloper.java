package com.solvd.thebuildingcompany.employees.informationtechemployees;

import com.solvd.thebuildingcompany.departments.InformationTechnology;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class WebDeveloper extends InformationTechnology {

    private final Logger logger = Logger.getLogger(WebDeveloper.class.getName());

    public WebDeveloper(String name) {
        this.setName(name);
    }

    @Override
    protected boolean weeklyMeetingsSet() {
        final WebDeveloper diane = new WebDeveloper("Diane");
        final Calendar meetingDate = Calendar.getInstance();
        meetingDate.set(Calendar.YEAR, 2022);
        meetingDate.set(Calendar.MONTH, Calendar.JANUARY);
        meetingDate.set(Calendar.DAY_OF_MONTH, 29);

        final Date featuresMeeting = meetingDate.getTime();

        HashMap<String, Date> meetingAndDate = new HashMap<>();
        meetingAndDate.put("Updated features", featuresMeeting);

        for (Map.Entry<String, Date> set : meetingAndDate.entrySet()) {
            logger.info(set.getKey());
        }

        if (meetingAndDate.containsKey("Updated features")) {
            logger.info("true");
            return diane.isMeetingsSet();
        } else {
            logger.warning("false");
            return false;
        }
    }

    @Override
    protected boolean slackGroupAdded() {
        final UserExperienceTester troy = new UserExperienceTester("Troy");
        HashMap<String, String> slackGroupList = new HashMap<>();
        slackGroupList.put("Cravits","Troy");
        slackGroupList.put("Smith", "Diane");

        for (Map.Entry<String, String> set : slackGroupList.entrySet()) {
            logger.info(set.getKey());
        }

        if(slackGroupList.containsValue("Troy")) {
            logger.info("true");
            return troy.isMemberAdded();
        } else {
            logger.warning("false");
            return false;
        }
    }

    @Override
    protected boolean peopleWhoJoinedSlack() {
        final WebDeveloper brendan = new WebDeveloper("Brendan");
        HashMap<String, String> nameAndTitle = new HashMap<>();
        nameAndTitle.put("Brendan", "Web Developer");

        for (Map.Entry<String, String> set : nameAndTitle.entrySet()) {
            logger.info(set.getKey());
        }

        if (nameAndTitle.containsValue("Web Developer")){
            logger.info("true");
            return brendan.isAcceptedIntoGroup();
        }
        logger.info("false");
        return false;
    }

    protected String constructionOfWebsite() {
        final WebDeveloper allison = new WebDeveloper("Allison");
        allison.setWebsiteBuilt(true);

        logger.info("Building Company currently has a functional website: " + allison.isWebsiteBuilt());

        return "Building Company currently has a functional website: " + allison.isWebsiteBuilt();
    }
}
