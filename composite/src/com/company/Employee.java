package com.company;

import static java.lang.String.format;

public class Employee implements IEmployee {
    private String name;
    private String dept;

    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
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

    @Override
    public String getDetails() {
        return format("NAME: %s, DEPT: %s", this.name, this.dept);
    }
}
