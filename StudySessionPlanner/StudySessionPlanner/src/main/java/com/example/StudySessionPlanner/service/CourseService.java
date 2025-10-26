package com.example.StudySessionPlanner.service;

import com.example.StudySessionPlanner.entity.Course;
import com.example.StudySessionPlanner.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public List<Course> getCoursesByUser(Long userId) {
        return courseRepository.findByUserUserId(userId);
    }
}
