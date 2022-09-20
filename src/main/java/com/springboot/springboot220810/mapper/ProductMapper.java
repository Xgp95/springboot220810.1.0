package com.springboot.springboot220810.mapper;

import com.springboot.springboot220810.bean.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Administrator
* @description 针对表【t_product】的数据库操作Mapper
* @createDate 2022-08-13 10:30:58 ...
* @Entity com.springboot.springboot220810.bean.Product
*/
@Mapper
public interface ProductMapper extends BaseMapper<Product> {
}




