package com.yuxin.common.entity.vo;

import com.yuxin.common.entity.exception.ErrorEnum;
import lombok.Data;

/**
 * 接口返回数据类型
 * @date 2023-07-30 14:22
 * @author <a href="https://github.com/lydaiq">lydaiq</a>
 **/
@Data
public class AjaxResultVO<T> {

    /**
     * 返回状态
     */
    private Boolean success;

    /**
     * 状态码
     */
    private Integer errCode;

    /**
     * 提示信息
     */
    private String errMsg;

    /**
     * 返回对象
     */
    private T data;

    /**
     * 返回成功（无参数）
     * @date 2023-07-30 14:28
     * @author lydaiq
     *
     * @return com.yuxin.common.entity.vo.ApiResultVO<T>
     **/
    public static <T> AjaxResultVO<T> success() {
        AjaxResultVO<T> result = new AjaxResultVO<T>();
        result.setSuccess(Boolean.TRUE);
        result.setData(null);
        return result;
    }

    /**
     * 返回成功（带参数）
     * @date 2023-07-30 14:29
     * @author lydaiq
     * @param data 实体
     * @return com.yuxin.common.entity.vo.ApiResultVO<T>
     **/
    public static <T> AjaxResultVO<T> success(T data) {
        AjaxResultVO<T> result = new AjaxResultVO<T>();
        result.setSuccess(Boolean.TRUE);
        result.setData(data);
        return result;
    }

    /**
     * 返回失败
     * @date 2023-07-30 14:29
     * @author lydaiq
     * @param code 错误状态码
     * @param msg 错误消息
     * @return com.yuxin.common.entity.vo.ApiResultVO<T>
     **/
    public static <T> AjaxResultVO<T> fail(Integer code, String msg) {
        AjaxResultVO<T> result = new AjaxResultVO<T>();
        result.setSuccess(Boolean.FALSE);
        result.setErrCode(code);
        result.setErrMsg(msg);
        return result;
    }

    /**
     * 返回失败
     * @date 2023-07-30 14:30
     * @author lydaiq
     * @param errorEnum 枚举类型
     * @return com.yuxin.common.entity.vo.ApiResultVO<T>
     **/
    public static <T> AjaxResultVO<T> fail(ErrorEnum errorEnum) {
        AjaxResultVO<T> result = new AjaxResultVO<T>();
        result.setSuccess(Boolean.FALSE);
        result.setErrCode(errorEnum.getErrorCode());
        result.setErrMsg(errorEnum.getErrorMsg());
        return result;
    }

    public boolean isSuccess() {
        return this.success;
    }
}
