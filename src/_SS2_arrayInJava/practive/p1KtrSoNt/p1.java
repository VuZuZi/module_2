package _SS2_arrayInJava.practive.p1KtrSoNt;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        int a = 1;
        boolean c = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("input 0 to exit!");
        do {
            if (a == 0){
                System.out.println("Thoát chương trình");
                break;
            }
            if (a < 0){
                System.out.print("số phải lớn hơn 0");
                System.out.println();
                System.out.print("vui lòng nhập lại");
                System.out.println();
            }
            System.out.print("nhập số muốn kiểm tra: ");
            a = sc.nextInt();

        }while (a < 0);
        for (int i = 2 ; i < a;i++){
            if (a % i == 0){
                c = false;
            }
        }
        if (c){
            System.out.println(a+" là số nguyên tố");
        }else {
            System.out.println(a+" không phải là số nguyên tố");

        }

    }
}
