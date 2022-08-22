package ss7_new_abstract_class_and_interface.exersice.E1_Animal_And_Interface_Edible;


public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }
        for (Animal animal: animals) {
            System.out.println("\n"+ animal.makeSound());
            if(animal instanceof Chicken){
                Edible edible =(Chicken)animal;
                System.out.println("------\n"+edible.howToEat());
            }

    }

        // tesst fruit

        Fruit[] fruits =new Fruit[2] ;
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit: fruits
             ) {
            System.out.println(fruit.howToEat());
        }

    }
}
