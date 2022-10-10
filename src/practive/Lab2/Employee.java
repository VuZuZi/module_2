package practive.Lab2;

public class Employee {
    private String name;
    private int age;
    private String address;
    private double salary_coefficent;

    public Employee(String name, int age, String address, double salary_coefficent) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary_coefficent = salary_coefficent;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary_coefficent() {
        return salary_coefficent;
    }

    public void setSalary_coefficent(double salary_coefficent) {
        this.salary_coefficent = salary_coefficent;
    }

    public double Salary(double salary_coefficent){
        return salary_coefficent*1.05;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", salary_coefficent=" + salary_coefficent +
                ", Salary: "+Salary(salary_coefficent)+
                '}';
    }
}
