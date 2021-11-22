package com.solvd.thebuildingcompany.employees.departments.administration;

import com.solvd.thebuildingcompany.employees.abstractclass.Employees;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Logger;


public class ConstructionAdmin extends Employees {

    private boolean contractHonored;
    private boolean invoiceReceived;
    private boolean invoiceSent;
    private String documents;
    private String schedule;
    private boolean scheduleCreated;
    private boolean trainingNeeded;
    private String name;

    public boolean isContractHonored() {
        return contractHonored;
    }

    public void setContractHonored(boolean contractHonored) {
        this.contractHonored = contractHonored;
    }

    public boolean isInvoiceReceived() {
        return invoiceReceived;
    }

    public void setInvoiceReceived(boolean invoiceReceived) {
        this.invoiceReceived = invoiceReceived;
    }

    public boolean isInvoiceSent() {
        return invoiceSent;
    }

    public void setInvoiceSent(boolean invoiceSent) {
        this.invoiceSent = invoiceSent;
    }

    public String getDocuments() {
        return documents;
    }

    public void setDocuments(String documents) {
        this.documents = documents;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public boolean isScheduleCreated() {
        return scheduleCreated;
    }

    public void setScheduleCreated(boolean scheduleCreated) {
        this.scheduleCreated = scheduleCreated;
    }

    public boolean isTrainingNeeded() {
        return trainingNeeded;
    }

    public void setTrainingNeeded(boolean trainingNeeded) {
        this.trainingNeeded = trainingNeeded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private final Logger logger = Logger.getLogger(ConstructionAdmin.class.getName());

    public ConstructionAdmin(String name) {
        this.setName(name);
    }

    private String contractMonitoring() {
        final ConstructionAdmin jason = new ConstructionAdmin("Jason");
        jason.setContractHonored(true);

        logger.info("Were vendor expectations met?: " + jason.isContractHonored());
        return "Were vendor expectations met?: " + jason.isContractHonored();
    }

    private ArrayList<String> processBillings() {
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

    private String documentArchive() {
        final ConstructionAdmin david = new ConstructionAdmin("David");
        david.setDocuments("Blueprints from 2020");

        logger.info("Most recent archived documents include: " + david.getDocuments());
        return "Most recent archived documents include: " + david.getDocuments();
    }

    private ArrayList<String> arrangeProjectSchedules() {
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

    private String workerSupervision() {
        final ConstructionAdmin hannah = new ConstructionAdmin("Hannah");
        hannah.setTrainingNeeded(true);
        logger.info("Training required for new Sales hires: " + hannah.isTrainingNeeded());
        return "Training required for new Sales hires: " + hannah.isTrainingNeeded();
    }

    private HashMap<String, String> clientMeetings() {
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

    private ArrayList<String> dataEntry() {
        final ConstructionAdmin athena = new ConstructionAdmin("Athena");
        final ArrayList<String> signInLog = new ArrayList<>();
        signInLog.add("Chris");
        logger.info(athena.getName() + "'s sign in log: " + signInLog.get(0));
        return signInLog;
    }

    private HashMap<String, String> callLog() {
        final ConstructionAdmin nicole = new ConstructionAdmin("Nicole");
        final HashMap<String, String> callerAndLocation = new HashMap<>();
        callerAndLocation.put("Jones","Newtown");
        callerAndLocation.put("Wayne", "New York City");

        for (Map.Entry<String, String> set : callerAndLocation.entrySet()) {
            logger.info(set.getKey());
        }

        return callerAndLocation;
    }

    private HashMap<String, String> voicemailMessagesLog() {
        final ConstructionAdmin nathaniel = new ConstructionAdmin("Nathaniel");
        final HashMap<String, String> personAndMessage = new HashMap<>();
        personAndMessage.put(nathaniel.getName() + "'s voice message log: Andy Stride", "Needed to talk to management about upcoming project.");
        personAndMessage.put(nathaniel.getName() + "'s voice message log: Charles Brown", "Wanted a quote on the most recent bid.");

        for (Map.Entry<String, String> set : personAndMessage.entrySet()) {
            logger.info(set.getKey());
        }

        return personAndMessage;
    }

    private HashMap<String, Integer> emailInquiries() {
        final ConstructionAdmin herold = new ConstructionAdmin("Herold");
        HashMap<String, Integer> emailUrgency = new HashMap<>();
        emailUrgency.put(herold.getName() + "'s recorded number of urgent emails: ", 45);
        emailUrgency.put("Number of spam emails: ", 156);

        for (Map.Entry<String, Integer> set : emailUrgency.entrySet()) {
            logger.info(set.getKey());
        }

        return emailUrgency;
    }

    private String meetingTranscription() {
        final ConstructionAdmin arthur = new ConstructionAdmin("Arthur");
        final String transcription = "We should increase next years budget by 10 percent.";

        logger.info(arthur.getName() + "'s transcription: The transciption from the most recent meeting read: "  + transcription);
        return "The transcription from the most recent meeting read: " + transcription;
    }

    private HashMap<String, String> diaryManagement() {
        final ConstructionAdmin mikaela = new ConstructionAdmin("Mikaela");
        HashMap<String, String> ceoEvents = new HashMap<>();
        ceoEvents.put("8am Meeting", "Topic: New Business");

        for (Map.Entry<String, String> set : ceoEvents.entrySet()) {
            logger.info(set.getKey());
        }
        return ceoEvents;
    }

    private String bookMeetingRooms(boolean meetingRoomBooked) {
        final ConstructionAdmin jennifer = new ConstructionAdmin("Jennifer");

        logger.info(jennifer.getName() + ": Meeting room successfully booked: " + meetingRoomBooked);
        return jennifer.getName() + ": Meeting room successfully booked: " + meetingRoomBooked;
    }

    private String bookingConferenceFacilities(boolean conferenceBooked) {
        final ConstructionAdmin george = new ConstructionAdmin("George");

        logger.info(george.getName() + ": Conference room successfully booked" + conferenceBooked);
        return "Conference room successfully booked: " + conferenceBooked;
    }

    private ArrayList<String> administrativeSupport() {
        final ConstructionAdmin maggy = new ConstructionAdmin("Maggy");
        final ArrayList<String> peopleHelped = new ArrayList<>();
        peopleHelped.add(maggy.getName() + "'s help list: Jack from accounting");
        peopleHelped.add(maggy.getName() + "'s help list: Jessie from marketing");
        peopleHelped.add(maggy.getName() + "'s help list: Ilissa from Contractor Corp");

        return peopleHelped;
    }

    private ArrayList<String> visitorLog() {
        final ConstructionAdmin eve = new ConstructionAdmin("Eve");
        final ArrayList<String> visitorList = new ArrayList<>();
        visitorList.add("Charles from DEF Group");
        visitorList.add("Casey from CAD Software Company");

        logger.info(eve.getName() + "'s visitor log: " + visitorList.get(0));
        logger.info(eve.getName() + "'s visitor log: " + visitorList.get(1));

        return visitorList;
    }

    private String travelAndAccommodations(boolean hotelRoomBooked) {
        final ConstructionAdmin taylor = new ConstructionAdmin("Taylor");
        logger.info(taylor.getName() + ": Hotel room booked for loan officer: " + hotelRoomBooked);
        return  taylor.getName() + ": Hotel room booked for loan officer: " + hotelRoomBooked;
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
