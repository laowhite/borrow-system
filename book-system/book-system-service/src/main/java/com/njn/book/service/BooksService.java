package com.njn.book.service;

import com.njn.book.entity.Books;
import com.njn.student.common.core.resp.PageResult;
import com.njn.books.dto.BooksDTO;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author timo
 * @since 2023-10-21
 */
public interface BooksService extends IService<Books> {

    PageResult<BooksDTO> list(BooksDTO booksDTO);

}
