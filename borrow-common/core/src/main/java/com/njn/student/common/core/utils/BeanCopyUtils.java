package com.njn.student.common.core.utils;


import org.modelmapper.ModelMapper;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BeanCopyUtils {

    private static ModelMapper modelMapper = new ModelMapper();

    public static <D, S> List<D> copyList(List<S> source, Class<D> componentType) {
        if (CollectionUtils.isEmpty(source)) {
            return Collections.emptyList();
        }
        List<D> list = new ArrayList<>();
        for (Object obj : source) {
            list.add(modelMapper.map(obj, componentType));
        }
        return list;
    }

    public static <D> D copyObject(Object source, Class<D> destinationType) {
        return source == null ? null : modelMapper.map(source, destinationType);
    }

}
