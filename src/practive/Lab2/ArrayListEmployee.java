package practive.Lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListEmployee {
    private ArrayList<Employee> ListEmployee;

    public ArrayListEmployee(){
        this.ListEmployee = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee){
        this.ListEmployee.add(employee);
    }

    public void printList(){
        for (Employee employee:ListEmployee
             ) {
            System.out.println(employee);
        }
    }
    public Double totalSlaryofEmployee(){
        double sum = 0;
        for (Employee employee : ListEmployee
        ){
            sum+=employee.Salary(employee.getSalary_coefficent());
        }
        return sum;
    }

    public void descendingName(){
        Collections.sort(this.ListEmployee, ((o1, o2) -> o1.getName().compareTo(o2.getName())));
    }
}
