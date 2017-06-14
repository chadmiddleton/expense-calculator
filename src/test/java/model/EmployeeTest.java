package model;

import org.junit.Test;

import java.util.ArrayList;

import static model.EmployeeType.DEVELOPER;
import static model.EmployeeType.MANAGER;
import static model.EmployeeType.QATESTER;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by cmmidd on 6/13/17.
 */
public class EmployeeTest {

    @Test
    public void testType() {
        Employee employee = new Employee(DEVELOPER);

        EmployeeType result = employee.getType();

        assertTrue(result.equals(DEVELOPER));
    }

    @Test
    public void testAddMinion() {
        Employee manager = new Employee(MANAGER);
        Employee developer = new Employee(DEVELOPER);

        Employee result = manager.addMinion(developer);

        assertNotNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddMinionOnlyManagers() {
        Employee developer = new Employee(DEVELOPER);
        Employee qaTester = new Employee(QATESTER);

        developer.addMinion(qaTester);
    }

    @Test
    public void testGettingMinions() {
        Employee manager = new Employee(MANAGER);
        Employee managerTwo = new Employee(MANAGER);
        Employee developer = new Employee(DEVELOPER);
        Employee qaTester = new Employee(QATESTER);

        manager.addMinion(managerTwo).addMinion(developer).addMinion(qaTester);

        ArrayList<Employee> resultList = manager.getMinions();

        assertEquals(3, resultList.size());
    }
}
