package com.changesite.employeemanagement1.sevices;

import com.changesite.employeemanagement1.entities.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
    Employee getById(int id);
    void save(Employee employee);
    void deleteById(int id);
}
