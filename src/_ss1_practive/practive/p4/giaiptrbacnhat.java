package _ss1_practive.practive.p4;

import java.util.Scanner;

public class giaiptrbacnhat {
    public static void main(String[] args) {
        System.out.println("ptr bac 1 co dang Ax + B = C");

        Scanner sc = new Scanner(System.in);

        double a,b,c,n;

        System.out.print("input A: ");
        a = sc.nextDouble();

        System.out.print("input B: ");
        b = sc.nextDouble();

        System.out.print("input C: ");
        c = sc.nextDouble();

        n = (c-b)/a;

        System.out.println("phuong trinh: "+a+"x + "+b+" = "+c);
        System.out.println("co nghiem: "+n);
    }
}
