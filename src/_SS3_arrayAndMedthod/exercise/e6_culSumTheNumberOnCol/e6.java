package _SS3_arrayAndMedthod.exercise.e6_culSumTheNumberOnCol;

import java.util.Scanner;

public class e6 {
    public static void main(String[] args) {
        int col = 0, row = 0, sum = 0;

        boolean cc = false, cr = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("++ The program found Sum of col a Array ++");
        while (!cr){
            System.out.print("Input the number of Row in Array: ");
            row = scanner.nextInt();
            if (row > 0){
                cr = true;
            }else {
                System.out.println("number of row > 0");
            }
        }
        System.out.println();

        while (!cc){
            System.out.print("Input the number of Col in Array: ");
            col = scanner.nextInt();
            if (col > 0){
                cc = true;
            }else {
                System.out.println("number of col > 0");
            }
        }
        int[][] arr=new int[row][col];


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Number ["+i+"]["+j+"]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The Array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.print("You want to found the Sum number col in Array: ");
        int fSum = 0;
        fSum = scanner.nextInt();

        for (int i = 0; i < row; i++) {
            sum += arr[i][fSum];
        }

        System.out.println("Sum you found: "+sum);
    }
        
    }

