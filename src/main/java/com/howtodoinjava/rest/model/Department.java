package com.howtodoinjava.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "departments")
public class Department {

    public Department() {

    }

    public Department(Integer id, String deptName, String headName) {
        super();
        this.id = id;
        this.deptName = deptName;
        this.headName = headName;
    }

    private Integer id;
    private String deptName;
    private String headName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "Department_Name", nullable = false, unique = true, columnDefinition = "citext")
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Column(name = "Head_Name", nullable = false)
    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    @Override
    public String toString() {
        return "Department [id=" + id + ", deptName=" + deptName + ", headName=" + headName + "]";
    }
}
