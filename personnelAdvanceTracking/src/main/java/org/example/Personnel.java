package org.example;

import java.util.ArrayList;

public class Personnel {
    ArrayList <Personnel> personnels=new ArrayList<>();
    private String firstName;
    private String lastName;
    private String title;
    private double salary;
    private int employmentDate;
    public Personnel(String firstName, String lastName, String title, double salary, int employmentDate){
        this.firstName=firstName;
        this.lastName=lastName;
        this.title=title;
        this.salary=salary;
        this.employmentDate=employmentDate;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(int employmentDate) {
        this.employmentDate = employmentDate;
    }


    public int serviceTime(){
        int serviceTime=2022-employmentDate;
        return serviceTime;
    }
    public String fullName(){
        String fullName=firstName+" "+lastName;
        return fullName;
    }

}

