package com.yuxin.model.entity.system.bo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * 系统用户登录业务实体
 * @author <a href="https://github.com/lydaiq">lydaiq</a>
 * @date 2023-07-30
 **/
@Data
public class LoginUserBO {

    /**
     * 账号
     */
    @NotBlank(message = "用户名不能为空")
    @Length(min = 6, max = 20, message = "账号长度为 6-20 位")
    @Pattern(regexp = "^[A-Za-z0-9]+$", message = "账号格式为数字以及字母")
    private String username;

    /**
     * 密码
     */
    @NotBlank(message = "密码不可以为空！")
    @Pattern(regexp = "^(\\w){6,18}$",message = "密码应为[A-Za-z0-9_]组成的6-18位字符！")
    private String password;

    /**
     * 验证码
     */
    private String validCode;
}
