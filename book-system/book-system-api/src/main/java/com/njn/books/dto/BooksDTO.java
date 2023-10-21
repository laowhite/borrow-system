package com.njn.books.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@ApiModel("图书信息返回值")
public class BooksDTO {


    @ApiModelProperty("图书ID")
    private Long id;

    @ApiModelProperty("书名")
    private String title;

    @ApiModelProperty("作者")
    private String author;

    @ApiModelProperty("ISBN号")
    private String isbn;

    @ApiModelProperty("出版商")
    private String publisher;

    @ApiModelProperty("出版年份")
    private Integer publicationYear;

    @ApiModelProperty("类别")
    private String category;

    @ApiModelProperty("副本数量")
    private Integer numberOfCopies;

    @ApiModelProperty("在架数量")
    private Integer availableCopies;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("创建时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("删除标记:1-删除,0-未删除")
    private Boolean deleted;


}
