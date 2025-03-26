package com.neoteric.variable.hospitalappointments;

import javax.xml.crypto.Data;
import java.util.Date;

public class PatientDetails {
    private String name;
    private  int age;
    private String gender;
    private String problem;
    private Date firstVisitTime;


    public PatientDetails(String name, int age, String gender, String problem, Date firstVisitTime) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.problem = problem;
        this.firstVisitTime = firstVisitTime;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getProblem() {
        return problem;
    }

    public Date getFirstVisitTime() {
        return firstVisitTime;
    }

    @Override
    public String toString() {
        return "PatientDetails{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", problem='" + problem + '\'' +
                ", firstVisitTime=" + firstVisitTime +
                '}';
    }
}
