package com.mytests.jpa.springjpaconvertors;

import java.io.Serializable;

/**
 * *
 * <p>Created by irina on 10/18/2021.</p>
 * <p>Project: spring-jpa-convertors</p>
 * *
 */
public class GroupNumber implements Serializable {
    public void setValue(Integer value) {
        this.value = value;
    }

    private Integer value;

    public GroupNumber(Integer value) {
        this.value = value;
        if ((value < 1) || (value > 3)) {
            throw new IllegalArgumentException("value must be in {1,2,3}");
        }
    }

    public Integer getValue() {
        return value;
    }
}
