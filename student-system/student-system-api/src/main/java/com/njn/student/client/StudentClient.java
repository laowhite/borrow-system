package com.njn.student.client;

import com.njn.student.common.core.constant.ServiceNameConstants;
import com.njn.student.common.core.resp.PageResult;
import com.njn.student.common.core.resp.R;
import com.njn.student.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(path = "/student", value = ServiceNameConstants.STUDENT_SERVICE)
public interface StudentClient {

    @PostMapping("/list")
    R<PageResult<StudentDTO>> list();

}
