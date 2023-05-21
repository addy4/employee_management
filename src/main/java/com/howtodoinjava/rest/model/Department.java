package com.howtodoinjava.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.transaction.annotation.Transactional;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "departments")
public class Department {

    public Department() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dept_id")
    private Integer department_id;
    private String deptName;
    private String headName;

    public Integer getId() {
        return department_id;
    }

    public void setId(Integer id) {
        this.department_id = id;
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
}
