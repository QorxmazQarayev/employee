package com.changesite.employeemanagement1.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
@Table(name="employee")
public class Employee {
    @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
Integer id;
    @Column(name="employee_name")
String name;
    @Column(name="employee_surname")
String surname;
    @Column(name="employee_salary")
double salary;
    @Column(name="employee_age")
int age;
}
