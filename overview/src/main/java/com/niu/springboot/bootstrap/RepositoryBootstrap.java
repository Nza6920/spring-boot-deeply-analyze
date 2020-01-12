package com.niu.springboot.bootstrap;

import com.niu.springboot.repository.MyFirstRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description: 手动装配
 * @Author nza
 * @Date 2020/1/11
 **/
// 扫描指定包
@ComponentScan(basePackages = "com.niu.springboot.repository")
public class RepositoryBootstrap {

    public static void main(String[] args) {
        // 开启上下文, 排除web容器
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootstrap.class)
                                                    .web(WebApplicationType.NONE)
                                                    .run(args);

        // 从容器中获取 myFirstRepository
        MyFirstRepository myFirstRepository = context.getBean("myFirstRepository", MyFirstRepository.class);
        System.out.println(myFirstRepository);

        // 关闭上下文
        context.close();
    }
}
