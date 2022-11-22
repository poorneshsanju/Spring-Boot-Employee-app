package com.happiestminds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import javax.servlet.http.HttpServletRequest;


@Controller
public class EmployeeController {
    @RequestMapping(value = "/home")
    public String showHomePage(){
        return "/Employee";
    }

    @RequestMapping(value = "/processForm",method = RequestMethod.GET)
    public String showDashboardPage(HttpServletRequest request, Model theModel){
        int id = request.getIntHeader("empid");
        theModel.addAttribute("empid",id);
        String name = request.getParameter("empname");
        theModel.addAttribute("empname",name);
        String city = request.getParameter("city");
        theModel.addAttribute("city",city);
        long mobile = request.getIntHeader("mobile");
        theModel.addAttribute("mobile",mobile);
        String gender = request.getParameter("gender");
        theModel.addAttribute("gender",gender);
        return "/dashboard";
    }

}
