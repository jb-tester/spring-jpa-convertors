package com.mytests.jpa.springjpaconvertors;


import jakarta.persistence.*;
//import javax.persistence.*;

/**
 * *
 * <p>Created by irina on 10/18/2021.</p>
 * <p>Project: spring-jpa-convertors</p>
 * *
 */
@Converter//(autoApply = true)
public class PhoneAttributeConverter implements AttributeConverter<Phone, String> {

    @Override
    public String convertToDatabaseColumn(Phone attribute) {
        return attribute == null ? null : attribute.getPhone();
    }

    @Override
    public Phone convertToEntityAttribute(String dbData) {
        return dbData == null ? null : new Phone(dbData);
    }
}
