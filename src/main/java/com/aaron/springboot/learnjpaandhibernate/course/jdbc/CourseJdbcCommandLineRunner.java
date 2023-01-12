package com.aaron.springboot.learnjpaandhibernate.course.jdbc;

import com.aaron.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn React", "Aaron"));
        repository.insert(new Course(2, "Learn Java", "Joe"));
        repository.insert(new Course(3, "Learn Express", "Chris"));

        repository.deleteById(1);

        System.out.println(repository.findById(2));
    }
}
