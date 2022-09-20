package com.springboot.springboot220810.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot.springboot220810.bean.User;
import com.springboot.springboot220810.service.UserService;
import com.springboot.springboot220810.mapper.UserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @description 针对表【user】的数据库操作Service实现
 * @createDate 2022-08-10 13:38:12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> getUserByAge(int age) {
        List<User> users = userMapper.selectAllByAge(age);
        return users;
    }
}




