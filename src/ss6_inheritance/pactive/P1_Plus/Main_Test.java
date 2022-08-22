package ss6_inheritance.pactive.P1_Plus;

public class Main_Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red",false);
        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle("yellow",true,3);
        System.out.println(circle);
    }
}
