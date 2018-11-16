package com.ddc.model;

import java.util.Date;

public class User {
    private Integer id;

    private String name;

    private Date addTime;

    private Date lastTime;

    public User(Integer id, String name, Date addTime, Date lastTime) {
        this.id = id;
        this.name = name;
        this.addTime = addTime;
        this.lastTime = lastTime;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }
}