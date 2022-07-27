package ss6_inheritance.exersice.e1CircleAndCylinder;

public class Cylinder extends Circle {
    private double h;// chiều cao

    public Cylinder (){};

    public Cylinder(double r, double h){
        super(r);
        this.h = h;
    };

    public double areaCylinder(double r, double h){
        return Math.PI*r*r*h;
    }
}
