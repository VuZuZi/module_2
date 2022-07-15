package _SS3_arrayAndMedthod.practive.p2TimSinhVienTrongMang;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input name a student: ");
        String name= scanner.nextLine();
        boolean check = false;
        int numberOfList = 0;
        for (int i = 0; i < students.length;i++){
            if (name.equals( students[i])){
                check = true;
                numberOfList = i + 1;
                break;
            }else {
                check = false;
            }
        }
        if (check){
            System.out.println(name + " on list students is "+ numberOfList);
        }else {
            System.out.println("Not found "+ name+" on the list");
        }

    }
}
