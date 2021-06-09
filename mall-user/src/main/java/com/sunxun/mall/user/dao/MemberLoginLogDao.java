package com.sunxun.mall.user.dao;

import com.sunxun.mall.user.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author sunxun
 * @email sunxun1116@gmail.com
 * @date 2021-06-09 19:25:42
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
