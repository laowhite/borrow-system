package com.njn.client;

import com.njn.common.core.constant.ServiceNameConstants;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(path = "/student", value = ServiceNameConstants.STUDENT_SERVICE)
public interface StudentClient {


}
