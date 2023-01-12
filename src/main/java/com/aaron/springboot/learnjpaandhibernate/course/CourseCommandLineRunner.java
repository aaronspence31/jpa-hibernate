package com.aaron.springboot.learnjpaandhibernate.course;

import com.aaron.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

    @Autowired
    private CourseJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn React", "Aaron"));
        repository.insert(new Course(2, "Learn Java", "Joe"));
        repository.insert(new Course(3, "Learn Express", "Chris"));
        repository.insert(new Course(3, "Learn JPA", "Ragna"));

        repository.deleteById(1);

        System.out.println(repository.findById(2));
    }
}
