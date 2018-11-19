package com.ddc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/index")
    public String index(){
        return "demo-index";
    }
    
    @RequestMapping("/user")
    public String user(){
        return "list-user";
    }
    
    @RequestMapping("/todo")
    public List<String> todo(){
    	
    	List<String> person=new ArrayList<String>();
        person.add("jackie");   //����Ϊ0
        person.add("peter");    //����Ϊ1
        person.add("annie");    //����Ϊ2
        person.add("martin");   //����Ϊ3
    	
        return person;
    }

}