package com.springdemo.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController{

    private static Log logger = LogFactory.getLog(IndexController.class);

    /**
     * 跳转到index页面
     * @return
     */
    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("redirect:/index");
        return mv;
    }

    /**
     * index
     * @param httpServletRequest
     * @param httpServletResponse
     * @return
     */
    @RequestMapping("/index")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("message", "Hello World!(●'◡'●)");
        return mv;
    }

    /**
     * session的次数，访问一次+1
     * @param session
     * @return
     */
    @RequestMapping("/check")
    public ModelAndView check(HttpSession session) {
        Integer i = (Integer) session.getAttribute("count");
        if (i == null)
            i = 0;
        i++;
        session.setAttribute("count", i);
        ModelAndView mv = new ModelAndView("check");
        return mv;
    }

    /**
     * 清空session访问，count参数，并跳转到check页面
     * @param request
     * @return
     */
    @RequestMapping("/clear")
    public ModelAndView clear(HttpServletRequest request) {
        request.getSession().removeAttribute("count");
        ModelAndView mv = new ModelAndView("redirect:/check");
        return mv;
    }
}
