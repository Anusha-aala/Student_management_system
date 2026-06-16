package com.student.management.controller;

import com.student.management.service.studentService;
import com.student.management.model.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/students")
public class studentPageController {

    private final studentService studentservice;

    public studentPageController(
            studentService studentservice){

        this.studentservice=studentservice;
    }

    @GetMapping
    public String students(Model model){

        model.addAttribute(
                "students",
                studentservice.getAllStudents()
        );

        return "students";
    }

    @GetMapping("/add")
    public String addPage(){

        return "add-student";
    }


    @PostMapping("/save")
    public String saveStudent(
            @ModelAttribute student stu){

        studentservice.addStudent(stu);

        return "redirect:/admin/students";
    }

    @GetMapping("/edit/{id}")
    public String editPage(
            @PathVariable Long id,
            Model model){

        model.addAttribute(
                "student",
                studentservice.getStudentId(id)
        );

        return "edit-student";
    }

    @PostMapping("/update/{id}")
    public String update(
            @PathVariable Long id,
            student stu){

        studentservice.updateStudent(
                id,
                stu
        );

        return "redirect:/admin/students";
    }

    @GetMapping("/delete/{id}")
    public String delete(
            @PathVariable Long id){

        student s=
                studentservice
                        .getStudentId(id);

        if(s!=null){

            studentservice
                    .deleteStudent(s);
        }

        return "redirect:/admin/students";
    }
}