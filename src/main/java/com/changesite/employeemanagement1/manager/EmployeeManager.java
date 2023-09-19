package com.changesite.employeemanagement1.manager;

import com.changesite.employeemanagement1.entities.Employee;
import com.changesite.employeemanagement1.repository.EmployeeRepository;
import com.changesite.employeemanagement1.sevices.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EmployeeManager implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getById(int id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public void save(Employee employee) {
employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
employeeRepository.deleteById(id);
    }
}
