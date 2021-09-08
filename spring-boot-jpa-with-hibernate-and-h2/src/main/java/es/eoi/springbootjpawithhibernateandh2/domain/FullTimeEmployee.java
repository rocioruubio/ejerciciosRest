package es.eoi.springbootjpawithhibernateandh2.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("Full Time")
public class FullTimeEmployee extends Employee{
    protected Integer salary;
}
