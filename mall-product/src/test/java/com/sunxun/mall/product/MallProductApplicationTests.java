package com.sunxun.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunxun.mall.product.entity.BrandEntity;
import com.sunxun.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("一汽大众");

//        brandEntity.setName("一汽大众");
//        brandService.save(brandEntity);
//        System.out.println("保存成功!");
//        brandService.updateById(brandEntity);
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item)->{
            System.out.println(item);
        });
    }

}
