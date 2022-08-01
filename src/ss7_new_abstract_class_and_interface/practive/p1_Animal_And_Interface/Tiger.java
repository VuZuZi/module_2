package ss7_new_abstract_class_and_interface.practive.p1_Animal_And_Interface;

public class Tiger extends Animal implements Edible{

    @Override
    public void makeSound() {
        System.out.println("roarr roarr ");
    }

    @Override
    public String eat() {
        System.out.println("đang ăn moăm moăm");
        return null;
    }
}
