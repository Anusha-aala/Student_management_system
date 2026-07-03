package com.student.management.controller.student;
import com.student.management.service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class studentCoursesController {

    @Autowired
    private courseService courseService;

    @GetMapping("/courses")
    public String courses(Model model){

        model.addAttribute(
                "courses",
                courseService.getAllCourses()
        );

        return "student/courses";

    }

}