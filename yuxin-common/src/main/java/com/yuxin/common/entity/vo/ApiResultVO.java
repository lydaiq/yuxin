package com.yuxin.common.entity.vo;

import com.yuxin.common.entity.exception.ErrorEnum;
import lombok.Data;

@Data
public class ApiResultVO<T> {

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

    public static <T> ApiResultVO<T> success() {
        ApiResultVO<T> result = new ApiResultVO<T>();
        result.setSuccess(Boolean.TRUE);
        result.setData(null);
        return result;
    }

    public static <T> ApiResultVO<T> success(T data) {
        ApiResultVO<T> result = new ApiResultVO<T>();
        result.setSuccess(Boolean.TRUE);
        result.setData(data);
        return result;
    }

    public static <T> ApiResultVO<T> fail(Integer code, String msg) {
        ApiResultVO<T> result = new ApiResultVO<T>();
        result.setSuccess(Boolean.FALSE);
        result.setErrCode(code);
        result.setErrMsg(msg);
        return result;
    }

    public static <T> ApiResultVO<T> fail(ErrorEnum errorEnum) {
        ApiResultVO<T> result = new ApiResultVO<T>();
        result.setSuccess(Boolean.FALSE);
        result.setErrCode(errorEnum.getErrorCode());
        result.setErrMsg(errorEnum.getErrorMsg());
        return result;
    }

    public boolean isSuccess() {
        return this.success;
    }
}
