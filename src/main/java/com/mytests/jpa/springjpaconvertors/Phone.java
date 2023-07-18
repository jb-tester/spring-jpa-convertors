package com.mytests.jpa.springjpaconvertors;

import java.io.Serializable;

/**
 * *
 * <p>Created by irina on 10/18/2021.</p>
 * <p>Project: spring-jpa-convertors</p>
 * *
 */
public class Phone implements Serializable {
    private String phone;

    public Phone(String phone) {
        if(!phone.matches("\\d{7}")){
            throw new IllegalArgumentException("value must contain only 7 digits");
        }
        this.phone = phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public Phone() {
    }
}
