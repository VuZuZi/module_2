package _SS3_arrayAndMedthod.exercise.e5FoundMinValueInArray;

import java.util.Scanner;

public class e5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=4,b=0,min = 0;
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
        int indexIMin = 0,indexJMin = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
//                System.out.print("input Value in Array["+i+"]["+j+"] :");
//                arr[i][j]=scanner.nextInt();

                if (arr[i][j]>min){
                    min = arr[i][j];
                    indexIMin = i;
                    indexJMin = j;
                }
            }

        }

        System.out.println("Min Value: "+min+" in Array["+indexIMin+"]["+indexJMin+"]");

    }
}
