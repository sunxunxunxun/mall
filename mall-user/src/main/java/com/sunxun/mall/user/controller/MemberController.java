package com.sunxun.mall.user.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import com.sunxun.mall.user.feign.OrderFeignService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sunxun.mall.user.entity.MemberEntity;
import com.sunxun.mall.user.service.MemberService;
import com.sunxun.common.utils.PageUtils;
import com.sunxun.common.utils.R;



/**
 * 会员
 *
 * @author sunxun
 * @email sunxun1116@gmail.com
 * @date 2021-06-09 19:25:42
 */
@RestController
@RequestMapping("user/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    OrderFeignService orderFeignService;
    @RequestMapping("/orders")
    public R test() {
//        MemberEntity memberEntity = new MemberEntity();
//        memberEntity.setNickname("孙逊");
        R userOrders = orderFeignService.userorders(1l);
        return R.ok().put("orders", userOrders.get("orders"));
    }
    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
