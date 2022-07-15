package _SS2_arrayInJava.practive.p4VeHinh;

import java.util.Scanner;

public class menuVeHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chose = -1;
        do {


            System.out.println("chọn hình bạn muốn vẽ");
            System.out.println("1: triangle");
            System.out.println("2: square");
            System.out.println("3: rectangle");
            System.out.println("4 Exit");
            System.out.print("input your option: ");
            chose = sc.nextInt();
            switch (chose) {
                case 1:
                    System.out.println("*");
                    System.out.println("* * ");
                    System.out.println("* * * ");
                    System.out.println("* * * *  ");
                    System.out.println("* * * * *  ");
                    break;
                case 2:
                    System.out.println("* * * * * * ");
                    System.out.println("* * * * * * ");
                    System.out.println("* * * * * * ");
                    System.out.println("* * * * * * ");
                    System.out.println("* * * * * * ");
                    break;
                case 3:
                    System.out.println("* * * * * * ");
                    System.out.println("* * * * * * ");
                    System.out.println("* * * * * * ");
                    System.out.println("* * * * * * ");
                    System.out.println("* * * * * * ");
                    System.out.println("* * * * * * ");
                    System.out.println("* * * * * * ");
                    System.out.println("* * * * * * ");
                    break;
                case 4:
                    System.out.println("Tạm biệt !");
                    break;
                default:
                    System.out.println("ngoài khả năng");


            }
        }while (chose != 4);
    }
}
