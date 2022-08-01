package ss7_new_abstract_class_and_interface.practive.p1_Animal_And_Interface;

public class Strart {
    public static void main(String[] args) {
//        Cat[] cat = new Cat[2];
//        cat[0] = new Cat();
//        cat[1] = new Cat();
//        cat[0].setNameColor("mio", "white");
//        System.out.println(cat[0].getInfor());
//        cat[0].makeSound();
//        cat[1].setNameColor("Thơm", "black");
//
//        System.out.println(cat[1].getInfor());
//        cat[1].makeSound();


        Tiger tiger = new Tiger();
        tiger.setNameColor("Hổ","yellow");
        tiger.eat();
        tiger.makeSound();
    }


//     class Chicken extends Animal implements Edible {
//
//        @Override
//        public void makeSound() {
//            System.out.println("cục ta cục tác");
//        }
//
//        @Override
//        public void eat() {
//            System.out.println("mệt mệt");
//        }
//    }
}
