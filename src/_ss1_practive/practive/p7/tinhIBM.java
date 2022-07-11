package _ss1_practive.practive.p7;

import java.util.Scanner;

public class tinhIBM {
    public static void main(String[] args) {
        double nang,cao,bmi;
        Scanner sc = new Scanner(System.in);

        System.out.println("tính chỉ số BMI bằng chiều cao và cân nặng");
        System.out.print("input chiều cao(m): ");

        cao = sc.nextDouble();

        System.out.print("input cân nặng(kg): ");
        nang = sc.nextDouble();

        bmi = nang/(cao*cao);

        if(bmi < 18.5){
            System.out.println("BMI của bạn là: "+bmi+" < 18.5. Gầy");
        }else if (bmi < 25){
            System.out.println("BMI của bạn là: "+bmi+" < 25. Bình Thường");
        }else if (bmi < 30){
            System.out.println("BMI của bạn là: "+bmi+" < 25. Béo");
        }else {
            System.out.println("BMI của bạn là: "+bmi+" Béo phì");
        }


    }
}
