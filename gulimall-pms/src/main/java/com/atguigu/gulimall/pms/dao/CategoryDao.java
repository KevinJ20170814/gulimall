package com.atguigu.gulimall.pms.dao;

import com.atguigu.gulimall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author jianghongbin
 * @email hiboy20170814@outlook.com
 * @date 2019-08-01 20:49:44
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
