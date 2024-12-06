package com.example.employees.service;


import java.util.List;

import com.example.employees.model.Employee;

public interface EmployeeService {
    Employee registerEmployee(Employee employee);

    Double getHighestSalary();

    List<Employee> getAllEmployees();
}
