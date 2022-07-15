package _SS2_arrayInJava.exersice.e1VeHinhFor;

import java.util.Scanner;

public class e1 {
    public static void main(String[] args) {
        int c = -1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("chọn hình bạn muốn vẽ");
            System.out.println("1: retangle");
            System.out.println("2: square");
            System.out.println("3: isosceles triangle");
            System.out.println("4: Exit");
            System.out.print("Input your option: ");
            c = sc.nextInt();
            switch (c){
                case 1:
                    for (int i = 1; i < 9; i++) {
                        for (int j = 1; j < 6; j++) {

                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 2:
                    for (int i = 1; i < 6; i++) {
                        for (int j = 1; j < 6; j++) {

                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 3:
                    for (int i = 1; i < 6; i++) {
                        for (int j = 1; j <= i; j++) {

                            System.out.print("* ");
                        }
                         System.out.println("");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Tạm Biệt!");
                    break;
                default:
                    System.out.println("ngoài khả năng @.@");
            }

        }while (c != 4);
    }
}
