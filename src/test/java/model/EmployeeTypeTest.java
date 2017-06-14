package model;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by cmmidd on 6/13/17.
 */
public class EmployeeTypeTest {

    @Test
    public void testDeveloperType () {
        Double result = EmployeeType.DEVELOPER.getExpense();

        assertTrue(result.equals(1000.00));
    }

    @Test
    public void testQATesterType () {
        Double result = EmployeeType.QATESTER.getExpense();

        assertTrue(result.equals(500.00));
    }

    @Test
    public void testManagerType () {
        Double result = EmployeeType.MANAGER.getExpense();

        assertTrue(result.equals(300.00));
    }
}
