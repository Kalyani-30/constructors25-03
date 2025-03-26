package com.neoteric.variable.hospitalappointments;



public class AppointmentService {

     int appointment = 32;

   //  AccessSpecifier Returntype methodname(input){}

    public void appointmentstatus(Appointment appointment1){



        if(appointment<=32){
            System.out.println("appointment is avaliable"+appointment1.getPatientDetails().getName()+" with the docter "+appointment1.getDocterDetails().getDoctorName());
            System.out.println("Start Time: " + appointment1.getStartTime());
            System.out.println("End Time: " + appointment1.getEndTime().plus(appointment1.getDuration()));
            System.out.println("Appointment Date: " + appointment1.getDate());
            System.out.println("Duration: " + appointment1.getDuration().toMinutes() + " minutes");

            System.out.println("Fee: " + appointment1.getFee());
            appointment=appointment-1;
            System.out.println("appointments left at this docter" + appointment);
        }else {
            System.out.println("appointment not avaliable");
        }
    }

}
