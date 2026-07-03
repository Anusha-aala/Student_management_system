package com.student.management.service;
import com.student.management.model.teacher;
import com.student.management.repository.teacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class teacherService {
    @Autowired
    private static teacherRepo teacherrepo;
    public teacherService(teacherRepo teacherrepo){
        this.teacherrepo=teacherrepo;
    }
    public static teacher addTeacher(teacher teacher) {

        System.out.println("Saving teacher...");

        teacher saved = teacherrepo.save(teacher);

        System.out.println("Saved id: " + saved.getTeacherId());

        return saved;
    }




    public static teacher updateTeacher(Long id, teacher teacher){
        teacher existingTeacher=teacherrepo.findById(id).orElse(null);
        if(existingTeacher==null){
            return null;
        }
        if(teacher.getTeacherName()!=null){
            existingTeacher.setTeacherName(teacher.getTeacherName());
        }
        if(teacher.getTeacherEmail()!=null){
            existingTeacher.setTeacherEmail(teacher.getTeacherEmail());
        }
        if(teacher.getTeacherHighestQualifications()!=null){
            existingTeacher.setTeacherHighestQualifications(teacher.getTeacherHighestQualifications());
        }
        if(teacher.getTeacherPhoneNumber()!=null){
            existingTeacher.setTeacherPhoneNumber(teacher.getTeacherPhoneNumber());
        }
        if(teacher.getTeacherGender()!=null){
            existingTeacher.setTeacherGender(teacher.getTeacherGender());
        }
        if(teacher.getTeacherAddress()!=null){
            existingTeacher.setTeacherAddress(teacher.getTeacherAddress());
        }
        if(teacher.getTeacherSpecializations()!=null){
            existingTeacher.setTeacherSpecilizations(teacher.getTeacherSpecializations());
        }

        return teacherrepo.save(existingTeacher);
    }



    public static void deleteTeacher(teacher teacher){
        teacherrepo.deleteById(teacher.getTeacherId());
    }
    public teacher teacherId(Long id){
        return teacherrepo.findById(id).orElse(null);
    }
    public static List<teacher> getAllteachers(){

        return teacherrepo.findAll();
    }

    public static teacher getTeacherId(Long id) {
        return teacherrepo.findById(id).orElse(null);
    }
}
