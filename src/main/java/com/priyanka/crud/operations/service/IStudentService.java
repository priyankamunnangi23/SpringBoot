package com.priyanka.crud.operations.service;

import com.priyanka.crud.operations.model.Student;

import java.util.List;

public interface IStudentService {
    Student addStudentDetails(Student student); // add student

    void deleteStudent(int id); // delete studnetByID

    List<Student> findAllStudents(); //returns all the student details

    Student updateStudent(Student student); //update student detials

    Student findByID(int id); //find a student by his/her ID


}
