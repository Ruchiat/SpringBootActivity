package com.example.employees.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.employees.model.Employee;
import com.example.employees.repository.EmployeeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;

    @Override
    public Employee registerEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Double getHighestSalary() {
        return repository.findHighestSalary();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }
}
