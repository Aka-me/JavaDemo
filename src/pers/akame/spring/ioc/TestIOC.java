package pers.akame.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {

    public void testUser(){
        //加载配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");

        User user=(User)context.getBean("user");

        System.out.println(user);
        user.add();
    }
}
