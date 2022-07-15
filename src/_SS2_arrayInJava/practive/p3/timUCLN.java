package _SS2_arrayInJava.practive.p3;

import java.util.Scanner;

public class timUCLN {
    public static void main(String[] args) {
        int n1,n2,uc;
        int[] un1 = new int[100];
        int[] un2 = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập 2 số muốn tìm ƯCLN");
        do {
            System.out.print("nhập số thứ nhất: ");
            n1 = sc.nextInt();
            if (n1 < 0){
                System.out.println("chỉ tìm được ước 2 số dương");
                System.out.println("xin mời nhập lại");
            }
        }while (n1<0);
        do {
            System.out.print("nhập số thứ nhất: ");
            n2 = sc.nextInt();
            if (n2 < 0){
                System.out.println("chỉ tìm được ước 2 số dương");
                System.out.println("xin mời nhập lại");
            }
        }while (n2<0);
        // đảo số lớn là n1 số nhỏ là n2
        if (n1 < n2){
            int teamp = n1;
            n1 = n2;
            n2 = teamp;
        }
        int a = 0,b=0,c;
        for (int i = n2; i > 0; i-- ){
            if (n1 % i == 0 && n2 % i == 0){
                a = i;
                break;

            }
        }


        System.out.println("ước chung lớn nhất của "+n1+" và "+n2+" là: "+a);
    }
}
