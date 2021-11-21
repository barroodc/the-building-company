package com.solvd.thebuildingcompany.employees.administration;

import com.solvd.thebuildingcompany.departments.Administration;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Logger;


public class ConstructionAdmin extends Administration {

    private final Logger logger = Logger.getLogger(ConstructionAdmin.class.getName());

    public ConstructionAdmin(String name) {
        this.setName(name);
    }

    @Override
    protected String contractMonitoring() {
        final ConstructionAdmin jason = new ConstructionAdmin("Jason");
        jason.setContractHonored(true);

        logger.info("Were vendor expectations met?: " + jason.isContractHonored());
        return "Were vendor expectations met?: " + jason.isContractHonored();
    }

    @Override
    protected ArrayList<String> processBillings() {
        final ConstructionAdmin mohammed = new ConstructionAdmin("Mohammed");
        ArrayList<String> invoices = new ArrayList<>();
        mohammed.setInvoiceSent(true);
        mohammed.setInvoiceReceived(false);
        invoices.add("Was an invoice sent?: " + mohammed.isInvoiceSent());
        invoices.add("Was an invoice received?: " + mohammed.isInvoiceReceived());
        logger.info(invoices.get(0));
        logger.info(invoices.get(1));
        return  invoices;
    }

    @Override
    protected String documentArchive() {
        final ConstructionAdmin david = new ConstructionAdmin("David");
        david.setDocuments("Blueprints from 2020");

        logger.info("Most recent archived documents include: " + david.getDocuments());
        return "Most recent archived documents include: " + david.getDocuments();
    }

    @Override
    protected ArrayList<String> arrangeProjectSchedules() {
        final ConstructionAdmin marry = new ConstructionAdmin("Marry");
        ArrayList<String> requests = new ArrayList<>();
        marry.setSchedule("XYZ Contractors");
        marry.setScheduleCreated(true);
        requests.add("Who submitted the last schedule request?: " + marry.getSchedule());
        requests.add(marry.getSchedule() + " schedule created: " + marry.isScheduleCreated());

        logger.info(requests.get(0));
        logger.info(requests.get(1));
        return requests;
    }

    @Override
    protected String workerSupervision() {
        final ConstructionAdmin hannah = new ConstructionAdmin("Hannah");
        hannah.setTrainingNeeded(true);
        logger.info("Training required for new Sales hires: " + hannah.isTrainingNeeded());
        return "Training required for new Sales hires: " + hannah.isTrainingNeeded();
    }

    @Override
    protected HashMap<String, String> clientMeetings() {
        final ConstructionAdmin adam = new ConstructionAdmin("Adam");
        final Calendar appointmentDate = Calendar.getInstance();
        appointmentDate.set(Calendar.YEAR, 2020);
        appointmentDate.set(Calendar.MONTH, Calendar.OCTOBER);
        appointmentDate.set(Calendar.DAY_OF_MONTH, 31);


        final Date date = appointmentDate.getTime();
        DateFormat stringDate = new SimpleDateFormat(" yyyy-MM-dd");
        String abcMeeting = stringDate.format(date);

        HashMap<String, String> clientDates = new HashMap<>();

        clientDates.put("ABC Contractors meeting with " + adam.getName(), abcMeeting);

        for (Map.Entry<String, String> set : clientDates.entrySet()) {
            logger.info(set.getKey());
        }

        return clientDates;
    }

    @Override
    protected ArrayList<String> dataEntry() {
        final ConstructionAdmin athena = new ConstructionAdmin("Athena");
        final ArrayList<String> signInLog = new ArrayList<>();
        signInLog.add("Chris");
        logger.info(athena.getName() + "'s sign in log: " + signInLog.get(0));
        return signInLog;
    }

    @Override
    protected HashMap<String, String> callLog() {
        final ConstructionAdmin nicole = new ConstructionAdmin("Nicole");
        final HashMap<String, String> callerAndLocation = new HashMap<>();
        callerAndLocation.put("Jones","Newtown");
        callerAndLocation.put("Wayne", "New York City");

        for (Map.Entry<String, String> set : callerAndLocation.entrySet()) {
            logger.info(set.getKey());
        }

        return callerAndLocation;
    }

    @Override
    protected HashMap<String, String> voicemailMessagesLog() {
        final ConstructionAdmin nathaniel = new ConstructionAdmin("Nathaniel");
        final HashMap<String, String> personAndMessage = new HashMap<>();
        personAndMessage.put(nathaniel.getName() + "'s voice message log: Andy Stride", "Needed to talk to management about upcoming project.");
        personAndMessage.put(nathaniel.getName() + "'s voice message log: Charles Brown", "Wanted a quote on the most recent bid.");

        for (Map.Entry<String, String> set : personAndMessage.entrySet()) {
            logger.info(set.getKey());
        }

        return personAndMessage;
    }

    @Override
    protected HashMap<String, Integer> emailInquiries() {
        final ConstructionAdmin herold = new ConstructionAdmin("Herold");
        HashMap<String, Integer> emailUrgency = new HashMap<>();
        emailUrgency.put(herold.getName() + "'s recorded number of urgent emails: ", 45);
        emailUrgency.put("Number of spam emails: ", 156);

        for (Map.Entry<String, Integer> set : emailUrgency.entrySet()) {
            logger.info(set.getKey());
        }

        return emailUrgency;
    }

    @Override
    protected String meetingTranscription() {
        final ConstructionAdmin arthur = new ConstructionAdmin("Arthur");
        final String transcription = "We should increase next years budget by 10 percent.";

        logger.info(arthur.getName() + "'s transcription: The transciption from the most recent meeting read: "  + transcription);
        return "The transcription from the most recent meeting read: " + transcription;
    }

    @Override
    protected HashMap<String, String> diaryManagement() {
        final ConstructionAdmin mikaela = new ConstructionAdmin("Mikaela");
        HashMap<String, String> ceoEvents = new HashMap<>();
        ceoEvents.put("8am Meeting", "Topic: New Business");

        for (Map.Entry<String, String> set : ceoEvents.entrySet()) {
            logger.info(set.getKey());
        }
        return ceoEvents;
    }

    @Override
    protected String bookMeetingRooms(boolean meetingRoomBooked) {
        final ConstructionAdmin jennifer = new ConstructionAdmin("Jennifer");

        logger.info(jennifer.getName() + ": Meeting room successfully booked: " + meetingRoomBooked);
        return jennifer.getName() + ": Meeting room successfully booked: " + meetingRoomBooked;
    }

    @Override
    protected String bookingConferenceFacilities(boolean conferenceBooked) {
        final ConstructionAdmin george = new ConstructionAdmin("George");

        logger.info(george.getName() + ": Conference room successfully booked" + conferenceBooked);
        return "Conference room successfully booked: " + conferenceBooked;
    }

    @Override
    protected ArrayList<String> administrativeSupport() {
        final ConstructionAdmin maggy = new ConstructionAdmin("Maggy");
        final ArrayList<String> peopleHelped = new ArrayList<>();
        peopleHelped.add(maggy.getName() + "'s help list: Jack from accounting");
        peopleHelped.add(maggy.getName() + "'s help list: Jessie from marketing");
        peopleHelped.add(maggy.getName() + "'s help list: Ilissa from Contractor Corp");

        return peopleHelped;
    }

    @Override
    protected ArrayList<String> visitorLog() {
        final ConstructionAdmin eve = new ConstructionAdmin("Eve");
        final ArrayList<String> visitorList = new ArrayList<>();
        visitorList.add("Charles from DEF Group");
        visitorList.add("Casey from CAD Software Company");

        logger.info(eve.getName() + "'s visitor log: " + visitorList.get(0));
        logger.info(eve.getName() + "'s visitor log: " + visitorList.get(1));

        return visitorList;
    }

    @Override
    protected String travelAndAccommodations(boolean hotelRoomBooked) {
        final ConstructionAdmin taylor = new ConstructionAdmin("Taylor");
        logger.info(taylor.getName() + ": Hotel room booked for loan officer: " + hotelRoomBooked);
        return  taylor.getName() + ": Hotel room booked for loan officer: " + hotelRoomBooked;
    }
}
