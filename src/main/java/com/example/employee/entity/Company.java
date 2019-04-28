package com.example.employee.entity;

public class Company {
    private  int id;
    private  String name;
    private int employeeNum;
    public Company(int id, String name, int employeeNumber) {
        this.id=id;
        this.name=name;
        this.employeeNum=employeeNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }
}
