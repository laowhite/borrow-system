package com.njn.student.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author timo
 * @since 2023-10-21
 */
@Getter
@Setter
@TableName("student")
@ApiModel(value = "Student对象", description = "")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("学号")
    @TableField("s_no")
    private String sNo;

    @ApiModelProperty("姓名")
    @TableField("name")
    private String name;

    @ApiModelProperty("电话号码")
    @TableField("phone")
    private String phone;

    @ApiModelProperty("电子邮件")
    @TableField("email")
    private String email;

    @ApiModelProperty("地址")
    @TableField("address")
    private String address;

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty("创建时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @ApiModelProperty("删除标记:1-删除,0-未删除")
    @TableField("deleted")
    @TableLogic
    private Boolean deleted;
}
