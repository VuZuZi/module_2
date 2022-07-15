package _SS3_arrayAndMedthod.exercise.e4foundMaxValueInArray;

import java.util.Scanner;

public class e4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0,b=0;
        do {
            System.out.print("Input size array [x][y], x: ");
            a = scanner.nextInt();
            System.out.print("Input size array [x][y], y: ");
            b = scanner.nextInt();
            if (a < 0 || b < 0){
                System.out.println("Error size");
                System.out.println("Make again");
            }
        }while (a < 0 || b < 0);

        int[][] arr = new int[a][b];
        int max = 0;
        int indexIMax = 0,indexJMax = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("input Value in Array["+i+"]["+j+"] :");
                arr[i][j]=scanner.nextInt();
                if (arr[i][j]>max){
                    max = arr[i][j];
                    indexIMax = i;
                    indexJMax = j;
                }
            }

        }

        System.out.println("Max Value: "+max+" in Arr["+indexIMax+"]["+indexJMax+"]");
    }
}
