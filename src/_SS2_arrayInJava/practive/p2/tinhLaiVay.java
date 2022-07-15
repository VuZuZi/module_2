package _SS2_arrayInJava.practive.p2;

import java.util.Scanner;

public class tinhLaiVay {
    public static void main(String[] args) {
        double money = 0, month = 0, inter = 0, sum;
        Scanner sc = new Scanner(System.in);
        do {
            if (money < 0) {
                System.out.println("lỗi số tiền âm");
            }
            System.out.print("nhập số tiền muốn vay(triệu đồng): ");
            money = sc.nextInt();
        } while (money < 0);
        do {
            System.out.print(money + " triệu đồng");
            System.out.println();
            System.out.print("nhập số tháng bạn muốn tính: ");
            month = sc.nextInt();
            if (month < 1) {
                System.out.println("số tháng phải > 1");
                System.out.println("mời nhập lại");
            }


        } while (month < 1);
        do {
            System.out.println(money + " triệu đồng trong " + month + "  tháng");
            System.out.print("nhập lãi suất hàng năm(%): ");
            inter = sc.nextInt();
            if (inter < 0) {
                System.out.println("lãi suất > 0");
            }
            if (inter > 15) {
                System.out.println("lãi vượt quá 15% 1 năm");
            }
        } while (inter < 0 || inter > 15);
        double a = inter/12;
        sum = (money /100 * a)*12+money;

        System.out.println("số tiền bạn phải trả sau " + month + " tháng là " + sum + " triệu đồng.");
    }
}
