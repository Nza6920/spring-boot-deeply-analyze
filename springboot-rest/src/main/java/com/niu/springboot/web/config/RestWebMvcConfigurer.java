package com.niu.springboot.web.config;

import com.niu.springboot.web.http.converter.properties.PropertiesHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @Description: RestWebMvcConfigurer
 * @Author nza
 * @Date 2020/1/22
 **/
@Configuration
public class RestWebMvcConfigurer implements WebMvcConfigurer {
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        // 不建议添加道 converters 末尾
        converters.add(0, new PropertiesHttpMessageConverter());
    }
}
