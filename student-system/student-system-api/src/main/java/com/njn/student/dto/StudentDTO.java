package com.njn.student.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author qw
 */
@Data
@ApiModel("学生信息返回值")
public class StudentDTO {

    @ApiModelProperty("用户ID")
    private Integer id;

    @ApiModelProperty("学号")
    private String sNo;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("电话号码")
    private String phone;

    @ApiModelProperty("电子邮件")
    private String email;

    @ApiModelProperty("地址")
    private String address;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("创建时间")
    private LocalDateTime updateTime;
}
