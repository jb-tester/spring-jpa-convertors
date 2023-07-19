package com.mytests.jpa.springjpaconvertors;


import jakarta.persistence.*;

//import javax.persistence.*;

/**
 * *
 * <p>Created by irina on 10/18/2021.</p>
 * <p>Project: spring-jpa-convertors</p>
 * *
 */
@Converter(autoApply = true)
public class GroupNumberAttributeConverter implements AttributeConverter<GroupNumber, Integer> {

    @Override
    public Integer convertToDatabaseColumn(GroupNumber groupNumber) {
        return groupNumber == null ? null : groupNumber.getValue();
    }

    @Override
    public GroupNumber convertToEntityAttribute(Integer value) {
        return value == null ? null : new GroupNumber(value);
    }
}
