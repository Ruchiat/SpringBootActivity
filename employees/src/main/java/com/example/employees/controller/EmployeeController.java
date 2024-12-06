package com.example.employees.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.employees.model.Employee;
import com.example.employees.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService service;

    @GetMapping("/test")
    public String testEmployee() {
        
        return "Employee added successfully!";
    }
    
    @Operation(summary = "Register a new employee")
    @PostMapping("/register")
    public ResponseEntity<Employee> registerEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(service.registerEmployee(employee));
    }

    @Operation(summary = "Fetch the highest salary")
    @GetMapping("/highest-salary")
    public ResponseEntity<Double> getHighestSalary() {
        return ResponseEntity.ok(service.getHighestSalary());
    }

    @Operation(summary = "Get all employees")
    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(service.getAllEmployees());
    }
}
