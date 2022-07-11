package _4_class_object.exercise.e1;

import java.util.Scanner;

public class ptr_bac_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ptr: Ax.x + Bx + C = 0");
        System.out.print("nhập A: ");
        double a = sc.nextDouble();
        System.out.print("nhập B: ");
        double b = sc.nextDouble();
        System.out.print("nhập C: ");
        double c = sc.nextDouble();
        Denta denta = new Denta(a,b,c);
        System.out.println("ptr: "+a+"xx + "+b+"x + "+c+"= 0");
        System.out.println("ptr có nghiệm 1: "+ denta.getRot1());
        System.out.println("ptr có nghiệm 2: "+ denta.getRot2());
    }
}
