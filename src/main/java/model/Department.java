package model;

import java.util.ArrayList;

/**
 * Created by cmmidd on 6/13/17.
 */
public class Department {
    private ArrayList<Employee> minions = new ArrayList<Employee>();

    public Department addMinion(Employee employee) {
        minions.add(employee);
        return this;
    }

    public ArrayList<Employee> getMinions() {
        return minions;
    }
}
