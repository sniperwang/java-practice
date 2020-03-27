package com.springdemo.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController{

    private static Log logger = LogFactory.getLog(IndexController.class);

    @RequestMapping("/index")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("message", "Hello World!(●'◡'●)");
        return mv;
    }

    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("redirect:/index");
        return mv;
    }
}
