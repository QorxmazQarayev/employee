package com.changesite.employeemanagement1.controller;

import com.changesite.employeemanagement1.entities.Employee;
import com.changesite.employeemanagement1.manager.EmployeeManager;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeManager employeeManager;
    @GetMapping("/employees")
    public List<Employee> getAll(){
        return employeeManager.getAll();
    }
    @GetMapping("/employee/{id}")
    public Employee getById(@PathVariable int id){
        return employeeManager.getById(id);
    }
    @PostMapping("/employee")
    public void save(@RequestBody Employee employee){
        employeeManager.save(employee);
    }
    @DeleteMapping("/employee/{id}")
    public void deleteById(@PathVariable int id){
     employeeManager.deleteById(id);
    }

}
