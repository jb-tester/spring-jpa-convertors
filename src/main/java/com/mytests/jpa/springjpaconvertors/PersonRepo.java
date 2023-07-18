package com.mytests.jpa.springjpaconvertors;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

/**
 * *
 * <p>Created by irina on 10/18/2021.</p>
 * <p>Project: spring-jpa-convertors</p>
 * *
 */
public interface PersonRepo extends CrudRepository<Person, Integer> {


}
