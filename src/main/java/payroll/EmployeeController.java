package payroll;

import org.springframework.web.bind.annotation.*;

import java.util.List;

//indicates that the data returned by each method is written straight into the response body instead of rendering a template
@RestController
class EmployeeController {

    //is injected by a constructor into a controller
    private final EmployeeRepository repository;

    EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    /*
    We have routes for each operation (@GetMapping, @PostMapping, @PutMapping and @DeleteMapping, corresponding to
    HTTP GET, POST, PUT, and DELETE calls). (We recommend reading each method and understanding what they do.)
     */

    //aggregate root
    //tag::get-aggregate-root[]
    @GetMapping("/employees")
    List<Employee> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }

    //single item

    @GetMapping("/employees/{id}")
    Employee one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PutMapping("/employee/{id}")
    Employee replaceEmployees(@RequestBody Employee newEmployee, @PathVariable Long id) {
        return repository.findById(id)
                .map(employee -> {
                    employee.setName(newEmployee.getName());
                    employee.setRole(newEmployee.getRole());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    return repository.save(newEmployee);
                });
    }

    @DeleteMapping("/employee/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
