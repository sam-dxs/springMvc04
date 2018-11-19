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
        person.add("jackie");   //索引为0
        person.add("peter");    //索引为1
        person.add("annie");    //索引为2
        person.add("martin");   //索引为3
    	
        return person;
    }

}