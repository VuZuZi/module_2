package _ss1_practive.practive.p6;

import java.util.Scanner;

public class ktrnamnhuan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year;

        System.out.print("nhập năm muốn kiểm tra: ");
        year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0){
            System.out.println(year+" là năm nhuận");
        }
        else if (year % 100 == 0 && year % 400 == 0 ){
            System.out.println(year + " là năm nhuận");
        }else {
            System.out.println(year + " không phải là năm nhuận");
        }
    }
}
