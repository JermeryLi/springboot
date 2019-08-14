package com.lining.springboot.ioc.componentAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lining
 * @date 2019/7/19
 * @description AppConfig
 */
@Configuration
@ComponentScan
public class AppConfig2 {
}

/**
 * @ComponentScan 意味这他会进行扫描，但是它只会扫描类AppConfig所在的当前包和其子包
 */
