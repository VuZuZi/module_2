package ss6_inheritance.exersice.e1CircleAndCylinder;

public class Circle {
    private double r;

    public Circle(){};

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public double area(double r){
        return Math.PI*r*r;
    }
}
