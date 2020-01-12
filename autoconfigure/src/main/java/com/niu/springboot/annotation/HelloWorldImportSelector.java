package com.niu.springboot.annotation;

import com.niu.springboot.configuration.HelloWorldConfiguration;
import com.niu.springboot.configuration.HelloWorldConfiguration2;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Description: TODO
 * @Author nza
 * @Date 2020/1/11
 **/
public class HelloWorldImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{HelloWorldConfiguration.class.getName(), HelloWorldConfiguration2.class.getName()};
    }
}
