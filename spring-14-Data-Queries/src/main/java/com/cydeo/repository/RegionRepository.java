package com.cydeo.repository;

import com.cydeo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Integer> {

    //Display all regions in canada
    List<Region> findByCountry(String country); // SELECT * FROM regions WHERE country = 'countryName'



}
