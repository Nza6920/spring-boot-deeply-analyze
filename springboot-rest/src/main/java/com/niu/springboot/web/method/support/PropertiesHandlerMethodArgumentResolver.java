package com.niu.springboot.web.method.support;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Properties;

/**
 * @Description: PropertiesHandlerMethodArgumentResolver
 * @Author nza
 * @Date 2020/1/22
 **/
public class PropertiesHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return Properties.class.equals(parameter.getParameterType());
    }

    @Override
    public Object resolveArgument(MethodParameter parameter,
                                  ModelAndViewContainer modelAndViewContainer,
                                  NativeWebRequest webRequest,
                                  WebDataBinderFactory webDataBinderFactory) throws Exception {

        ServletWebRequest servletWebRequest = (ServletWebRequest) webRequest;
        HttpServletRequest request = servletWebRequest.getRequest();

        // 获取字符集
        String contentType = request.getHeader("Content-Type");
        MediaType mediaType = MediaType.parseMediaType(contentType);
        Charset charset = mediaType.getCharset();
        charset = charset == null ? Charset.forName("UTF-8") : charset;

        // 请求输入字节流
        InputStream inputStream = request.getInputStream();
        // 转换为字符流
        InputStreamReader reader = new InputStreamReader(inputStream, charset);

        // 加载字符流成为 properties 对象
        Properties properties = new Properties();
        properties.load(reader);

        return properties;
    }
}
