package com.niu.springboot.bootstrap;

import com.niu.springboot.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Description: 条件装配
 * @Author nza
 * @Date 2020/1/11
 **/
@SpringBootApplication(scanBasePackages = "com.niu.springboot.service")
public class CalculateServiceBootstrap {

    public static void main(String[] args) {
        // 开启上下文, 排除web容器
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                                                .web(WebApplicationType.NONE)
                                                .profiles("Java8")
                                                .run(args);


        CalculateService calculateService = context.getBean(CalculateService.class);

        System.out.println("sum(1...10):" + calculateService.sum(1,2,3,4,5,6,7,8,9,10));

        // 关闭上下文
        context.close();
    }
}
