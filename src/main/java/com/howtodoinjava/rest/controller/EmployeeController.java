package com.howtodoinjava.rest.controller;

//import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//import org.springframework.http.ResponseEntity;

//import com.howtodoinjava.rest.dao.EmployeeDAO;
import com.howtodoinjava.rest.model.Employee;
//import com.howtodoinjava.rest.model.Employees;
import com.howtodoinjava.rest.repository.EmployeeRepository;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // case sensitive query not working!
    @GetMapping(path = "/v1/get/name", produces = "application/json")
    public Employee findByfirstName(@RequestParam String employee_name) throws Exception {
        List<Employee> employeeList = employeeRepository.findAll();
        for (Employee employee_element : employeeList) {
            System.out.println(employee_element);
            if (employee_element.getFirstName().equals(employee_name)) {
                return employee_element;
            }
        }
        return null;
    }

    @GetMapping(path = "/v1/get/{id}", produces = "application/json")
    public Optional<Employee> findEmployeeById(@PathVariable(value = "id") Integer id_number) {
        return employeeRepository.findById(id_number);
    }

    @PostMapping(path = "/v1/save", consumes = "application/json", produces = "application/json")
    public Employee saveEmployee(@RequestBody Employee employee) throws Exception {
        return employeeRepository.save(employee);
    }

    @GetMapping(path = "/v1/get", produces = "application/json")
    public List<Employee> getListEmployee() throws Exception {
        return employeeRepository.findAll();
    }

    @DeleteMapping(path = "/v1/del/{id}", produces = "application/json")
    public void DeleteEmployeeById(@PathVariable(value = "id") Integer id) throws Exception {
        Optional<Employee> employee_by_id = employeeRepository.findById(id);
        if (employee_by_id != null) {
            employeeRepository.delete(employee_by_id.get());
        }
        return;
    }
}
