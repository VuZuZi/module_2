package _ss4_classAndObject.exersice.FanClass;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(true,3,10,"Yellow");
        Fan fan2 = new Fan(true,2,5,"blue");
        System.out.println(fan1.getSpeed());
    }
}
