package com.student.management.service;
import com.student.management.model.student;
import com.student.management.repository.studentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class studentService {
    @Autowired
    private final  studentRepo studentrepo;
    public studentService(studentRepo studentrepo){
        this.studentrepo=studentrepo;

    }
    public student addStudent(student student) {
        if(student.getName() == null || student.getEmail() == null){
            return null;
        }



        return studentrepo.save(student);
    }
    public student updateStudent(Long id,student student){
        student existingStudent=studentrepo.findById(id).orElse(null);
        if(existingStudent==null){
            return null;
        }
        if(student.getName()!=null){
            existingStudent.setName(student.getName());
        }
        if(student.getEmail()!=null){
            existingStudent.setEmail(student.getEmail());
        }
        if(student.getCourse()!=null){
            existingStudent.setCourse(student.getCourse());
        }
        if(student.getPhoneNumber()!=null){
            existingStudent.setPhoneNumber(student.getPhoneNumber());
        }
        if(student.getAddress()!=null){
            existingStudent.setAddress(student.getAddress());
        }
        if(student.getGender()!=null){
            existingStudent.setGender(student.getGender());
        }
        if(student.getCoursesCompleted()!=null){
            existingStudent.setCoursesCompleted(student.getCoursesCompleted());
        }
        if(student.getCurrentYear()!=0){
            existingStudent.setCurrentYear(student.getCurrentYear());
        }
        return studentrepo.save(existingStudent);
    }
    public void deleteStudent(student student){
        studentrepo.deleteById(student.getStudentId());
    }
    public student getStudentId(Long id){
        return studentrepo.findById(id).orElse(null);
    }
    public List<student>getAllStudents(){

        return studentrepo.findAll();
    }
}
