package ss7_new_abstract_class_and_interface.exersice.e1_interface;

public abstract class Figure {
    private String name;

    protected String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
