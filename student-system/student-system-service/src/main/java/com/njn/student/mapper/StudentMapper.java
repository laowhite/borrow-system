package com.njn.student.mapper;

import com.njn.student.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author timo
 * @since 2023-10-21
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}
