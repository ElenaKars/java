package lesson_28.equals;

import lesson_22.animals.Dog;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public Employee(String name, String lastName, String dateOfBirth) {
        this.firstName = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Employee)) return false;//возмодность привести к Employee
        Employee employee = (Employee) obj;

        //при сравнении любого объекта с null должно возвращаться false


        return Objects.equals(firstName, employee.firstName)&&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(dateOfBirth, employee.dateOfBirth);

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
