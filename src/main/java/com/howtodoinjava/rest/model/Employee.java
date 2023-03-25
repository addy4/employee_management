package com.howtodoinjava.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "workers")
public class Employee {

    public Employee() {

    }

    public Employee(Integer id, String firstName, String lastName, Integer patents, String empDepartment) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patents = patents;
        this.empDepartment = empDepartment;
    }

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer patents;
    private String empDepartment;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "First_Name", nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "Last_Name", nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "Patents", nullable = false)
    public Integer getPatents() {
        return patents;
    }

    public void setPatents(Integer patents) {
        this.patents = patents;
    }

    @Column(name = "Emp_Department", nullable = true)
    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", patents=" + patents
                + "]";
    }
}
