package com.njn.book.service.impl;

import com.njn.student.client.StudentClient;
import com.njn.student.common.core.resp.PageResult;
import com.njn.student.common.core.resp.R;
import com.njn.student.common.core.utils.BeanCopyUtils;
import com.njn.books.dto.BooksDTO;
import com.njn.student.dto.StudentDTO;
import com.njn.book.entity.Books;
import com.njn.book.mapper.BooksMapper;
import com.njn.book.service.BooksService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author timo
 * @since 2023-10-21
 */
@Slf4j
@Service
public class BooksServiceImpl extends ServiceImpl<BooksMapper, Books> implements BooksService {

    @Resource
    private BooksMapper booksMapper;

    @Resource
    private StudentClient studentClient;

    @Override
    public PageResult<BooksDTO> list(BooksDTO booksDTO) {
        List<Books> list = super.list();
        R<PageResult<StudentDTO>> pageResultR = studentClient.list();
        PageResult<StudentDTO> data = pageResultR.getData();
        log.info("Student：{}", data);
        return new PageResult<>((long) list.size(), BeanCopyUtils.copyList(list, BooksDTO.class));
    }

}
