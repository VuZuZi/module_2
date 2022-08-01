package ss7_new_abstract_class_and_interface.practive.p1_Animal_And_Interface;

public class Cat extends Animal  {
    @Override
    public void setNameColor(String name, String color) {
        super.setNameColor(name, color);
    }

    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }


}
