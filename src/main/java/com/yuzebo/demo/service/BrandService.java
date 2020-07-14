package com.yuzebo.demo.service;


import com.yuzebo.demo.entity.Brand;

/**
 * @Author : yuzebo <511729587@qq.com>
 * @Date : 2020/7/13 - 11:01 下午 - 星期一
 * @Package : com.yuzebo.demo.service.impl
 * @ProjectName : spring-boot-mapper-demo
 */
public interface BrandService {
    public Brand findById(int id);
}
