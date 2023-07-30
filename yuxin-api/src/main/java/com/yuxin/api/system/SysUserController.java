package com.yuxin.api.system;

import com.yuxin.bll.system.ISysUserService;
import com.yuxin.common.entity.vo.ApiResultVO;
import com.yuxin.model.system.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;

    @GetMapping("/list")
    private ApiResultVO getList(SysUser sysUser){
        List<SysUser> list = sysUserService.getList(sysUser);
        return ApiResultVO.success(list);
    }
}
