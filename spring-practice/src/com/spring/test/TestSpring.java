package com.spring.test;

import com.spring.pojo.Category;
import com.spring.pojo.Product;
import com.spring.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class TestSpring {

    /*public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"spring-config.xml"}
        );

        Category c = (Category) context.getBean("c");
        Product p = (Product) context.getBean("p");
        ProductService ps = (ProductService) context.getBean("ps");

//        System.out.println(c.getName());
//        System.out.println(p.getName());
//        System.out.println(p.getCategory().getName());
        ps.doSomeService();
    }*/

    @Autowired
    Category c;

    @Test
    public void test(){
        System.out.println(c.getName());
    }
}
