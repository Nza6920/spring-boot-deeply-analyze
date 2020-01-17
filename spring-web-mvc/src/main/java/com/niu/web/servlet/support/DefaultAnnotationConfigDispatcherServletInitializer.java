package com.niu.web.servlet.support;

import com.niu.web.config.DispatcherServletConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Description: Spring mvc 自动装配默认实现
 * @Author nza
 * @Date 2020/1/17
 **/
public class DefaultAnnotationConfigDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {  // web.xml
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {  // DispatcherServlet
        return new Class[] {DispatcherServletConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
