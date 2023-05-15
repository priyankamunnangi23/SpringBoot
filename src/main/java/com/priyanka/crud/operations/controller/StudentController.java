package com.priyanka.crud.operations.controller;

import com.priyanka.crud.operations.model.Student;
import com.priyanka.crud.operations.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final IStudentService studentService;

    @Autowired
    public StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(value = "/add")
    public Student addStudentDetails(@RequestBody Student student) {
        return studentService.addStudentDetails(student);
    }

    @DeleteMapping(value = "/delete/{id}")
    public int deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return id;
    }

    @GetMapping(value = "/")
    public List<Student> getAllStudent() {
        return studentService.findAllStudents();

    }

    @GetMapping(value = "/findByID/{id}")
    public Student findByID(@PathVariable int id) {
        return studentService.findByID(id);
    }

    @PutMapping(value = "/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }
}
