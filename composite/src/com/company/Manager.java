package com.company;

import java.util.ArrayList;

import static java.lang.String.format;

public class Manager implements IEmployee {
    private String name;
    private String dept;
    private ArrayList<IEmployee> employees;

    @Override
    public String getDetails() {
        StringBuilder result = new StringBuilder(format("NAME: %s, DEPT: %s -> ", this.name, this.dept));
        for (IEmployee employee : employees) {
            result.append("[" + employee.getDetails() + "]");
        }
        return result.toString();
    }

    public Manager(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public ArrayList<IEmployee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<IEmployee> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
