package com.neoteric.variable.hospitalappointments;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    private String fee;
    private PatientDetails patientDetails;
    private DocterDetails docterDetails;
    private Duration duration;
    private LocalTime startTime;
    private LocalTime endTime;
    private LocalDate date;


    public Appointment(String fee, PatientDetails patientDetails, DocterDetails docterDetails, Duration duration,LocalTime startTime,LocalDate date) {
        this.fee = fee;
        this.patientDetails = patientDetails;
        this.docterDetails = docterDetails;
        this.duration = duration;
        this.startTime=startTime;
        this.endTime=startTime.plusMinutes(30);
        this.date=date;

    }

    public String getFee() {
        return fee;
    }

    public PatientDetails getPatientDetails() {
        return patientDetails;
    }

    public DocterDetails getDocterDetails() {
        return docterDetails;
    }

    public Duration getDuration() {
        return duration;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public LocalDate getDate() {
        return date;
    }
}
