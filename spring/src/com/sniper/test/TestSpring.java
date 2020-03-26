package com.sniper.test;

import com.sniper.pojo.Category;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"spring-config.xml"}
        );

        Category c = (Category) context.getBean("c");
        System.out.println(c.getName());
    }
}
