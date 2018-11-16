package com.ddc.service;

import com.ddc.model.User;
import com.ddc.model.Account;

public interface UserService {
    User selectUserById(Integer userId);
    Account selectAccountById(Integer id);
}