//CODSOFT Internship Batch-A2
//Student Grade Calculator

import java.util.ArrayList;
import java.util.Scanner;


public class Stu_Grad_Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sub;
        String grade = "";
        float t_marks = 0.0f;
        double avg_per = 0.0;
        ArrayList<String> subs=new ArrayList<String>();
        ArrayList<Float> marks = new ArrayList<Float>();
        System.out.println("Enter Number Of Subjects: ");
        sub = input.nextInt();
        input.nextLine();
        for (int i = 0; i < sub; i++) {
            int temp = i + 1;
            System.out.println("Enter Subject no. "+temp);
            subs.add(input.nextLine());
            System.out.println("Enter Subject Marks out of 100");
            float tempt = input.nextFloat();
            marks.add(tempt);
            input.nextLine();
            t_marks += tempt;
        }
        avg_per = (t_marks/(100*sub))*100;


        if (avg_per >= 97.0 && avg_per <= 100.0) {
            grade = "A+";
        } else if (avg_per >= 93.0 && avg_per <= 96.0) {
            grade = "A";
        } else if (avg_per >= 90.0 && avg_per <= 92.0) {
            grade = "A-";
        } else if (avg_per >= 87.0 && avg_per <= 89.0) {
            grade = "B+";
        } else if (avg_per >= 83.0 && avg_per <= 86.0) {
            grade = "B";
        } else if (avg_per >= 80.0 && avg_per <= 82.0) {
            grade = "B-";
        } else if (avg_per >= 77.0 && avg_per <= 79.0) {
            grade = "C+";
        } else if (avg_per >= 73.0 && avg_per <= 76.0) {
            grade = "C";
        } else if (avg_per >= 70.0 && avg_per <= 72.0) {
            grade = "C-";
        } else if (avg_per >= 67.0 && avg_per <= 69.0) {
            grade = "D+";
        } else if (avg_per >= 65.0 && avg_per <= 66.0) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Subject            Marks");
        for (int i = 0; subs.size() > i; i++) {
            System.out.println(subs.get(i)+"            "+marks.get(i));
        }
        System.out.println("Total Marks: "+t_marks+"            Grade: "+grade);
    }

}
