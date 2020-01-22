package com.niu.springboot.web.config;

import com.niu.springboot.web.http.converter.properties.PropertiesHttpMessageConverter;
import com.niu.springboot.web.method.support.PropertiesHandlerMethodArgumentResolver;
import com.niu.springboot.web.method.support.PropertiesHandlerMethodReturnValueHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: RestWebMvcConfigurer
 * @Author nza
 * @Date 2020/1/22
 **/
@Configuration
public class RestWebMvcConfigurer implements WebMvcConfigurer {

    @Autowired
    private RequestMappingHandlerAdapter requestMappingHandlerAdapter;

    @PostConstruct
    public void init() {
        // 获取当前所有的 resolves 对象
        List<HandlerMethodArgumentResolver> argumentResolvers = requestMappingHandlerAdapter.getArgumentResolvers();
        ArrayList<HandlerMethodArgumentResolver> newResolvers = new ArrayList<>(argumentResolvers.size() + 1);
        // 设置自己的 resolvers 集合
        newResolvers.add(new PropertiesHandlerMethodArgumentResolver());
        // 添加已注册的 Resolver 对象集合
        newResolvers.addAll(argumentResolvers);
        // 重新设置 resolvers 集合
        requestMappingHandlerAdapter.setArgumentResolvers(newResolvers);


        // 获取所有 返回值处理器
        List<HandlerMethodReturnValueHandler> handlers = requestMappingHandlerAdapter.getReturnValueHandlers();
        List<HandlerMethodReturnValueHandler> newHandlers = new ArrayList<>(handlers.size() + 1);
        // 添加自己的处理器
        newHandlers.add(new PropertiesHandlerMethodReturnValueHandler());
        // 添加已注册的 handlers 对象集合
        newHandlers.addAll(handlers);
        // 重新设置 handlers 集合
        requestMappingHandlerAdapter.setReturnValueHandlers(newHandlers);
    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        // 不建议添加到 converters 末尾
//        converters.add(0, new PropertiesHttpMessageConverter());
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 设置允许的请求域名
//        registry.addMapping("/*").allowedOrigins("*");
    }
}
