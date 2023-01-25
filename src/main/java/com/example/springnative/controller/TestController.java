package com.example.springnative.controller;

import com.example.springnative.model.PersonDto;
import com.example.springnative.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final PersonService personService;

    @GetMapping("/people/{id}")
    PersonDto getPersonById(@PathVariable("id") Long id) {
        return personService.getPersonById(id);
    }

    @PostMapping("/people")
    void createPerson(@RequestBody PersonDto person) {
        personService.createPerson(person);
    }

}
