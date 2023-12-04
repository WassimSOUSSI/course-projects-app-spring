package com.wassim.springdatarest.repositories;

import com.wassim.springdatarest.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
