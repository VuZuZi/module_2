package ss6_inheritance.pactive.p1HeCacDoiTuongHinhHoc;

public class Circle extends Shape{
    private double radious = 1;

    public Circle(){};
    public Circle(double radious) {
        this.radious = radious;
    }

    public Circle(String color, boolean filled, double radious) {
        super(color, filled);
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public double getArea(){
        return 2*radious*Math.PI;
    }
    public double getPerimeter(){
        return 2 * radious * Math.PI;
    }
    @Override
    public String toString(){
        return "A Circle with radius="
                + getRadious()
                + ", which is a subclass of "
                + super.toString();
    }
}
