package com.yuxin.bll.system;

import com.yuxin.model.entity.system.SysUser;

import java.util.List;

/**
 * 系统用户接口
 * @date 2023-07-30 14:22
 * @author <a href="https://github.com/lydaiq">lydaiq</a>
 **/
public interface ISysUserService {

    /**
     * 获取用户列表
     * @date 2023-07-30 14:27
     * @author xiaoyu
     * @param sysUser
     * @return java.util.List<com.yuxin.model.system.SysUser>
     **/
    List<SysUser> getList(SysUser sysUser);
}
