package com.xxy.blog.service;

import com.xxy.blog.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
