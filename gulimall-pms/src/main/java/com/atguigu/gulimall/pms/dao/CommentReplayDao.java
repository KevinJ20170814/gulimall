package com.atguigu.gulimall.pms.dao;

import com.atguigu.gulimall.pms.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author jianghongbin
 * @email hiboy20170814@outlook.com
 * @date 2019-08-01 20:49:45
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
