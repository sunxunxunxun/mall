package com.sunxun.mall.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sunxun.mall.order.entity.OrderEntity;
import com.sunxun.mall.order.service.OrderService;
import com.sunxun.common.utils.PageUtils;
import com.sunxun.common.utils.R;



/**
 * 订单
 *
 * @author sunxun
 * @email sunxun1116@gmail.com
 * @date 2021-06-09 21:10:17
 */
@RefreshScope
@RestController
@RequestMapping("order/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Value("${order.user.name}")
    private String name;
    @Value("${order.user.age}")
    private Integer age;
    @RequestMapping("/test")
    public R test() {
        return R.ok().put("name", name).put("age", age);
    }

    @RequestMapping("/user/list")
    public R userorders() {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderSn("2021061601");  // 订单号
        return R.ok().put("orders", Arrays.asList(orderEntity));
    }
    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = orderService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		OrderEntity order = orderService.getById(id);

        return R.ok().put("order", order);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody OrderEntity order){
		orderService.save(order);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody OrderEntity order){
		orderService.updateById(order);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		orderService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
