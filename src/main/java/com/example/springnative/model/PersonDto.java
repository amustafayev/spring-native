package com.example.springnative.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonDto {
    private Long id;
    private int age;
    private String name;
    private String surname;
    private float height;
}
