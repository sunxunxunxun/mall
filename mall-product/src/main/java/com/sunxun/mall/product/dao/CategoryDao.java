package com.sunxun.mall.product.dao;

import com.sunxun.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author sunxun
 * @email sunxun1116@gmail.com
 * @date 2021-06-09 11:44:38
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
