package ss5_access_modifier_static_method_static_property.practive.p2_static_property;

public class Car {
    private String name;
    private String engine;

    public static int numberOfCar;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }
    public void display(){
        System.out.println("sum car list number: 1/"+numberOfCar+" Car name: "+name+" ,Car engine: "+engine);
    }
}
