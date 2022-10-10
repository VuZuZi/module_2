package ss6_inheritance.exersice.e1CircleAndCylinder;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.areaCylinder(3,5));

        System.out.println(cylinder instanceof Circle);
    }
}
