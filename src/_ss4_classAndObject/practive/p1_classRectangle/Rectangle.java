package _ss4_classAndObject.practive.p1_classRectangle;

import java.util.Scanner;

public class Rectangle {
    double height;
    double width;


    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;

    }

    public double getArea(double height, double width) {
        return height * width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter(double height, double width) {
        return (height + width) * 2;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String display() {
        return "Rectangle { " + "width= " + width + " , height= " + height + "}";
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a width");
        double width = scanner.nextDouble();
        System.out.println("Enter a height");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter(height, width));
        System.out.println("Area of the Rectangle: " + rectangle.getArea(height, width));
    }

}