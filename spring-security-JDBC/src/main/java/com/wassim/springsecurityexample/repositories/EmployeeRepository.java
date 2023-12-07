package com.wassim.springsecurityexample.repositories;

import com.wassim.springsecurityexample.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
