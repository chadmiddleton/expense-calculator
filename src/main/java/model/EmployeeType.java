package model;

/**
 * Created by cmmidd on 6/13/17.
 */
public enum EmployeeType {

    DEVELOPER(1000.00),
    QATESTER(500.00),
    MANAGER(300.00);

    private final Double expense;

    EmployeeType(Double expense) {
        this.expense = expense;
    }

    public Double getExpense() {
        return expense;
    }
}
