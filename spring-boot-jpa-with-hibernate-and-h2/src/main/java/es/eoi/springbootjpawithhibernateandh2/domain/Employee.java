package es.eoi.springbootjpawithhibernateandh2.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "EMPLOYEE_TYPE")
public class Employee {

    @Id
    @GeneratedValue
    Long id;

    String employee_type;
    String city;
    String state;
    String street;
    String zip;
    Float hourly_wage;
    int salary;

    @ManyToMany
    private List<Task> tasks;
}
