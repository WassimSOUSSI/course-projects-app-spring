package com.wassim.exceptionhandling.services.impl;

import com.wassim.exceptionhandling.model.Student;
import com.wassim.exceptionhandling.services.StudentService;
import com.wassim.exceptionhandling.utilities.StudentList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> getStudents() {
        return StudentList.students;
    }

    @Override
    public Student getStudent(int studentId) {
        return StudentList.students.stream()
                .filter(student -> student.getId()==studentId)
                .findFirst().get();
    }
}
