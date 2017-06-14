import model.Department;
import model.Employee;
import model.EmployeeType;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by cmmidd on 6/13/17.
 */
public class ExpenseCalculatorTest {
    @Test
    public void testCalculateSelfExpense() {
        Employee manager = new Employee(EmployeeType.MANAGER);
        ExpenseCalculator expenseCalculator = new ExpenseCalculator();

        Double result = expenseCalculator.calculateManagerExpense(manager);

        assertNotNull(result);
        assertTrue(result.equals(manager.getType().getExpense()));
    }

    @Test
    public void testCalculateMinionExpense() {
        Employee manager = new Employee(EmployeeType.MANAGER);
        Employee subManager = new Employee(EmployeeType.MANAGER);
        Employee developer = new Employee(EmployeeType.DEVELOPER);
        Employee qaTester = new Employee(EmployeeType.QATESTER);
        manager.addMinion(subManager).addMinion(developer).addMinion(qaTester);
        ExpenseCalculator expenseCalculator = new ExpenseCalculator();

        Double result = expenseCalculator.calculateManagerExpense(manager);

        assertNotNull(result);
        assertTrue(result.equals(2100.00));
    }

    @Test
    public void testNoMinionsToCalculate() {
        Employee developer = new Employee(EmployeeType.DEVELOPER);
        ExpenseCalculator expenseCalculator = new ExpenseCalculator();

        Double result = expenseCalculator.calculateManagerExpense(developer);

        assertNotNull(result);
        assertTrue(result.equals(developer.getType().getExpense()));
    }

    @Test
    public void testCalculateNoDepartmentExpense() {
        Department department = new Department();
        ExpenseCalculator expenseCalculator = new ExpenseCalculator();

        Double result = expenseCalculator.calculateDepartmentExpense(department);

        assertTrue(result.equals(0.00));
    }

    @Test
    public void testCalculateDepartmentMinionExpense() {
        Department department = new Department();
        Employee manager = new Employee(EmployeeType.MANAGER);
        Employee subManager = new Employee(EmployeeType.MANAGER);
        Employee developer = new Employee(EmployeeType.DEVELOPER);
        Employee qaTester = new Employee(EmployeeType.QATESTER);
        department.addMinion(manager).addMinion(subManager).addMinion(developer).addMinion(qaTester);
        ExpenseCalculator expenseCalculator = new ExpenseCalculator();

        Double result = expenseCalculator.calculateDepartmentExpense(department);

        assertNotNull(result);
        assertTrue(result.equals(2100.00));
    }
}
