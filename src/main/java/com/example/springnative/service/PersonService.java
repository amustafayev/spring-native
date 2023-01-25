package com.example.springnative.service;

import com.example.springnative.model.PersonEntity;
import com.example.springnative.repo.PersonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepo personRepo;
    public PersonEntity getPersonById(Long id) {
        return personRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("PERSON_NOT_FOUND"));
    }

    public void createPerson(PersonEntity person) {
        personRepo.save(person);
    }
}
