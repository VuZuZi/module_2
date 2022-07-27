package _ss4_classAndObject.practive.p1_classRectangle;

import _4_class_object.practive.p1.Rectangle;

import java.util.Scanner;

public class p1 {
    static class Rectangle {
        double width, height;

        public Rectangle(double width, double height) {
        }

        public void setWidth(double width) {
            this.width = width;
        }
        public double getHeight() {
            return height;
        }

        public double getArea(double height) {
            return this.height*this.width;
        }
        public double getPerimeter(){
            return (this.height + this.width)*2;
        }
        public String display(){
            return "Rectangle { " + "width= " + width + " , height= " + height + "}";
        }


    }

    public static class Main{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter a width");
            double width= scanner.nextDouble();
            System.out.println("Enter a height");
            double height = scanner.nextDouble();
            Rectangle rectangle= new Rectangle(width,height);
            System.out.println("Your rectangle \n"+rectangle.display());
            System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
//            System.out.println("Area of the Rectangle: "+ rectangle.getArea());
        }
    }

}

