package com.njn.student.controller;

import com.njn.student.common.core.resp.PageResult;
import com.njn.student.common.core.resp.R;
import com.njn.student.dto.StudentDTO;
import com.njn.student.service.StudentService;
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
@Api(tags = "学生信息控制器")
@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @ApiOperation("查询学生信息列表demo")
    @PostMapping("/list")
    public R<PageResult<StudentDTO>> list() {
        return R.success(studentService.list(new StudentDTO()));
    }

}
