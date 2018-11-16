package com.ddc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ddc.dao.AccountMapper;
import com.ddc.dao.UserMapper;
import com.ddc.model.Account;
import com.ddc.model.User;
import com.ddc.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    
    @Autowired
    private AccountMapper accountMapper;  

    public User selectUserById(Integer userId) {  
        return userMapper.selectByPrimaryKey(userId);  
    }

	public Account selectAccountById(Integer id) {
		return accountMapper.selectByPrimaryKey(id);  
	}  
}