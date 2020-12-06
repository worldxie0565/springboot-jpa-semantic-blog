package com.xxy.blog.dao;

import com.xxy.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsernameAndAndPassword(String username, String password);
}
