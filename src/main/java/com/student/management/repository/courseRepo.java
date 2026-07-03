package com.student.management.repository;
import com.student.management.model.courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courseRepo extends JpaRepository<courses,Long> {
}
