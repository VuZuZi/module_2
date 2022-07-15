package _SS3_arrayAndMedthod.exercise.e3GopMang;

import java.util.Arrays;
import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {
        int s1 = 0,s2 = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Input size array 1: ");
            s1 = scanner.nextInt();
            if (s1 < 0 || s1 > 20){
                System.out.println("Error size");
                System.out.println("Make again");
            }
        }while (s1 < 0 || s1 > 20);

        int[] arr1 = new int[s1];

        for (int i = 0; i < s1; i++) {
            System.out.print("Input num of "+i+" in Array1: ");
            arr1[i] = scanner.nextInt();
        }

        do {
            System.out.print("Input size array 2: ");
            s2 = scanner.nextInt();
            if (s2 < 0 || s2 > 20){
                System.out.println("Error size");
                System.out.println("Make again");
            }
        }while (s2 < 0 || s2 > 20);

        int[] arr2 = new int[s2];

        for (int i = 0; i < s2; i++) {
            System.out.print("Input num of "+i+" in Array2: ");
            arr2[i] = scanner.nextInt();
        }
        System.out.print("Array1");
        System.out.print(Arrays.toString(arr1));
        System.out.println();
        System.out.print("Array2");
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[s1+s2];
        for (int i = 0; i < s1; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = 0; i < s2; i++) {
            arr3[i+s1] = arr2[i];
        }
        System.out.println("New Array");
        System.out.println(Arrays.toString(arr3));
    }
}
