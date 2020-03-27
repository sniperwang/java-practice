package com.springdemo.controller;

import com.springdemo.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @RequestMapping("/addProduct")
    public ModelAndView add(Product product) throws Exception {
        ModelAndView mv = new ModelAndView("showProduct");
        mv.addObject("product", product);
        return mv;
    }
}
