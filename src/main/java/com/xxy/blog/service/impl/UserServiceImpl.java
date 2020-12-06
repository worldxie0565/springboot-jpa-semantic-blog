package com.xxy.blog.service.impl;

import com.xxy.blog.dao.UserRepository;
import com.xxy.blog.po.User;
import com.xxy.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        return userRepository.findByUsernameAndAndPassword(username, password);
    }
}
