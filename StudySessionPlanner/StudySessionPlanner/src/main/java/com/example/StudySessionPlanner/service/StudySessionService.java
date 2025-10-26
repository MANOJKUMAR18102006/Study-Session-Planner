package com.example.StudySessionPlanner.service;


import com.example.StudySessionPlanner.entity.StudySession;
import com.example.StudySessionPlanner.repository.StudySessionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudySessionService {

    private final StudySessionRepository repository;

    public StudySessionService(StudySessionRepository repository) {
        this.repository = repository;
    }

    public StudySession addSession(StudySession session) {
        return repository.save(session);
    }

    public List<StudySession> getAllSessions() {
        return repository.findAll();
    }

    public StudySession getSessionById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public StudySession updateSession(Long id, StudySession updatedSession) {
        StudySession existing = repository.findById(id).orElseThrow();
        existing.setTitle(updatedSession.getTitle());
        existing.setDescription(updatedSession.getDescription());
        existing.setSessionDate(updatedSession.getSessionDate());
        existing.setStartTime(updatedSession.getStartTime());
        existing.setDurationMin(updatedSession.getDurationMin());
        existing.setStatus(updatedSession.getStatus());
        existing.setUpdatedAt(LocalDateTime.now());
        return repository.save(existing);
    }

    public void deleteSession(Long id) {
        repository.deleteById(id);
    }

    public List<StudySession> getSessionsByUser(Long userId) {
        return repository.findByUserUserId(userId);
    }

    public List<StudySession> getSessionsByCourse(Long courseId) {
        return repository.findByCourseCourseId(courseId);
    }

    public List<StudySession> getSessionsByDate(LocalDate date) {
        return repository.findBySessionDate(date);
    }
}
