package com.github.yungyu16.spring.retrofit.converter;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.springframework.util.MimeTypeUtils;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * @author Yungyu
 * @description Created by Yungyu on 2020/9/26.
 */
public interface RequestConverter {
    MediaType CONTENT_TYPE_TEXT = MediaType.get(MimeTypeUtils.TEXT_PLAIN_VALUE);

    RequestBody toRequestBody(@NotNull Object entity, Type type) throws IOException;

    default RequestBody buildRequestBody(String payload) {
        return RequestBody.create(payload, CONTENT_TYPE_TEXT);
    }
}
