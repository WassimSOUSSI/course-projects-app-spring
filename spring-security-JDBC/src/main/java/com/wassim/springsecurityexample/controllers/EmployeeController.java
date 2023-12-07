package com.wassim.springsecurityexample.controllers;

import com.wassim.springsecurityexample.entities.Employee;
import com.wassim.springsecurityexample.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> findAll() {
        return new ResponseEntity<>(employeeService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/employees/{employeeId}")
    public ResponseEntity<Employee> getEmployee(@PathVariable int employeeId) {
        return new ResponseEntity<>(employeeService.findById(employeeId),HttpStatus.OK);
    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.save(employee),HttpStatus.OK);
    }

    @PutMapping("/employees/{employeeId}")
    public ResponseEntity<Employee>  updateEmployee(@RequestBody Employee employee, @PathVariable long employeeId) {
        return new ResponseEntity<>(employeeService.update(employee,employeeId),HttpStatus.OK);
    }


    @DeleteMapping("/employees/{employeeId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int employeeId) {
        Employee employee = employeeService.findById(employeeId);
        if (employee == null) {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }
        employeeService.deleteById(employeeId);
        return new ResponseEntity<>("Deleted employee id - " + employeeId,HttpStatus.NO_CONTENT);
    }


}
