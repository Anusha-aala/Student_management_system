package com.student.management.repository;
import com.student.management.model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface studentRepo extends JpaRepository<student, Long> {


}
