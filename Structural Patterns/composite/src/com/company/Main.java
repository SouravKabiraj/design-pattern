package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Employee empChild1 = new Employee("child1", "IT");
        Employee empChild2 = new Employee("child2", "IT");
        Employee empChild3 = new Employee("child3", "IT");

        Manager empManagerLow1 = new Manager("LowMan1", "IT");
        ArrayList<IEmployee> children1 = new ArrayList<>();
        children1.add(empChild1);
        empManagerLow1.setEmployees(children1);
        Manager empManagerLow2 = new Manager("LowMan2", "IT");
        ArrayList<IEmployee> children2 = new ArrayList<>();
        children2.add(empChild2);
        children2.add(empChild3);
        empManagerLow2.setEmployees(children2);

        Manager ceo = new Manager("CEO", "IT");
        ArrayList<IEmployee> children3 = new ArrayList<>();
        children3.add(empManagerLow1);
        children3.add(empManagerLow2);
        ceo.setEmployees(children3);

        String details = ceo.getDetails();
        System.out.println(details);
    }
}
