package com.solvd.thebuildingcompany.employees.informationtechemployees;

import com.solvd.thebuildingcompany.departments.InformationTechnology;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class UserExperienceTester extends InformationTechnology {

    private final Logger logger = Logger.getLogger(UserExperienceTester.class.getName());

    public UserExperienceTester(String name) {
        this.setName(name);
    }


    @Override
    protected boolean weeklyMeetingsSet() {
        final UserExperienceTester giana = new UserExperienceTester("Giana");
        final Calendar meetingDate = Calendar.getInstance();
        meetingDate.set(Calendar.YEAR, 2021);
        meetingDate.set(Calendar.MONTH, Calendar.DECEMBER);
        meetingDate.set(Calendar.DAY_OF_MONTH, 29);

        final Date brandNewGoals = meetingDate.getTime();

        HashMap<String, Date> meetingAndDate = new HashMap<>();
        meetingAndDate.put("New Design Goals", brandNewGoals);

        for (Map.Entry<String, Date> set : meetingAndDate.entrySet()) {
            logger.info(set.getKey());
        }

        if (meetingAndDate.containsKey("New Design Goals")) {
            logger.info("true");
            return giana.isMeetingsSet();
        } else {
            logger.warning("false");
            return false;
        }
    }

    @Override
    protected boolean slackGroupAdded() {
        final UserExperienceTester johnny = new UserExperienceTester("Troy");
        HashMap<String, String> slackGroupList = new HashMap<>();
        slackGroupList.put("Carson","Johnny");
        slackGroupList.put("McDaniels", "Giana");

        for (Map.Entry<String, String> set : slackGroupList.entrySet()) {
            logger.info(set.getKey());
        }

        if(slackGroupList.containsValue("Troy")) {
            logger.info("true");
            return johnny.isMemberAdded();
        } else {
            logger.warning("false");
            return false;
        }
    }

    @Override
    protected boolean peopleWhoJoinedSlack() {
        final WebDeveloper thane = new WebDeveloper("Thane");
        HashMap<String, String> nameAndTitle = new HashMap<>();
        nameAndTitle.put("Thane", "User Experience Tester");

        for (Map.Entry<String, String> set : nameAndTitle.entrySet()) {
            logger.info(set.getKey());
        }

        if (nameAndTitle.containsValue("User Experience Tester")){
            return thane.isAcceptedIntoGroup();
        }

        logger.warning("false");
        return false;
    }

    protected String usabilityTest() {
        final UserExperienceTester neha = new UserExperienceTester("Neha");
        neha.setTestPlanCreated(true);

        logger.info("UX Design test created: "  + neha.isTestPlanCreated());

        return "UX Design test created: "  + neha.isTestPlanCreated();
    }
}
