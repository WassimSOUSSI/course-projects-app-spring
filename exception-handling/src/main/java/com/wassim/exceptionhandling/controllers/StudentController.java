package com.wassim.exceptionhandling.controllers;

import com.wassim.exceptionhandling.model.Student;
import com.wassim.exceptionhandling.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        return new ResponseEntity<>(studentService.getStudents(), HttpStatus.OK);
    }

    @GetMapping("{studentId}")
    public ResponseEntity<Student> getStudent(@PathVariable int studentId){
        return new ResponseEntity<>(studentService.getStudent(studentId), HttpStatus.OK);
    }
}
