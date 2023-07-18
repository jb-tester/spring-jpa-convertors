package com.mytests.jpa.springjpaconvertors;

import org.springframework.web.bind.annotation.*;

/**
 * *
 * <p>Created by irina on 10/18/2021.</p>
 * <p>Project: spring-jpa-convertors</p>
 * *
 */
@RestController
@RequestMapping("/")
public class PersonController {

    private final PersonRepo repo;

    public PersonController(PersonRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public Iterable<Person> all() {

        return repo.findAll();
    }

    @PostMapping("/add")
    public String add(@RequestBody Person person) {
        repo.save(person);
        return "add";
    }
}
