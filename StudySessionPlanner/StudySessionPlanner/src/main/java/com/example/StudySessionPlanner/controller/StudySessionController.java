package com.example.StudySessionPlanner.controller;

import com.example.StudySessionPlanner.entity.StudySession;
import com.example.StudySessionPlanner.service.StudySessionService;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/study-sessions")
public class StudySessionController {

    private final StudySessionService service;

    public StudySessionController(StudySessionService service) {
        this.service = service;
    }

    @PostMapping
    public StudySession addSession(@RequestBody StudySession session) {
        return service.addSession(session);
    }

    @GetMapping
    public List<StudySession> getAllSessions() {
        return service.getAllSessions();
    }

    @GetMapping("/{id}")
    public StudySession getSessionById(@PathVariable Long id) {
        return service.getSessionById(id);
    }

    @PutMapping("/{id}")
    public StudySession updateSession(@PathVariable Long id, @RequestBody StudySession session) {
        return service.updateSession(id, session);
    }

    @DeleteMapping("/{id}")
    public void deleteSession(@PathVariable Long id) {
        service.deleteSession(id);
    }

    @GetMapping("/user/{userId}")
    public List<StudySession> getSessionsByUser(@PathVariable Long userId) {
        return service.getSessionsByUser(userId);
    }

    @GetMapping("/course/{courseId}")
    public List<StudySession> getSessionsByCourse(@PathVariable Long courseId) {
        return service.getSessionsByCourse(courseId);
    }

    @GetMapping("/date/{date}")
    public List<StudySession> getSessionsByDate(@PathVariable String date) {
        return service.getSessionsByDate(LocalDate.parse(date));
    }
}
