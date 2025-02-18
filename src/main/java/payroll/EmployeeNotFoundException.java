package payroll;

//EmployeeNotFoundException is an exception used to indicate when an employee is looked up but not found
public class EmployeeNotFoundException extends RuntimeException {
    EmployeeNotFoundException(Long id) {
        super("Could not find employee number - " + id + ".");
    }
}
