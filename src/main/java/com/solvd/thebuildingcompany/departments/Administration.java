package com.solvd.thebuildingcompany.departments;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Administration {

    private boolean contractHonored;
    private boolean invoiceReceived;
    private boolean invoiceSent;
    private String documents;
    private String schedule;
    private boolean scheduleCreated;
    private boolean trainingNeeded;
    private String name;

    protected abstract String contractMonitoring();
    protected abstract ArrayList<String> processBillings();
    protected abstract String documentArchive();
    protected abstract ArrayList<String> arrangeProjectSchedules();
    protected abstract String workerSupervision();
    protected abstract HashMap<String, String> clientMeetings();
    protected abstract ArrayList<String> dataEntry();
    protected abstract HashMap<String, String> callLog();
    protected abstract HashMap<String, String> voicemailMessagesLog();
    protected abstract HashMap<String, Integer> emailInquiries();
    protected abstract String meetingTranscription();
    protected abstract HashMap<String, String> diaryManagement();
    protected abstract String bookMeetingRooms(boolean meetingRoomBooked);
    protected abstract String bookingConferenceFacilities(boolean conferenceBooked);
    protected abstract ArrayList<String> administrativeSupport();
    protected abstract ArrayList<String> visitorLog();
    protected abstract String travelAndAccommodations(boolean hotelRoomBooked);

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
}
