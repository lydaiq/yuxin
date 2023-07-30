package com.yuxin.bll.system.Impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yuxin.bll.system.ISysUserService;
import com.yuxin.dao.system.SysUserMapper;
import com.yuxin.model.system.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserService implements ISysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public List<SysUser> getList(SysUser sysUser) {
        Wrapper<SysUser> queryWrapper=new QueryWrapper<SysUser>();
        return sysUserMapper.selectList(queryWrapper);
    }
}
