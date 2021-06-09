package com.sunxun.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunxun.common.utils.PageUtils;
import com.sunxun.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author sunxun
 * @email sunxun1116@gmail.com
 * @date 2021-06-09 11:44:38
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

