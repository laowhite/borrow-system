package com.njn.books.client;

import com.njn.student.common.core.constant.ServiceNameConstants;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(path = "/books", value = ServiceNameConstants.BOOK_SERVICE)
public interface BooksClient {

}
