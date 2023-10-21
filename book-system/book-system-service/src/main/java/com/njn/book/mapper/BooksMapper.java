package com.njn.book.mapper;

import com.njn.book.entity.Books;
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
public interface BooksMapper extends BaseMapper<Books> {

}
