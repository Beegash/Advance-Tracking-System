package org.example;

import java.util.ArrayList;

public class Employee extends Personnel {
    public Employee(String firstName, String lastName, String title, double salary, int employmentDate) {
        super(firstName, lastName, title, salary, employmentDate);

    }

    ArrayList<Employee> employees = new ArrayList<>();

    public void addPersonnel(Employee emp) {
        employees.add(emp);
        personnels.add(emp);
    }

    public void removePersonnel(Employee emp) {
        for (Employee employee : employees) {
            if (employee.fullName() == emp.fullName()) {
                employee = null;
                break;
            }
        }
        for (Personnel personnel : personnels) {
            if (personnel.fullName() == emp.fullName()) {
                personnel = null;
                break;
            }
        }
    }
}
