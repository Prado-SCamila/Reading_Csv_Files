package entities;

import java.util.List;

public class Employee {

    private String name;

    private String email;

    private Double salary;

    List<Employee> employee;

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee() {

    }

    public Employee(String name, String email, Double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String ToString() {
        return "Name: " + name + "Email: " + email + "salary: $ " + salary;
    }

}
