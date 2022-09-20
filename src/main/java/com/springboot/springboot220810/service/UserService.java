package com.springboot.springboot220810.service;

import com.springboot.springboot220810.bean.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.springboot.springboot220810.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @description 针对表【user】的数据库操作Service
 * @createDate 2022-08-10 13:38:12
 */

public interface UserService extends IService<User> {
    public List<User> getUserByAge(int age);
}
