package com.student.management.controller.student;

import com.student.management.service.teacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class studentsTeacherController {

    @Autowired
    private teacherService teacherservice;

    @GetMapping("/teachers")
    public String teachers(Model model){

        model.addAttribute(
                "teachers",
                teacherService.getAllteachers()
        );

        return "student/teachers";

    }

}