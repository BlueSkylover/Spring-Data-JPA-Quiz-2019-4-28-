package com.example.employee.entity;

public class Employee {
    private int id;
    private String name;
    private  int age;
    private String gender;
    private  int companyid;
    private int salary;
    public Employee(int id, String name, int age, String gender, int companyid, int salary) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.companyid=companyid;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getCompanyid() {
        return companyid;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
