package com.lining.springboot.ioc.beanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lining
 * @date 2019/7/19
 * @description AppConfig
 * @comment @configuration 代表这是一个配置文件。Spring容器会根据它来生成Ioc容器来装配Bean。
 *    @Bean 代表经initUser()方法返回的POJO装配到Ioc容器中，而其属性name定义这个Bean的名称。
 *    如果没有配置这个name，则将方法名称"initUser"作为Bean的名称保存到Spring IoC容器中。
 *    注解@Bean不是唯一创建Bean的方法，还有其他的方法可以让Ioc来装配Bean,而且Bean之间还有依赖的关系
 *    需要进一步处理。
 */
@Configuration
public class AppConfig {
    @Bean(name = "user")
    public User initUser(){
        User user = new User();
        user.setId(1L);
        user.setUserName("user_name_1");
        user.setNote("note_1");
        return user;
    }
}
