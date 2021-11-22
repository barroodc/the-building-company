package com.solvd.thebuildingcompany.employees.departments.informationtechnology;

import com.solvd.thebuildingcompany.employees.abstractclass.Employees;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class WebDeveloper extends Employees {

    private boolean websiteBuilt;
    private String name;
    private boolean meetingsSet;
    private boolean memberAdded;
    private boolean acceptedIntoGroup;

    public boolean isWebsiteBuilt() {
        return websiteBuilt;
    }

    public void setWebsiteBuilt(boolean websiteBuilt) {
        this.websiteBuilt = websiteBuilt;
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

    private final Logger logger = Logger.getLogger(WebDeveloper.class.getName());

    public WebDeveloper(String name) {
        this.setName(name);
    }

    private boolean weeklyMeetingsSet() {
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

    private boolean slackGroupAdded() {
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

    private boolean peopleWhoJoinedSlack() {
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

    private String constructionOfWebsite() {
        final WebDeveloper allison = new WebDeveloper("Allison");
        allison.setWebsiteBuilt(true);

        logger.info("Building Company currently has a functional website: " + allison.isWebsiteBuilt());

        return "Building Company currently has a functional website: " + allison.isWebsiteBuilt();
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
