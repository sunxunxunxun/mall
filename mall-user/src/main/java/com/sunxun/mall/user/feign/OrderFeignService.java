package com.sunxun.mall.user.feign;

import com.sunxun.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-order")
public interface OrderFeignService {
    @RequestMapping("/order/order/user/list")
    public R userorders();
}
