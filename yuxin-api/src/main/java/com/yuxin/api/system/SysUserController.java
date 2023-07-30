package com.yuxin.api.system;

import com.yuxin.bll.system.ISysUserService;
import com.yuxin.common.entity.vo.AjaxResultVO;
import com.yuxin.model.entity.system.SysUser;
import com.yuxin.model.entity.system.bo.LoginUserBO;
import com.yuxin.model.entity.system.bo.SysUserBO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 系统用户接口
 * @date 2023-07-30 14:22
 * @author <a href="https://github.com/lydaiq">lydaiq</a>
 **/
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;

    /**
     * 获取用户列表
     * @date 2023-07-30 14:21
     * @author lydaiq
     * @param sysUserBO 系统用户
     * @return com.yuxin.common.entity.vo.ApiResultVO
     **/
    @GetMapping("/list")
    private AjaxResultVO getList(SysUserBO sysUserBO){
        SysUser sysUser=new SysUser();
        BeanUtils.copyProperties(sysUserBO,sysUser);
        List<SysUser> list = sysUserService.getList(sysUser);
        return AjaxResultVO.success(list);
    }

    /**
     * 用户登录接口
     * @date 2023-07-30 21:08
     * @author lydaiq
     * @param loginUserBO 系统用户
     * @return com.yuxin.common.entity.vo.AjaxResultVO
     **/
    @PostMapping("/login")
    private AjaxResultVO login(@Validated @RequestBody LoginUserBO loginUserBO){

        return AjaxResultVO.success();
    }
}
