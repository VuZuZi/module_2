package _ss1_practive.practive.p3;

import java.util.Scanner;

public class tinhSHCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float dai,rong,s;
        System.out.print("nhap chieu dai: ");
        dai = sc.nextFloat();
        System.out.print("nhap chieu rong: ");
        rong = sc.nextFloat();
        s=dai*rong;
        System.out.println("dien tich HCN: "+s);

    }
}
