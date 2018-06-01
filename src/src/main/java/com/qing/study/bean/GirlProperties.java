package com.qing.study.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: qing.zhang
 * @date: 2018-05-31
 */
@ConfigurationProperties(prefix="girl")
@Component
public class GirlProperties {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
