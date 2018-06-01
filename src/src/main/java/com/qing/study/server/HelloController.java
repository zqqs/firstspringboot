package com.qing.study.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 学习springboot
 * @author: qing.zhang
 * @date: 2018-05-31
 */
@RestController //等同于加上@controller和@responseBody
public class HelloController {


    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    public String say(){
        return "hello world";
    }
}
