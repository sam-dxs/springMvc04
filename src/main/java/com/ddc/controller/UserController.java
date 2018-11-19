package com.ddc.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ddc.model.*;
import com.ddc.service.*;

@Controller  
public class UserController {  

    @Resource  
    private UserService userService; 
    


    @RequestMapping("/user")    
    public ModelAndView getUser(){      
        ModelAndView mav = new ModelAndView("user"); 
        User user = userService.selectUserById(1); 
        mav.addObject("user", user); 
        return mav; 
    }
    
    @RequestMapping("/account")    
    public ModelAndView getAccount(){      
        ModelAndView mav = new ModelAndView("user"); 
        Account account = userService.selectAccountById(1); 
        mav.addObject("user", account); 
        return mav; 
    }
   
    
}