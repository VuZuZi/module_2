package _ss1_practive.exercise.e1;

import java.util.Scanner;

public class sayHello {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);

        System.out.print("input your name: ");
        name = sc.nextLine();

        System.out.print("Hello "+name);
        System.out.println();
        System.out.print("How about you, "+name);
    }
}
