package com.mytests.jpa.springjpaconvertors;


import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
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
