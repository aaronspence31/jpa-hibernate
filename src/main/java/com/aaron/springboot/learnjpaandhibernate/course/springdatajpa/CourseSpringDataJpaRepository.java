package com.aaron.springboot.learnjpaandhibernate.course.springdatajpa;

import com.aaron.springboot.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

}
