package ss6_inheritance.pactive.P1_Plus;

public class Circle extends Shape{
    // khởi tạo biến r có giá trị ban đầu là 1
    public double radious = 1;


    // 3 constructor
    public Circle(){};

    public Circle(double radious) {
        this.radious = radious;
    }

    public Circle(String color, boolean filled, double radious) {
        super(color, filled);
        this.radious = radious;
    }

    //getter and setter


    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public double getArea(){
        return radious*radious*Math.PI;
    }

    public double getPerimeter(){
        return 2*radious*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radious=" + radious +
                ", color='" + color + '\'' +
                ", filled=" + filled +"\n"+
                "Area: "+getArea()+"\n"+
                "Perimeter: "+ getPerimeter()+"\n"+
                '}';
    }
}
