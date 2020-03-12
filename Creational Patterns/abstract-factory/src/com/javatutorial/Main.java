package com.javatutorial;

import com.javatutorial.AbctractProducts.IComputerFactory;
import com.javatutorial.ConcreteFactories.EmployeeSystemFactory;
import com.javatutorial.Models.Employee;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setDept("R&D");
        EmployeeSystemFactory employeeSystemFactory = new EmployeeSystemFactory();
        IComputerFactory computerFactory = employeeSystemFactory.create(employee);
        EmployeeSystemManager employeeSystemManager = new EmployeeSystemManager(computerFactory);
        String systemDetails = employeeSystemManager.getSystemDetails();
        System.out.println(systemDetails);
    }
}
