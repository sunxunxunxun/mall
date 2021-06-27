package com.sunxun.mall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sunxun.mall.product.entity.BrandEntity;
import com.sunxun.mall.product.service.BrandService;
import com.sunxun.common.utils.PageUtils;
import com.sunxun.common.utils.R;



/**
 * 品牌
 *
 * @author sunxun
 * @email sunxun1116@gmail.com
 * @date 2021-06-09 16:05:04
 */
@RestController
@RequestMapping("product/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @RequestMapping("/test")
    public R test () {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("蜜雪冰城");
        brandEntity.setDescript("蜜雪冰城甜蜜蜜");
        brandService.save(brandEntity);
        brandEntity.setDescript("Mixue ice-cream and tea.");
        brandService.update();

        QueryWrapper<BrandEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("descript", "中国");
        List<BrandEntity> brands = brandService.list(queryWrapper);

//        return  R.ok().put("brand", brandEntity);
        brandService.removeById(3l);
        BrandEntity deletedBrand = brandService.getById(3l);
        return R.ok().put("brand", brandEntity);
//        return R.ok().put("brand", deletedBrand);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = brandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    public R info(@PathVariable("brandId") Long brandId){
		BrandEntity brand = brandService.getById(brandId);

        return R.ok().put("brand", brand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BrandEntity brand){
		brandService.save(brand);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BrandEntity brand){
		brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] brandIds){
		brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
