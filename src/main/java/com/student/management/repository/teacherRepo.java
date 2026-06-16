package com.student.management.repository;
import com.student.management.model.teacher;
import org.springframework.data.jpa.repository.JpaRepository;


public interface teacherRepo extends JpaRepository <teacher,Long>{
}
