package com.priyanka.crud.operations.service.Impl;

import com.priyanka.crud.operations.dao.StudentRepository;
import com.priyanka.crud.operations.model.Student;
import com.priyanka.crud.operations.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {

    private final StudentRepository studentRepository;

    //we are injecting dependency of studentRepo through consturctor //depency injection
    //we are not creating obj manually but spring will create for us and we are injecting through @Autowire
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student addStudentDetails(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> findAllStudents() {
        Iterable<Student> iterable = studentRepository.findAll();
        List<Student> studentList = new ArrayList<>();
        for (Student i : iterable) {
            studentList.add(i);
        }
        return studentList;
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findByID(int id) {
        Optional<Student> optStu = studentRepository.findById(id);
        return optStu.orElse(null);
    }
}
