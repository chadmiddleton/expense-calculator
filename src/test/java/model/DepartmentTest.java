package model;

import org.junit.Test;

import java.util.ArrayList;

import static model.EmployeeType.DEVELOPER;
import static model.EmployeeType.MANAGER;
import static model.EmployeeType.QATESTER;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by cmmidd on 6/13/17.
 */
public class DepartmentTest {

    @Test
    public void testAddMinion() {
        Department department = new Department();
        Employee developer = new Employee(EmployeeType.DEVELOPER);
        Department result = department.addMinion(developer);

        assertNotNull(result);
    }

    @Test
    public void testGettingMinions() {
        Department department = new Department();
        Employee manager = new Employee(MANAGER);
        Employee managerTwo = new Employee(MANAGER);
        Employee developer = new Employee(DEVELOPER);
        Employee qaTester = new Employee(QATESTER);

        department.addMinion(manager).addMinion(managerTwo).addMinion(developer).addMinion(qaTester);

        ArrayList<Employee> resultList = department.getMinions();

        assertEquals(4, resultList.size());
    }
}
