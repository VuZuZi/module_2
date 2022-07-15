package _SS3_arrayAndMedthod.practive.p4ChuongTrinhChuyenDoiNhietDo;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = 0;
        boolean check = true;
        double result = 0;
        double c=0,f=0;

        do {
            System.out.println("choose option");
            System.out.println("1: C -> F");
            System.out.println("2: F -> C");
            System.out.print("Your option: ");
            op = scanner.nextInt();
           if (op == 1 || op == 2){
               check = true;
           }else {
               check = false;
               System.out.println("Loss option");
           }
        }while (!check);

        if (op == 1){
            System.out.print("Nhập nhiệt độ C:");
            c=scanner.nextInt();
            f=c*1.8+32;
            System.out.println(c+" độ C = "+f+" độ F");
        }

        if (op == 2){
            System.out.print("Nhập nhiệt độ F: ");
            f = scanner.nextInt();
            c = (f-32)/1.8;
            System.out.println(f+" độ F = "+c+" nhiệt độ C");
        }
    }
}
