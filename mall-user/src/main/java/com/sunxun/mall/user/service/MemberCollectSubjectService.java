package com.sunxun.mall.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunxun.common.utils.PageUtils;
import com.sunxun.mall.user.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author sunxun
 * @email sunxun1116@gmail.com
 * @date 2021-06-09 19:25:42
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

