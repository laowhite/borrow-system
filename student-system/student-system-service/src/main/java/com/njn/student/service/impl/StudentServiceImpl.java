package com.njn.student.service.impl;

import com.njn.student.common.core.resp.PageResult;
import com.njn.student.common.core.utils.BeanCopyUtils;
import com.njn.student.dto.StudentDTO;
import com.njn.student.entity.Student;
import com.njn.student.mapper.StudentMapper;
import com.njn.student.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author timo
 * @since 2023-10-21
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    /**
     * 查询学生信息demo
     */
    @Override
    public PageResult<StudentDTO> list(StudentDTO student) {
        List<Student> list = super.list();
        return new PageResult<>((long) list.size(), BeanCopyUtils.copyList(list, StudentDTO.class));
    }
}
