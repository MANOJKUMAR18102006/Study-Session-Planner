package com.example.StudySessionPlanner.repository;


import com.example.StudySessionPlanner.entity.StudySession;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface StudySessionRepository extends JpaRepository<StudySession, Long> {
    List<StudySession> findByUserUserId(Long userId);
    List<StudySession> findByCourseCourseId(Long courseId);
    List<StudySession> findBySessionDate(LocalDate date);
}
