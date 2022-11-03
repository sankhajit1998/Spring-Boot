package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Employee;

// JpaRepository internally provides @Repository annotation, so we don't have to add @Repository 
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
