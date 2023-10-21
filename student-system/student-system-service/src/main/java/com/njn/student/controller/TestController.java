package com.njn.student.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "测试类", value = "测试类")
@RestController
public class TestController {

    @ApiOperation(value = "测试接口")
    @GetMapping("/test")
    public String test() {
        return "test";
    }


}
