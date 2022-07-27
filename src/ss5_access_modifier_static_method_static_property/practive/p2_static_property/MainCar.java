package ss5_access_modifier_static_method_static_property.practive.p2_static_property;

public class MainCar {
    public static void main(String[] args) {
        Car c1 = new Car("BMW I8","BMW");
        Car car1 = new Car("Mazda 3","Skyactiv 3");

        System.out.println(Car.numberOfCar);

        Car car2 = new Car("Mazda 6","Skyactiv 6");

        System.out.println(Car.numberOfCar);

        c1.display();
        car1.display();
        car2.display();
    }
}
