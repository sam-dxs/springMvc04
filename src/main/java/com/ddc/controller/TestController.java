package com.ddc.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;


@RestController
public class TestController {

    @Resource
    private RedisTemplate<String,String> redisTemplate;

    @RequestMapping("/redisTest")
    public String redisTest(){
        return redisTemplate.opsForValue().get("myKey");
    }

    @RequestMapping("/redisSet")
    public void redisSet(){
        redisTemplate.opsForValue().set("myKey", "123456");
    }

}