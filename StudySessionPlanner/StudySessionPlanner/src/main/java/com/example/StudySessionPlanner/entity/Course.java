package com.example.StudySessionPlanner.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // who owns this course

    private String name;
    private String description;
    private LocalDateTime createdAt = LocalDateTime.now();
}
