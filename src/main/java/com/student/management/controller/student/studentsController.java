package com.student.management.controller.student;

import com.student.management.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class studentsController {

    @Autowired
    private studentService studentservice;

    @GetMapping("/students")
    public String students(Model model){

        model.addAttribute(
                "students",
                studentservice.getAllStudents()
        );

        return "student/students";

    }

}