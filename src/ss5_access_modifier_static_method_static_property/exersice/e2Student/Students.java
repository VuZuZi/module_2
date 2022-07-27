package ss5_access_modifier_static_method_static_property.exersice.e2Student;

public class Students {
    private String name;
    private String classes;

    public Students(){};

    public Students(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public void display(){
        System.out.println("Student: "+name+" ,Class: "+classes);
    }


    public static void main(String[] args) {
        Students s1 = new Students("John","A0222I2");
        s1.display();
    }
}
