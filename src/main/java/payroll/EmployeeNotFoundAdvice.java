package payroll;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//signals that this advice is rendered straight into the response body
@RestControllerAdvice
public class EmployeeNotFoundAdvice {

    //configures the advice to only respond when an EmployeeNotFoundException is thrown
    @ExceptionHandler(EmployeeNotFoundException.class)

    //says to issue an HttpStatus.NOT_FOUND -- that is, an HTTP 404 error
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(EmployeeNotFoundException ex){
        return ex.getMessage();
    }
}
