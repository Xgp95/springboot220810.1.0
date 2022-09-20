package com.springboot.springboot220810;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springboot.springboot220810.bean.User;
import com.springboot.springboot220810.mapper.UserMapper;
import com.springboot.springboot220810.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class Springboot220810ApplicationTests {

    @Autowired
    UserService userService;

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        userService.removeById(2017l);
        List<User> users = userService.list(new LambdaQueryWrapper<User>().between(User::getId, 1, 2022));
        users.forEach(System.out::println);
        System.out.println("######");
        List<User> users1 = userService.list(new LambdaQueryWrapper<User>().eq(User::getAge, 20).between(User::getId, 1, 3000));
        System.out.println(users1.size() + "个，年龄20 id在1 - 3000");
    }

    @Test
    public void mabatisxTest() {
        List<User> userByAge = userService.getUserByAge(20);
        System.out.printf("20岁个数：" + userByAge.size());
        System.out.println();
    }

    @Test
    void selectPageTest() {
        Page<User> userPage = new Page<>(1, 10);
        userMapper.selectPage(userPage, new LambdaQueryWrapper<User>().eq(User::getAge, 30));
        long pages = userPage.getPages();
        long current = userPage.getCurrent();
        long total = userPage.getTotal();
        List<User> records = userPage.getRecords();
        for (User record : records) {
            System.out.println(record);
        }
        System.out.println("当前页" + current);
        System.out.println("总共" + pages + "页");
        System.out.println("总共" + total + "条记录");
    }
}
