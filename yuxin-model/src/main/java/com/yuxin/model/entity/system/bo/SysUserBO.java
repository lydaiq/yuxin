package com.yuxin.model.entity.system.bo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @author <a href="https://github.com/lydaiq">lydaiq</a>
 * @description
 * @date 2023-07-30
 **/
@Data
public class SysUserBO {

    /**
     * 用户编号
     */
    private String userId;

    /**
     * 账号
     */
    private String username;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码有效时间
     */
    private Date passwordExpirationTime;
}
