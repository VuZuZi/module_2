package ss7_new_abstract_class_and_interface.exersice.e1_interface;

public class Square extends Figure implements Color {
    private double edge;

    public Square() {
    }
    public Square(double edge){
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return edge*edge;
    }

    @Override
    public double getPerimeter() {
        return edge*4;
    }

    @Override
    public String howtoColor(String color) {
        return "Yellow";
    }
}
