package com.yuxin.bll.system.Impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yuxin.bll.system.ISysUserService;
import com.yuxin.dao.system.SysUserMapper;
import com.yuxin.model.entity.system.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 系统用户接口
 * @date 2023-07-30 14:22
 * @author <a href="https://github.com/lydaiq">lydaiq</a>
 **/
@Service
public class SysUserService implements ISysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    /**
     * 获取用户列表
     * @date 2023-07-30 14:21
     * @author lydaiq
     * @param sysUser
     * @return com.yuxin.common.entity.vo.ApiResultVO
     **/
    public List<SysUser> getList(SysUser sysUser) {
        Wrapper<SysUser> queryWrapper=new QueryWrapper<SysUser>();
        return sysUserMapper.selectList(queryWrapper);
    }
}
