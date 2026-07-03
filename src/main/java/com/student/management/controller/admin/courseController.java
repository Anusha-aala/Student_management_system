package com.student.management.controller.admin;
import com.student.management.model.courses;
import com.student.management.service.courseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class courseController {
    public final courseService courseservice;
    public courseController(courseService courseservice){
        this.courseservice=courseservice;
    }
    @PostMapping("/add")
    public void addCourses(@RequestBody courses cu){
        courseservice.addCourse(cu);
    }
    @PutMapping("/update/{id}")
    public void updateCourses(@PathVariable long id,@RequestBody courses cu){
        courseservice.updateCourses(id,cu);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteCourses(@PathVariable long id){
        courses cu=courseservice.getCourseId(id);
        if(cu!=null){
            courseservice.deleteCourse(cu);
        }
    }
    @GetMapping("/{id}")
    public courses getCourseId(@PathVariable long id){
        return courseservice.getCourseId(id);
    }
    @GetMapping("/allcourses")
    public List<courses> getAllCourses(){
        return courseservice.getAllCourses();
    }

}
