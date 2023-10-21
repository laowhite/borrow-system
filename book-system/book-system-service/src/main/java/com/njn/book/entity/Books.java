package com.njn.book.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
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
@TableName("books")
@ApiModel(value = "Books对象", description = "")
public class Books implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("图书ID")
    @TableId("id")
    private Long id;

    @ApiModelProperty("书名")
    @TableField("title")
    private String title;

    @ApiModelProperty("作者")
    @TableField("author")
    private String author;

    @ApiModelProperty("ISBN号")
    @TableField("isbn")
    private String isbn;

    @ApiModelProperty("出版商")
    @TableField("publisher")
    private String publisher;

    @ApiModelProperty("出版年份")
    @TableField("publication_year")
    private Integer publicationYear;

    @ApiModelProperty("类别")
    @TableField("category")
    private String category;

    @ApiModelProperty("副本数量")
    @TableField("number_of_copies")
    private Integer numberOfCopies;

    @ApiModelProperty("在架数量")
    @TableField("available_copies")
    private Integer availableCopies;

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
