package com.ddc.model;

public class Account {
    private Integer id;

    private Integer user_id;

    private String name;

    public Account(Integer id, Integer user_id, String name) {
        this.id = id;
        this.user_id = user_id;
        this.name = name;
    }

    public Account() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}