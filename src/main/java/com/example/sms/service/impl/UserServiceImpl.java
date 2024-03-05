package com.example.sms.service.impl;

import com.example.sms.mapper.UserMapper;
import com.example.sms.pojo.User;
import com.example.sms.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据用户名和密码获取学生对象
     * @return 返回匹配的Student对象
     */
    @Override
    public User login(User user) {
        return userMapper.getUsernameAndPwd(user);
    }
}
