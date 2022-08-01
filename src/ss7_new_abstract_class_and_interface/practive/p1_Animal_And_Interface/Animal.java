package ss7_new_abstract_class_and_interface.practive.p1_Animal_And_Interface;

public abstract class Animal {
    private String name;
    private String color;

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setNameColor(String name,String color) {
        this.name = name;
        this.color = color;
    }

    public String[] getColorName() {
        return new String[]{getColor(),getName()};
    }

    public String getInfor(){ return "Name: " + name +"| Color: "+color; }
}



