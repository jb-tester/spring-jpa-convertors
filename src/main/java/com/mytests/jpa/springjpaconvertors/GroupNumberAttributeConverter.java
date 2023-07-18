package com.mytests.jpa.springjpaconvertors;


import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

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
