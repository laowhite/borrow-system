package com.njn.book.controller;

import com.njn.student.common.core.resp.PageResult;
import com.njn.student.common.core.resp.R;
import com.njn.books.dto.BooksDTO;
import com.njn.book.service.BooksService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author timo
 * @since 2023-10-21
 */
@Api(tags = "图书信息")
@RestController
@RequestMapping("/books")
public class BooksController {

    @Resource
    private BooksService booksService;

    @ApiOperation("查询学生信息列表demo")
    @PostMapping("/list")
    public R<PageResult<BooksDTO>> list() {
        return R.success(booksService.list(new BooksDTO()));
    }

}
