package com.javatutorial.ConcreteFactories;

import com.javatutorial.AbctractProducts.IComputerFactory;
import com.javatutorial.ConcreteFactories.DellI5DesktopFactory;
import com.javatutorial.ConcreteFactories.MacI5DesktopFactory;
import com.javatutorial.ConcreteFactories.MacI7LaptopFactory;
import com.javatutorial.Models.Employee;

public class EmployeeSystemFactory {
    public IComputerFactory create(Employee employee) {
        switch (employee.getDept()) {
            case "R&D":
                return new MacI7LaptopFactory();
            case "Other":
                return new MacI5DesktopFactory();
            default:
                return new DellI5DesktopFactory();
        }
    }
}
