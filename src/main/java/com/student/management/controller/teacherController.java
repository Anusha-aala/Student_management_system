package com.student.management.controller;
import com.student.management.model.student;
import com.student.management.model.teacher;
import com.student.management.repository.teacherRepo;
import com.student.management.service.teacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class teacherController {
    private final teacherService teacherservice;
    public teacherController(teacherService teacherservice){
        this.teacherservice=teacherservice;
    }
    @PostMapping("/add")
    public teacher addTeacher(@RequestBody teacher tea){

        System.out.println("Controller received");
        System.out.println(tea.getTeacherName());

        teacher saved = teacherservice.addTeacher(tea);

        System.out.println("Saved = " + saved);

        return saved;
    }
    @PutMapping("/update/{id}")
    public void updateTeacher(@PathVariable Long id,@RequestBody teacher tea){
        teacherservice.updateTeacher(id,tea);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteTeacher(@PathVariable Long id){
        teacher teacher=teacherservice .getteacherId(id);
        if(teacher!=null){
            teacherservice.deleteTeacher(teacher);
        }
    }
    @GetMapping("/{id}")
    public teacher getTeacherById(@PathVariable Long id){
        return teacherservice.getteacherId(id);
    }
    @GetMapping("/allteachers")
    public List<teacher> getAllteachers(){
        return teacherservice.getAllteachers();
    }
}
