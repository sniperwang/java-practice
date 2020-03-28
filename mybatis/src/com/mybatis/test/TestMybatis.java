package com.mybatis.test;

import com.mybatis.pojo.Category;
import com.mybatis.pojo.Product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    public static void main(String[] args) throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        /*List<Category> categories = sqlSession.selectList("listCategoryWithProduct");
        for (Category c : categories) {
            System.out.println(c);
            List<Product> products = c.getProducts();
            for (Product p : products) {
                System.out.println(p);
            }
        }*/

        List<Product> products = sqlSession.selectList("listProduct");
        for (Product p : products) {
            System.out.println(p + "对应的分类是 \t" + p.getCategory());
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
