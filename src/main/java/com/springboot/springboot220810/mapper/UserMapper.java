package com.springboot.springboot220810.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.springboot.springboot220810.bean.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @author Administrator
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-08-10 13:38:12
* @Entity com.springboot.springboot220810.bean.User
*/
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
    List<User> selectAllByAge(@Param("age") Integer age);
}




