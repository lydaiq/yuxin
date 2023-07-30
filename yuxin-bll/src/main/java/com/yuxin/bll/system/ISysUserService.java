package com.yuxin.bll.system;

import com.yuxin.model.system.SysUser;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ISysUserService {

    public List<SysUser> getList(SysUser sysUser);
}
