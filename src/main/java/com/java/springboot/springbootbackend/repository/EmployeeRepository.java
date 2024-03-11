package com.java.springboot.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.springboot.springbootbackend.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    
}
