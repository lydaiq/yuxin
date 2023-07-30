package com.yuxin.dao.system;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yuxin.model.system.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户数据层
 * @date 2023-07-30 14:22
 * @author <a href="https://github.com/lydaiq">lydaiq</a>
 **/
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

}
