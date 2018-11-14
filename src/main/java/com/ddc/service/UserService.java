package com.ddc.service;

import com.ddc.model.User;

public interface UserService {
    User selectUserById(Integer userId);  
}