package _SS3_arrayAndMedthod.practive.p6_countNumberStudentPassExam;

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        int score = 0, a = 0, count = 0;


        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Input number list Students: ");
            a = scanner.nextInt();
            System.out.println();
            if (a < 2) {
                System.out.println("Number of list Error");
                System.out.println("Keep again");
            }

        } while (a < 2 || a > 10);
        int[] students = new int[a];
        for (int i = 0; i < a; i++) {
            do {
                System.out.print("input score of student "+(i+1)+": ");
                students[i] = scanner.nextInt();
                score = students[i];
                if (score<0 || score >= 10){
                    System.out.println("Score > 0 and Score <= 10");
                }else {
                    if (score >= 5) {
                        count++;
                    }
                }
            }while (score<0 || score >= 10);


        }
        System.out.print("scoreList {");
        for (int n : students
             )  {
            System.out.printf("%d \t",n);
                }
        System.out.println("}");
        System.out.println("Have "+count+" students Passed the Exam!, and "+(a-count)+" don't passed the Exam");
    }
}
