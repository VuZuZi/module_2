package ss7_new_abstract_class_and_interface.exersice.E1_Animal_And_Interface_Edible;
public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
