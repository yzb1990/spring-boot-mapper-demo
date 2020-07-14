package com.yuzebo.demo.service.impl;

import com.yuzebo.demo.entity.Brand;
import com.yuzebo.demo.mapper.BrandMapper;
import com.yuzebo.demo.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author : yuzebo <511729587@qq.com>
 * @Date : 2020/7/13 - 11:01 下午 - 星期一
 * @Package : com.yuzebo.demo.service.impl
 * @ProjectName : spring-boot-mapper-demo
 */

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public Brand findById(int id) {
        Brand brand = brandMapper.selectByPrimaryKey(id);
        return brand;
    }
}
