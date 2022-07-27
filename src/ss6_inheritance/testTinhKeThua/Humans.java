package ss6_inheritance.testTinhKeThua;

public class Humans {
    private String name;
    private int age;
    private double expen;
    private int dateWork;

    public Humans(){};

    public Humans(String name, int age, double expen, int dateWork) {
        this.name = name;
        this.age = age;
        this.expen = expen;
        this.dateWork = dateWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getExpen() {
        return expen;
    }

    public void setExpen(double expen) {
        this.expen = expen;
    }

    public int getDateWork() {
        return dateWork;
    }

    public void setDateWork(int dateWork) {
        this.dateWork = dateWork;
    }
}
