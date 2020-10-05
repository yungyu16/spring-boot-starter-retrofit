package com.github.yungyu16.spring.retrofit.converter;

import com.alibaba.fastjson.JSON;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Type;

/**
 * @author Yungyu
 * @description Created by Yungyu on 2020/9/26.
 */
public class DefaultRequestConverter implements RequestConverter {

    @Override
    public RequestBody toRequestBody(@NotNull Object entity, Type type) {
        return buildRequestBody(JSON.toJSONBytes(entity));
    }
}