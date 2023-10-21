package com.njn.student.service;

import com.njn.student.common.core.resp.PageResult;
import com.njn.student.dto.StudentDTO;
import com.njn.student.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author timo
 * @since 2023-10-21
 */
public interface StudentService extends IService<Student> {

    PageResult<StudentDTO> list(StudentDTO student);

}
