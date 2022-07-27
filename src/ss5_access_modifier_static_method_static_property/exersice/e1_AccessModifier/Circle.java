package ss5_access_modifier_static_method_static_property.exersice.e1_AccessModifier;

public class Circle {
    private double radious;
    private String color = "red";
    public Circle(){}

    public Circle(double radious) {
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    public double getArea() {
        return Math.PI*radious*radious;
    }
    public void display(){
        System.out.println("Circle have radious: "+getRadious()+" ,color: "+color+" ,CircleArea: "+getArea());
    }

}
