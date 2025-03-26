package com.neoteric.variable.hospitalappointments;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class AppointmentTest {
    public static void main(String[] args) {
        AppointmentService appointmentService = new AppointmentService();
        DocterDetails doctor = new DocterDetails("Monoj", "Cardiologist");
        PatientDetails patient = new PatientDetails("Kallu", 21, "Female", "Heart", new Date());
        PatientDetails patient1 = new PatientDetails("dfg", 21, "Female", "Heart", new Date());

        LocalDate appointmentDate = LocalDate.of(2025, 3, 25);

        LocalTime startTime1 = LocalTime.of(10, 30);
        LocalTime startTime2 = LocalTime.of(11, 00);
        Duration duration = Duration.ofMinutes(30);



        Appointment appointment = new Appointment("300", patient, doctor, duration,startTime1,appointmentDate  );
        Appointment appointment1 = new Appointment("300",patient1, doctor, duration,startTime2,appointmentDate );







        appointmentService.appointmentstatus(appointment);

        appointmentService.appointmentstatus(appointment1);




    }
}
