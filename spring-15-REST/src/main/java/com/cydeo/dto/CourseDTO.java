package com.cydeo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseDTO {

    @JsonIgnore
    private Long id;
    private String name;
    private String category;
    private int rating;
    private String description;


}
