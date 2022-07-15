package _SS3_arrayAndMedthod.practive.p1DaoNguocPTmang;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 3;

        do {
            if (size < 2){
                System.out.println("số lượng phần tử không đủ để chạy chương trình");
            }
            if (size > 20){
                System.out.println("Xin lỗi, chương trình chỉ nhận tối đa 20 phần tử của một mảng");
            }
            System.out.print("nhập số lượng ptử của mảng: ");
            size = scanner.nextInt();

        }while (size < 2 || size > 20);
        int[] arr = new int[size];
        for (int i = 0; i < size ; i ++){
            System.out.print("nhập phần tử thứ "+i+" vào mảng: ");
            arr[i]=scanner.nextInt();
        }

        System.out.print("array [   ");

       for (int n : arr){
           System.out.print(n);
           System.out.print("   ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println("đảo mảng");

        // arr[size]
        for (int i = 0; i < size/2; i++) {
            int temp = arr[i];
            arr[i] = arr[size-1];
            arr[size-1] = temp;
        }
        System.out.println("mảng mới: ");
        System.out.print("array[    ");
        for (int n : arr){
            System.out.print(n);
            System.out.print("   ");

        }
        System.out.println("]");
    }
}
