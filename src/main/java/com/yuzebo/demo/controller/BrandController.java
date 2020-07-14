package com.yuzebo.demo.controller;

import com.yuzebo.demo.entity.Brand;
import com.yuzebo.demo.entity.Result;
import com.yuzebo.demo.entity.StatusCode;
import com.yuzebo.demo.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : yuzebo <511729587@qq.com>
 * @Date : 2020/7/13 - 11:04 下午 - 星期一
 * @Package : com.yuzebo.demo.controller
 * @ProjectName : spring-boot-mapper-demo
 */
@RestController
@RequestMapping("/")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @GetMapping("brand/{id}")
    public Result<Brand> findByid(@PathVariable Integer id){
        Brand brand = brandService.findById(id);
        return  new Result<Brand>(true, StatusCode.OK,"查询成功",brand);
    }
}
