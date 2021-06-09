package com.sunxun.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunxun.common.utils.PageUtils;
import com.sunxun.mall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author sunxun
 * @email sunxun1116@gmail.com
 * @date 2021-06-09 21:10:17
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

