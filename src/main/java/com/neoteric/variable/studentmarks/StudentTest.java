package com.neoteric.variable.studentmarks;

import java.util.Scanner;

public class StudentTest {

          public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
              StudentDetails student = new StudentDetails();
              MarksDetails marksDetails=new MarksDetails();

              System.out.print("Enter Student Name: ");
              student.name = scanner.nextLine();

              System.out.print("Enter Marks Obtained (separated by spaces): ");
              String marksInput = scanner.nextLine();


              String[] marksArray = marksInput.split("[,\\s]+");
              student.marks = new int[marksArray.length];
              for (int i = 0; i < marksArray.length; i++) {
                  student.marks[i] = Integer.parseInt(marksArray[i]);
              }
              System.out.print("Enter Total Marks for all subjects: ");
              student.totalMarks = scanner.nextInt();
              int obtainedMarks = marksDetails.calculateTotalMarks(student.marks);


              double percentage = marksDetails.persentage(obtainedMarks, student.totalMarks);
              String graed= marksDetails.getGrade(percentage);


              System.out.println("Student Result:");
              System.out.println(" Name: " + student.name);
              System.out.println(" Marks Obtained: " + obtainedMarks + " / " + student.totalMarks);
              System.out.println(" Percentage: " + String.format("%.2f", percentage) + "%");
              System.out.println(" Grade: " + graed);

              scanner.close();
          }
        }






