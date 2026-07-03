package com.student.management.repository;

import com.student.management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface userRepo extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
    Optional<User> findByUserEmail(String userEmail);

    boolean existsByUsername(String username);

    boolean existsByUserEmail(String userEmail);


}
