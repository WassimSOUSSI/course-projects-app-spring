package com.wassim.exceptionhandling.services;

import com.wassim.exceptionhandling.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudents();

    Student getStudent(int studentId);
}
