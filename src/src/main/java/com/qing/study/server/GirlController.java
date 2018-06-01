package com.qing.study.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: qing.zhang
 * @date: 2018-05-31
 */
@RestController
public class GirlController {

    @Value("${girl.name}")
    private String name;

    @Value("${girl.age}")
    private int age;

    @RequestMapping(value = "/mygirl",method = RequestMethod.GET)
    public String girl(){
        return name+"========="+age;
    }
}
