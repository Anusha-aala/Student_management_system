package com.student.management.service;
import com.student.management.model.courses;
import com.student.management.repository.courseRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class courseService {
    private final courseRepo courserepo;
    public courseService(courseRepo courserepo){
        this.courserepo=courserepo;
    }
    public void addCourse(courses courses) {
        courserepo.save(courses);
    }
    public courses updateCourses(Long id, courses course) {

        courses existingCourse = courserepo.findById(id).orElse(null);

        if (existingCourse == null) {
            return null;
        }

        if (course.getCourseName() != null) {
            existingCourse.setCourseName(course.getCourseName());
        }

        if (course.getCredits() > 0) {
            existingCourse.setCredits(course.getCredits());
        }

        if (course.getSemester() > 0) {
            existingCourse.setSemester(course.getSemester());
        }

        if (course.getDepartments() != null) {
            existingCourse.setDepartments(course.getDepartments());
        }

        if (course.getDuration() > 0) {
            existingCourse.setDuration(course.getDuration());
        }

        return courserepo.save(existingCourse);
    }
    public void deleteCourse(courses course){
        courserepo.deleteById(course.getCourseId());
    }
    public courses getCourseId(Long id){
        return courserepo.findById(id).orElse(null);
    }
    public List<courses> getAllCourses(){

        return courserepo.findAll();
    }
}
