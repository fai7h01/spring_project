package com.cydeo.repository;

import com.cydeo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,String> {

    //Display all departments in the Furniture Department
    List<Department> findByDepartment(String department);

    //Display all departments in the health division
    List<Department> findByDivision(String division);
    List<Department> findByDivisionIs(String division);
    List<Department> findByDivisionEquals(String division);

    //Display all departments with division name ends with 'ics'
    List<Department> findByDivisionEndsWith(String pattern);

    //Display top 2 departments with division name includes 'Hea' without duplicates
    List<Department> findDistinctTop2ByDivisionContains(String pattern);

    @Query(value = "SELECT d FROM departments d WHERE d.division IN (?1)", nativeQuery = true)
    List<Department> retrieveDepartmentDivision(List<String> division);

}
