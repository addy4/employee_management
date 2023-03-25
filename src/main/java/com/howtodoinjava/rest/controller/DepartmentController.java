package com.howtodoinjava.rest.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.howtodoinjava.rest.model.Department;

import com.howtodoinjava.rest.repository.DepartmentRepository;

@RestController
@RequestMapping(path = "/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping(path = "/v1/save", consumes = "application/json", produces = "application/json")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentRepository.save(department);
    }

    @GetMapping(path = "/v1/get", produces = "application/json")
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

}
