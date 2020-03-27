package com.springdemo.controller;

import com.springdemo.pojo.UploadImageFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
public class UploadImageController {

    @RequestMapping("/uploadImage")
    public ModelAndView uploadImage(HttpServletRequest request, UploadImageFile file)
            throws IllegalStateException, IOException {

        return null;
    }

}
