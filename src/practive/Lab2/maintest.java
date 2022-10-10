package practive.Lab2;

import java.util.Scanner;

public class maintest {
    public static void main(String[] args) {
        ArrayListEmployee listEmployee1 = new ArrayListEmployee();
        Scanner sc = new Scanner(System.in);
        int choose =0,numList = 0;

        Employee e1 = new Employee("a1",16,"DaNang",2.2);
        Employee e2 = new Employee("a2",16,"DaNang",2.2);
        Employee e3 = new Employee("a3",16,"DaNang",2.2);
        Employee e4 = new Employee("a4",16,"DaNang",2.2);
        Employee e5 = new Employee("a5",16,"DaNang",2.2);
        Employee e6 = new Employee("a6",16,"DaNang",2.2);
        listEmployee1.addEmployee(e1);
        listEmployee1.addEmployee(e4);
        listEmployee1.addEmployee(e5);
        listEmployee1.addEmployee(e6);
        listEmployee1.addEmployee(e2);
        listEmployee1.addEmployee(e3);



        do {
            System.out.println("***MENU***");
            System.out.println("1.\tAdd Employee\n" +
                    "2.\tDisplay information for each employee\n" +
                    "3.\tCalculate the total salary.\n" +
                    "4.\tSort Employee descending by name.\n"+
                    "Other to EXIT");
            System.out.print("Input your option: ");
            try {
                choose = Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                System.out.println("Input error");
            }

            switch (choose){
                case 1:
                    //String name, int age, String address, double salary_coefficent
                    System.out.print("Input name: ");String name = sc.nextLine();
                    System.out.print("Input age: ");int age = Integer.parseInt(sc.nextLine());
                    System.out.print("Input address: ");String address = sc.nextLine();
                    System.out.print("Input salary coefficient: ");double salary_coefficient = Double.parseDouble(sc.nextLine());
                    Employee e = new Employee(name,age,address,salary_coefficient);
                    listEmployee1.addEmployee(e);
                    break;
                case 2:
                    listEmployee1.printList();
                case 3:
                    System.out.println("Sum total salary of employee: "+listEmployee1.totalSlaryofEmployee());
                    break;
                case 4:
                    listEmployee1.descendingName();
                    listEmployee1.printList();
                    break;
            }

        }while (choose!= 0);


    }
}
