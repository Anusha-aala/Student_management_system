package com.student.management.controller.admin;
import com.student.management.model.teacher;
import com.student.management.service.teacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/teachers")
public class teacherPageController {
    private final teacherService teacherservice;

    public teacherPageController(
            teacherService teacherservice){

        this.teacherservice=teacherservice;
    }
    @GetMapping
    public String teachers(Model model){

        model.addAttribute(
                "teachers",
                teacherService.getAllteachers());

        return "admin/teachers";
    }

    @GetMapping("/add")
    public String addTeacher(){

        return "admin/add-teacher";
    }

    @PostMapping("/save")
    public String saveTeacher(@ModelAttribute teacher teacher){

        teacherService.addTeacher(teacher);

        return "redirect:/admin/teachers";
    }

    @GetMapping("/edit/{id}")
    public String editTeacher(@PathVariable Long id,
                              Model model){

        model.addAttribute(
                "teacher",
                teacherService.getTeacherId(id));

        return "admin/edit-teacher";
    }

    @PostMapping("/update/{id}")
    public String updateTeacher(@PathVariable Long id,
                                @ModelAttribute teacher teacher){

        teacherService.updateTeacher(id, teacher);

        return "redirect:/admin/teachers";
    }

    @GetMapping("/delete/{id}")
    public String deleteTeacher(@PathVariable Long id){

        teacher teacher =
                teacherService.getTeacherId(id);

        teacherService.deleteTeacher(teacher);

        return "redirect:/admin/teachers";
    }
}

