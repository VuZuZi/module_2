package ss7_new_abstract_class_and_interface.practive.p1_Animal_And_Interface;

public abstract class Fruit implements Edible{

    @Override
    public String eat() {
        System.out.println("apple");
        return "apple";
    }
}
