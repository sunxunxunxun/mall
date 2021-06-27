package com.sunxun.mall.user.feign;

import com.sunxun.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-order")
@Component
public interface OrderFeignService {
    @RequestMapping("/order/order/user/list")

    public R userorders(@PathVariable("id") Long id);
}
