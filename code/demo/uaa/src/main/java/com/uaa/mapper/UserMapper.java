package com.uaa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.common.uaa.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:
 * @Author: zhurongsheng
 * @Date: 2020/7/10 01:17
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
}
