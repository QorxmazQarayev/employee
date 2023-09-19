package com.changesite.employeemanagement1.repository;

import com.changesite.employeemanagement1.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
