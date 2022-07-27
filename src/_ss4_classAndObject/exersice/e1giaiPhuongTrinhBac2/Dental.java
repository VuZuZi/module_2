package _ss4_classAndObject.exersice.e1giaiPhuongTrinhBac2;

import java.util.Scanner;

public class Dental {
    double a;
    double b;
    double c;


    public Dental(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double dental(double a, double b, double c){
        return (b*b)-4*a*c;
    }
    public double getRoot1(double a, double b, double c){
        double d = dental( a,  b, c);
        if (d < 0){
            return 0;
        }
        return (-b+Math.sqrt(d))/2*a;
    }
    public double getRoot2(double a, double b, double c){
        double d = dental( a,  b, c);
        if (d < 0){
            return 0;
        }
        return (-b-Math.sqrt(d))/2*a;
    }
//    public String display(){
//        return
//    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double a;
    double b;
    double c;

    System.out.println("Ptr Ax*x + B*x + C = 0");
    System.out.print("\nInput A: ");
    a=scanner.nextInt();

    System.out.print("\nInput B: ");
    b=scanner.nextInt();

    System.out.print("\nInput C: ");
    c=scanner.nextInt();

    Dental dental = new Dental(a,b,c);
    
    System.out.println(a+"*x*x + "+b+"*x + "+c+" = 0");
    System.out.print("x1: "+dental.getRoot1(a,b,c));
    System.out.print("x2: "+dental.getRoot2(a,b,c));
}
}
