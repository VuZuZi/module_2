package _ss1_practive.practive.p5;

import java.util.Scanner;

public class tinhsongaytrongthang {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int month;

        System.out.print("nhập tháng bạn muốn tính: ");
        month = sc.nextInt();

        switch (month){
            case 1:
                System.out.print("tháng 1 có 31 ngày");
                break;
            case 2:
                System.out.print("tháng 2 có 8 hoặc 29 ngày");
                break;
            case 3:
                System.out.print("tháng 1 có 31 ngày");
                break;
            case 4:
                System.out.print("tháng 1 có 30 ngày");
                break;
            case 5:
                System.out.print("tháng 1 có 31 ngày");
                break;
            case 6:
                System.out.print("tháng 1 có 30 ngày");
                break;
            case 7:
                System.out.print("tháng 1 có 31 ngày");
                break;
            case 8:
                System.out.print("tháng 1 có 30 ngày");
                break;
            case 9:
                System.out.print("tháng 1 có 31 ngày");
                break;
            case 10:
                System.out.print("tháng 1 có 30 ngày");
                break;
            case 11:
                System.out.print("tháng 1 có 31 ngày");
                break;
            case 12:
                System.out.print("tháng 1 có 30 ngày");
                break;
            default:
                System.out.println("ngoài phạm vi");
        }
    }
}
