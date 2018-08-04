package com.itheima;

import com.itheima.entiry.User;
import com.itheima.service.Impl.IUserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    @Test
    public void Test(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Bean.xml");
        IUserService userService = (IUserService) ac.getBean("IUserService");
        User user = new User();
        user.setId(1);
        user.setUsername("张三");
        user.setPassword("123");
        userService.save(user);

    }
}
