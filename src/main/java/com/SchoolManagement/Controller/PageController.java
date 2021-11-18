package com.SchoolManagement.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @Value("${isDev}")
    private String isDev;

    @RequestMapping("/")
    public String index() {
        if (isDev.equalsIgnoreCase("true")) {

            return "index.jsp";
        } else {
            return "\\resource\\html\\NotAuth.jsp";
        }
    }

    @RequestMapping("/addstudent")
    public String addstudent() {
            return "\\resource\\html\\addStudent.jsp";
    }

}
