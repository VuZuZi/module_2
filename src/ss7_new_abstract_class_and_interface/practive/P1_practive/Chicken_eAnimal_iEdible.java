package ss7_new_abstract_class_and_interface.practive.P1_practive;

public class Chicken_eAnimal_iEdible extends Animal implements Interface_Edible{

    @Override
    String makeSound() {
        return "tục tác";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
