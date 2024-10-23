package lesson_28.equals;


import lists.MyArrayList;
import lists.MyList;

public class EmpoyeeApp {
    public static void main(String[] args) {

        MyList<Employee> employees = new MyArrayList<>();
        Employee employee = new Employee("John", "Smith", "21.10.2000");
        Employee employee1 = new Employee("Sarah", "Johnson", "23.10.1988");
        Employee employee2 = new Employee("Sarah", "Johnson", "06.08.2004");
        Employee employee3 = new Employee("Sarah", "Johnson", "06.08.2004");


        System.out.println(employee == employee1);
        System.out.println("employee2 == employee3: " + (employee2 == employee3));

        System.out.println("employee2.equals(employee3): " + employee2.equals(employee3));//// employee2.equals(employee3): false
        System.out.println("employee1.equals(employee2): " + employee1.equals(employee2));
    }
}
