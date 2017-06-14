package model;

import java.util.ArrayList;

/**
 * Created by cmmidd on 6/13/17.
 */
public class Employee {

    private EmployeeType type;
    private ArrayList<Employee> minions = new ArrayList<Employee>();

    public Employee(EmployeeType type) {
        this.type = type;
    }

    public EmployeeType getType() {
        return type;
    }

    public Employee addMinion(Employee employee) {
        if (EmployeeType.MANAGER != type) {
            throw new IllegalArgumentException("Only managers can have minions.");
        }

        minions.add(employee);
        return this;
    }

    public ArrayList<Employee> getMinions() {
        return minions;
    }
}
