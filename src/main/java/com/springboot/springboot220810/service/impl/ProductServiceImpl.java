package com.springboot.springboot220810.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot.springboot220810.bean.Product;
import com.springboot.springboot220810.service.ProductService;
import com.springboot.springboot220810.mapper.ProductMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【t_product】的数据库操作Service实现
* @createDate 2022-08-13 10:30:58
*/
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
    implements ProductService{
}




