package com.example.StudySessionPlanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.StudySessionPlanner.entity.Course;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByUserUserId(Long userId);
}
