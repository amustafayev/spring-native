package com.example.springnative.repo;

import com.example.springnative.model.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends CrudRepository<PersonEntity,Long> {
}
