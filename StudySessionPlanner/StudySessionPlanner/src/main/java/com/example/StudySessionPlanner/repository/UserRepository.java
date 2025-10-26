package com.example.StudySessionPlanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.StudySessionPlanner.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
