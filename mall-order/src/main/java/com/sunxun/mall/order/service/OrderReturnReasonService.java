package com.sunxun.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunxun.common.utils.PageUtils;
import com.sunxun.mall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author sunxun
 * @email sunxun1116@gmail.com
 * @date 2021-06-09 21:10:17
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

