package _SS3_arrayAndMedthod.exercise.e2ThemPtuVaoMang;

import java.util.Arrays;
import java.util.Scanner;

public class e2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int index = 0;

        // output array
        System.out.print("Array[  ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            System.out.print("  ");
        }
        System.out.print("]");

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhập vị trí bạn muốn thêm: ");
        index = scanner.nextInt();

        System.out.println("\nỞ vị trí "+index+" có giá trị là "+arr[index]);
        System.out.print("Input new value in array: ");
        int value = scanner.nextInt();

        int[] newarr = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            if (i<index) {
                newarr[i] = arr[i];
            }
            if (i == index){
                newarr[i] = value;
            }
            if (i>=index){
                newarr[i+1]=arr[(i)];
            }
        }


        System.out.println(Arrays.toString(newarr));
    }
}
