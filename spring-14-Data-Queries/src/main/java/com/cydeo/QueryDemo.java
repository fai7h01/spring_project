package com.cydeo;

import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class QueryDemo implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("----------------------REGIONS----------------------");
        System.out.println("findByCountry: " + regionRepository.findByCountry("Canada"));
        System.out.println("findByCountryContaining: " + regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryContainsOrderByRegion: " + regionRepository.findByCountryContainsOrderByRegion("United"));
        System.out.println("findTopByCountry: " + regionRepository.findTopByCountry("United States"));
        System.out.println("findTop2ByCountry: " + regionRepository.findTop2ByCountry("United States"));
        System.out.println("findTopByCountryContainsOrderByRegion: " + regionRepository.findTopByCountryContainsOrderByRegion("United"));

        System.out.println("----------------------DEPARTMENTS----------------------");
        System.out.println("findByDepartment: " + departmentRepository.findByDepartment("Furniture"));
        System.out.println("findByDivision: " + departmentRepository.findByDivision("Health"));
        System.out.println("findByDivisionEndsWith: " + departmentRepository.findByDivisionEndsWith("ics"));
        System.out.println("findDistinctTop2ByDivisionContains: " + departmentRepository.findDistinctTop2ByDivisionContains("Hea"));

        System.out.println("----------------------EMPLOYEES----------------------");
        System.out.println("findByEmail: " + employeeRepository.findByEmail("bmanueau0@dion.ne.jp"));
        System.out.println("findByFirstNameAndLastNameOrEmail: " + employeeRepository.findByFirstNameAndLastNameOrEmail("Seline", "Dubber", "acurwood6@1und1.de"));
        System.out.println("findBySalaryIsGreaterThan" + employeeRepository.findBySalaryIsGreaterThan(100000));
        System.out.println("findBySalaryIsGreaterThanEqualOrderBySalary: " + employeeRepository.findBySalaryIsGreaterThanEqualOrderBySalary(120000));
        System.out.println("findByEmailIsNull: " + employeeRepository.findByEmailIsNull());
    }
}
