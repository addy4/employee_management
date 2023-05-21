package com.howtodoinjava.rest.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.transaction.annotation.Transactional;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "workers")
public class Employee {

    public Employee() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private Integer id;

    private String firstName;
    private String lastName;
    private Integer patents;
    private String empDepartment;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dept_id")
    private Department department;

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

    public void setDepartment(Department department) {
        this.department = department;
    }
}
