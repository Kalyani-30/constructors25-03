package com.neoteric.variable.hospitalappointments;

public class DocterDetails {
    private  String doctorName;
    private String specialization;

    public DocterDetails(String doctorName, String specialization) {
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return "DocterDetails{" +
                "doctorName='" + doctorName + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
