package com.ddc.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ddc.model.User;
import com.ddc.service.UserService;

@Controller  
public class UserController {  

    @Resource  
    private UserService userService; 

    @RequestMapping("/user")    
    public ModelAndView getIndex(){      
        ModelAndView mav = new ModelAndView("user"); 
        User user = userService.selectUserById(1); 
        mav.addObject("user", user); 
        return mav; 
    }    
}