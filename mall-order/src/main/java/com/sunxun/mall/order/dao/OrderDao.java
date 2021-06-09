package com.sunxun.mall.order.dao;

import com.sunxun.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author sunxun
 * @email sunxun1116@gmail.com
 * @date 2021-06-09 21:10:17
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
