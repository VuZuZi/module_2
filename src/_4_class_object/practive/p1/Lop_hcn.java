package _4_class_object.practive.p1;

import java.util.Scanner;

public class Lop_hcn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chiều rộng: ");
        double weigh = sc.nextDouble();
        System.out.println("nhập chiều cao: ");
        double heigh = sc.nextDouble();
        Rectangle rectangle = new Rectangle(weigh,heigh);
        System.out.println("Diện tích hcn: "+ rectangle.Dientich());
        System.out.println("Chu vi hcn: "+ rectangle.Chuvi());
        System.out.println("hình chữ nhật: "+rectangle.hcn());
    }

}
