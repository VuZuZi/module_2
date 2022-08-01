package ss7_new_abstract_class_and_interface.exersice.e1_interface;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // --------------------------------Circle-----------------------------
//        Circle circle = new Circle(3);
//        System.out.println(circle.getArea());
        //---------------------------------Rectangle---------------------------
//        double percent;
//        double col;
//        double row;
//        System.out.print("Input col of rectangle: ");
//        col = scanner.nextDouble();
//        System.out.println();
//        System.out.println("Input row of rectangle: ");
//        row = scanner.nextDouble();
//        System.out.println();
//
//
//        Rectangle rectangle = new Rectangle(col,row);
//        String s = rectangle.toString();
//        System.out.println(s);
//
//
//        System.out.print("Add the percent setup row and col :");
//        percent = scanner.nextDouble();
//        rectangle.resize(percent);
        // -------------------------------------------Square----------------------------------------------
        Square square = new Square(8);
        System.out.println(square.howtoColor("Yellow"));
    }
}
