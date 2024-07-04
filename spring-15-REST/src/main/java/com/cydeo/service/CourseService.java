package com.cydeo.service;

import com.cydeo.dto.CourseDTO;

import java.util.List;

public interface CourseService {

    CourseDTO createCourse(CourseDTO courseDto);

    CourseDTO getCourseById(Long courseId);

    List<CourseDTO> getCoursesByCategory(String category);

    List<CourseDTO> getCourses();

    void updateCourse(Long courseId, CourseDTO courseDTO);

    void deleteCourseById(long courseId);

    void deleteCourses();

}
