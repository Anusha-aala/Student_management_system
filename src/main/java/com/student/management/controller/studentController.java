package com.student.management.controller;
import com.student.management.model.student;
import com.student.management.service.studentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/students")
public class studentController{
    private final studentService studentservice;
    public studentController(studentService studentservice){
        this.studentservice=studentservice;
    }
    @PostMapping("/add")
    public void addStudent(@RequestBody student stu){
        studentservice.addStudent(stu);
    }
    @PutMapping("/update/{id}")
    public void updateStudent(@PathVariable Long id,@RequestBody student stu){
        studentservice.updateStudent(id,stu);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Long id){
        student student=studentservice .getStudentId(id);
        if(student!=null){
            studentservice.deleteStudent(student);
        }
    }
    @GetMapping("/{id}")
    public student getStudentById(@PathVariable Long id){
        return studentservice.getStudentId(id);
    }
    @GetMapping("/allstudents")
    public List<student> getAllStudents(){
        return studentservice.getAllStudents();
    }

}

