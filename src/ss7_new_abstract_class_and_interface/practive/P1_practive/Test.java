package ss7_new_abstract_class_and_interface.practive.P1_practive;

import ss7_new_abstract_class_and_interface.practive.P1_practive.fruit.Orange_E_Fruit;
import ss7_new_abstract_class_and_interface.practive.p1_Animal_And_Interface.Apple;
import ss7_new_abstract_class_and_interface.practive.p1_Animal_And_Interface.Tiger;

public class Test {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.makeSound();

        Orange_E_Fruit orange_e_fruit = new Orange_E_Fruit();
        System.out.println(orange_e_fruit.howToEat());
    }
}
