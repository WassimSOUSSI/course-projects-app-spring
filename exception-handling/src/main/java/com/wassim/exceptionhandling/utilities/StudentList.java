package com.wassim.exceptionhandling.utilities;

import com.wassim.exceptionhandling.model.Student;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@Component
public class StudentList {

    public static List<Student> students=new ArrayList<>();

    public StudentList() {
        this.students.addAll(List.of(
                new Student(1,"firstName_1","lastName_1"),
                new Student(2,"firstName_2","lastName_2"),
                new Student(3,"firstName_3","lastName_3"),
                new Student(4,"firstName_4","lastName_4")
        ));
    }
}
