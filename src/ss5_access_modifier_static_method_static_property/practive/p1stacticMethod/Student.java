package ss5_access_modifier_static_method_static_property.practive.p1stacticMethod;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";



    public Student(int r, String n) {
        rollno = r;
        name = n;
    }
    public static void change() {
        college = "CODEGYM";
    }
    public void display() {
        System.out.println("Student rollno: "+rollno + " ,Student Name: " + name + " Student college: " + college);
    }
}
