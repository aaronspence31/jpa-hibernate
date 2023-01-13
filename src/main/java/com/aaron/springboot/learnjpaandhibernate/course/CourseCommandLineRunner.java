package com.aaron.springboot.learnjpaandhibernate.course;

import com.aaron.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn React", "Aaron"));
        repository.save(new Course(2, "Learn Java", "Joe"));
        repository.save(new Course(3, "Learn Express", "Chris"));
        repository.save(new Course(3, "Learn JPA", "Ragna"));

        repository.deleteById(1L);

        System.out.println(repository.findById(2L));
    }
}
