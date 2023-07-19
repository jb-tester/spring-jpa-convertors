package com.mytests.jpa.springjpaconvertors;

import jakarta.persistence.*;
//import javax.persistence.*;

/**
 * *
 * <p>Created by irina on 10/18/2021.</p>
 * <p>Project: spring-jpa-convertors</p>
 * *
 */
@Table(name = "person")
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // annotation is NOT required if the converter class has @Converter(autoApply = true)
    //@Convert(converter = GroupNumberAttributeConverter.class)
    private GroupNumber gr;

    // annotation is required if the converter class has @Converter(autoApply = false)
    @Convert(converter = PhoneAttributeConverter.class)
    private Phone phone;

   public GroupNumber getGr() {
       return gr;
   }

    public void setGr(GroupNumber ssn) {
        this.gr = ssn;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Person(String name, GroupNumber gr, Phone phone) {
        this.name = name;
        this.gr = gr;
        this.phone = phone;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", groupId=" + gr +
               ", phone=" + phone +
               '}';
    }
}
