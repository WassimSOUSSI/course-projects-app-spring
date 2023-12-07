package com.wassim.springsecurityexample.services;

import com.wassim.springsecurityexample.entities.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(long id);

    Employee save(Employee employee);

    Employee update(Employee employee,long id);

    void deleteById(long id);

    void saveAll(List<Employee> employees);
}
