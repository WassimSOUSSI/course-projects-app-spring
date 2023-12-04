package com.wassim.springdatarest.utilities;

import com.wassim.springdatarest.entities.Employee;
import com.wassim.springdatarest.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DatabaseUtility {

    private final EmployeeRepository employeeRepository;

    public void initDB(){
        System.out.println("Database init ...");
        employeeRepository.saveAll(List.of(
                new Employee(1,"Wassim","SOUSSI","wassim.soussi@edu.isga.ma"),
                new Employee(2,"Emma","Baumgarten","wassimsoussi.ws@gmail.com"),
                new Employee(3,"Avani","Gupta","wassim.soussi@edu.isga.ma"),
                new Employee(4,"Yuri","Petrov","wassimsoussi.ws@gmail.com"),
                new Employee(5,"Juan","Vega","wassim.soussi@edu.isga.ma")
        ));
    }
}
