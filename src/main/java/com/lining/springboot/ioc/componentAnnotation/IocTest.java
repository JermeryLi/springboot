package com.lining.springboot.ioc.componentAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lining
 * @date 2019/7/19
 * @description IocTest
 */
public class IocTest {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(User.class);
        User user2 = ctx.getBean(User.class);
        System.out.println(user2.getUserName());
    }
}
