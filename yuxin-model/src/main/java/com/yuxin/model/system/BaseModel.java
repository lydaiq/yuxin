package com.yuxin.model.system;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 基础实体类
 * @date 2023-07-30 14:22
 * @author <a href="https://github.com/lydaiq">lydaiq</a>
 **/
@Data
public class BaseModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 创建人
     */
    @TableField("create_by")
    private String createBy;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 修改人
     */
    @TableField("update_by")
    private String updateBy;

    /**
     * 修改时间
     */
    @TableField("update_time")
    private Date updateTime;
}
