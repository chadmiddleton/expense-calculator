import model.Department;
import model.Employee;

/**
 * Created by cmmidd on 6/13/17.
 */
public class ExpenseCalculator {
    public Double calculateManagerExpense(Employee employee) {
        Double expense = employee.getType().getExpense();

        for (Employee minions: employee.getMinions()){
            expense += calculateManagerExpense(minions);
        }
        return expense;
    }

    public Double calculateDepartmentExpense(Department department) {
        Double expense = 0.00;

        for (Employee minion: department.getMinions()){
            expense += minion.getType().getExpense();
        }
        return expense;
    }
}
