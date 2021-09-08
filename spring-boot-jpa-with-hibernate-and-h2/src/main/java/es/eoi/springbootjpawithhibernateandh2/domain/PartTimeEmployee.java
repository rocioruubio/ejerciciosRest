package es.eoi.springbootjpawithhibernateandh2.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Part Time")
public class PartTimeEmployee extends Employee{
    protected Float hourly;
}
