package _SS3_arrayAndMedthod.practive.p3TimGiaTriLonNhatTrongMang;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size,max = 0;
        do {
            System.out.print("Input a size: ");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("Sorry Oversize");
            }
            if (size<2){
                System.out.println("Size don't enough");
            }
        }while (size > 20 || size < 2);

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print((1+i)+ "/"+size +". input the number: ");
            arr[i]=scanner.nextInt();
        }
        System.out.print("Array [   ");
        max = arr[0];
        for (int i = 0; i < size; i++) {

            if (max < arr[i]){
                max = arr[i];
            }
            System.out.print(arr[i]);
            System.out.print("    ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println("Max value is: "+ max +" on "+size+" value");

    }
}
