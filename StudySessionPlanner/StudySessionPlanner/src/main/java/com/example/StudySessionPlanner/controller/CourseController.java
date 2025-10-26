package com.example.StudySessionPlanner.controller;

import com.example.StudySessionPlanner.entity.Course;
import com.example.StudySessionPlanner.service.CourseService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/user/{userId}")
    public List<Course> getCoursesByUser(@PathVariable Long userId) {
        return courseService.getCoursesByUser(userId);
    }
}
