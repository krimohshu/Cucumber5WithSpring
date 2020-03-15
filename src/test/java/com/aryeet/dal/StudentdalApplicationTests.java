package com.aryeet.dal;

import com.aryeet.dal.entities.Student;
import com.aryeet.dal.repos.StudentRepository;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void testCreateStudent() {

        Student student = new Student();
        student.setName("John");
        student.setCourse("Java Web Services");
        student.setFee(30d);

        studentRepository.save(student);

    }

    @Test
    public void testFindStudentById() {
        Student myStudent= studentRepository.findById(1l).get();
        System.out.println(myStudent);
    }

    @Test
    public void testUpdateStudent() {
        Student myStudent= studentRepository.findById(1l).get();
        myStudent.setFee(40d);

        studentRepository.save(myStudent);
    }

    @Test
    public void testDeleteStudent() {
        Student student = new Student();
        student.setId(1l);
        studentRepository.delete(student);
    }

}









