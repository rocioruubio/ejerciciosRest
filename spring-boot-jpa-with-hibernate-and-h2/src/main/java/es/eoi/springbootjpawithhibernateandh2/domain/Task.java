package es.eoi.springbootjpawithhibernateandh2.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Task {

    @Id
    @GeneratedValue
    Long id;

    @ManyToMany(mappedBy = "tasks")
    private List<Employee> employees;
}
