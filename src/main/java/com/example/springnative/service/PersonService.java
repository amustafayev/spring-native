package com.example.springnative.service;

import com.example.springnative.model.PersonDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

    public PersonDto getPersonById(Long id) {
        PersonDto personDto = new PersonDto(id, 12, "Test", "Test", 12.3f);
        System.out.println(personDto);
        return personDto;
    }

    public void createPerson(PersonDto person) {

    }
}
