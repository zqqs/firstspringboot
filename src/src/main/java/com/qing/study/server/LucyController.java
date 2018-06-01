package com.qing.study.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: qing.zhang
 * @date: 2018-05-31
 */
@RestController
@EnableConfigurationProperties({ConfigBean.class,User.class})
public class LucyController {

    @Autowired
    private ConfigBean configBean;
    @Autowired
    private User user;

    @RequestMapping(value = "/lucy")
    public String miya(){
        return configBean.getGreeting()+"========="+configBean.getName()+"======"+configBean.getUuid()+"====="+configBean.getMax();
    }

    @RequestMapping(value = "/user")
    public String user(){
        return user.getName()+"=========="+user.getAge();
    }
}
