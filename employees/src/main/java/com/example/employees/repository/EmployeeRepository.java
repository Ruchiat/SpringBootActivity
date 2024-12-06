package com.example.employees.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.employees.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("SELECT MAX(e.salary) FROM Employee e")
    Double findHighestSalary();
}
