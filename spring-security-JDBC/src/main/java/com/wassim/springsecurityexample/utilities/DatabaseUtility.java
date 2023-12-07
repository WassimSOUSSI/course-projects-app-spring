package com.wassim.springsecurityexample.utilities;

import com.wassim.springsecurityexample.entities.Employee;
import com.wassim.springsecurityexample.entities.Roles;
import com.wassim.springsecurityexample.entities.User;
import com.wassim.springsecurityexample.repositories.RoleRepository;
import com.wassim.springsecurityexample.repositories.UserRepository;
import com.wassim.springsecurityexample.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DatabaseUtility {

    private final EmployeeService employeeService;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public void initDatabase(){
        System.out.println("Database init ...");

        // Init Employee table
        employeeService.saveAll(List.of(
                new Employee(1,"Wassim","SOUSSI","wassim.soussi@edu.isga.ma"),
                new Employee(2,"Emma","Baumgarten","wassimsoussi.ws@gmail.com"),
                new Employee(3,"Avani","Gupta","wassim.soussi@edu.isga.ma"),
                new Employee(4,"Yuri","Petrov","wassimsoussi.ws@gmail.com"),
                new Employee(5,"Juan","Vega","wassim.soussi@edu.isga.ma")
        ));

        // Init User table
        userRepository.saveAll(List.of(
                new User("wassim","{noop}123",1),
                new User("user","{noop}user",1)
        ));

        // Init Role table
        roleRepository.saveAll(List.of(
                new Roles("wassim","ADMIN"),
                new Roles("user","EMPLOYEE")
        ));
    }
}
