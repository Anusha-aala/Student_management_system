package com.student.management.controller.admin;

import com.student.management.model.courses;
import com.student.management.model.student;
import com.student.management.service.courseService;
import com.student.management.service.studentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/courses")
public class coursePageController {

    private final courseService courseservice;

    public coursePageController(courseService courseservice) {
        this.courseservice = courseservice;
    }

    @GetMapping
    public String getAllCourses(Model model) {
        model.addAttribute("courses", courseservice.getAllCourses());
        return "admin/courses";
    }

    @GetMapping("/add")
    public String addCoursePage() {
        return "admin/add-course";
    }

    @PostMapping("/save")
    public String saveCourse(courses course) {
        courseservice.addCourse(course);
        return "redirect:/admin/courses";
    }

    @GetMapping("/edit/{id}")
    public String editCourse(@PathVariable Long id, Model model) {
        model.addAttribute("course", courseservice.getCourseId(id));
        return "admin/edit-course";
    }

    @PostMapping("/update/{id}")
    public String updateCourse(@PathVariable Long id, courses course) {
        courseservice.updateCourses(id, course);
        return "redirect:/admin/courses";
    }

    @GetMapping("/delete/{id}")
    public String deleteCourse(@PathVariable Long id) {
        courses course = courseservice.getCourseId(id);

        if(course != null){
            courseservice.deleteCourse(course);
        }

        return "redirect:/admin/courses";

    }
}
