package _SS3_arrayAndMedthod.exercise.e1XoaPtuKhoiMang;

import java.util.Scanner;

public class e1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int value = 0;
        System.out.print("Array[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print("  ");

        }
        System.out.println("]");
        System.out.println("nhập giá cần xóa khỏi mảng: ");
        Scanner scanner = new Scanner(System.in);
        int check = scanner.nextInt();

        for (int i = 0; i < arr.length;i++){
            if (arr[i]==check){
                System.out.println("số "+check+" ở vị trí thứ "+i);
                value = i;
            }
        }
        System.out.print("New Array[");
        for (int i = 0; i < arr.length; i++) {
            if (i == value){
                i ++;

            }
            System.out.print(arr[i]);
            System.out.print("  ");

        }
        System.out.print("]");
    }
}
