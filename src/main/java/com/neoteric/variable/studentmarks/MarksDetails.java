package com.neoteric.variable.studentmarks;

import java.util.Scanner;

public class MarksDetails {
    public int calculateTotalMarks(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }
    public double persentage( int marks, int totalMarks){

            return (marks * 100.0) / totalMarks;
    }

    public String getGrade(double percentage) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = scanner.nextInt();
        if (percentage < 35) {
            return " Fail";
        } else if (percentage <= 50) {
            return "Third Class";
        } else if (percentage <= 75) {
            return "Second Class";
        } else if (percentage < 95) {
            return "First Class";
        } else {
            return " Distinction";
        }
    }


}
