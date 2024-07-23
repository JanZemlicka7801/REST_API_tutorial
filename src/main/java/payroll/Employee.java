package payroll;

import java.util.Objects;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
class Employee {

    private @Id
    @GeneratedValue Long id;
    private String name;
    private String role;

    Employee() {}



}
