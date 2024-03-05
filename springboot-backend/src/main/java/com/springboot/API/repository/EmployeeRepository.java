package com.springboot.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.API.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
