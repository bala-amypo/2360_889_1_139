package com.example.demo.repository;
import org.springframework.data.Jpa.repository.JpaRepository;
import com.example.demo.entity.CourseContentTopic;
public interface CourseContentTopicRepository extends JpaRepository<CourseContentTopic, Long>{
    
} 