package com.SchoolManagement.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @Value("${runType}")
    private String runType;

        @RequestMapping("/")
    public String profile(){
        if(runType.equalsIgnoreCase("dev")){


           return "index.jsp";
        }
        else{
            return "NotAuth.jsp";
        }
    }
   




}
