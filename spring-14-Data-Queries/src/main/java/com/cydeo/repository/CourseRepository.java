package com.cydeo.repository;

import com.cydeo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course,Integer> {

    //Find all courses by category
    List<Course> findByCategory(String category);

    //Find all courses by category and order the entities by name
    List<Course> findByCategoryOrderByName(String category);

    //Checks if course exists with provided name
    boolean existsByName(String name);

    //Returns the count of the courses for the given category
    int countByCategory(String category);

    //Find all the courses that starts with the given course name
    List<Course> findByNameStartsWith(String name);

    //Find all courses by category and returns a stream;
    Stream<Course> streamAllByCategory(String category);


}
