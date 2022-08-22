package ArrayList_Practive.Students;

import java.util.ArrayList;

public class ArrayListStudents {
    private ArrayList<ArrayListStudents> studentsArrayList;

    public ArrayListStudents(int studentId, String fullName, float score, int age){
        this.studentsArrayList = new ArrayList<>();
        /* constractur rỗng dùng để khởi tạo danh arraylist students */
    }

    public ArrayListStudents(ArrayList<ArrayListStudents> studentsArrayList) {
        this.studentsArrayList = studentsArrayList;
    }

    public ArrayListStudents() {

    }
    // constructor auto

    public void addStudent(ArrayListStudents sv){
        this.studentsArrayList.add(sv); // add sinh viên vào cuối danh sách
    }

    public void printfList(){
        for (ArrayListStudents students : studentsArrayList
        ){
            System.out.println(students);
        }
    }

}
