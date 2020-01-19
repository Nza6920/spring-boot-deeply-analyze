package com.niu.springboot.web.template.engine;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


/**
 * @Description: 模板引擎引导类
 * @Author nza
 * @Date 2020/1/19
 **/
@SpringBootApplication
public class ThymeleafTemplateEngineBootstrap {

    public static void main(String[] args) throws IOException {

        // 构建引擎
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();

        // 创建渲染上下文
        Context context = new Context();
        context.setVariable("message", "Hello, World");

        // 读取资源文件 classpath: templates/thymeleaf/hello-world.html
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        // 通过 classpath 获取资源
        Resource resource = resourceLoader.getResource("classpath:/templates/thymeleaf/hello-world.html");
        File templateFile = resource.getFile();
        // 文件流
        FileInputStream inputStream = new FileInputStream(templateFile);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        // copy
        IOUtils.copy(inputStream, outputStream);
        inputStream.close();

        // 模板内容
        String content = outputStream.toString("UTF-8");

        // 渲染处理结果
        String result = templateEngine.process(content, context);

        // 输出处理结果
        System.out.println(result);
    }
}
