package com.lining.springboot.ioc.componentAnnotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author lining
 * @date 2019/7/19
 * @description User
 */
@Component("user2")
@Data
public class User {
    @Value("1")
    private Long id;
    @Value("user_name_componentAnnotation")
    private String userName;
    @Value("note_1")
    private String note;
}
/**
 * @Component 表明这个类将被SpringIoc容器扫描装配
 * "user"作为Bean的名称，若不配置这个字符串，那么Ioc容器就会把类名的第一个字母小写，
 * 其他不变作为Bean的名称放到IoC容器中。
 *
 * @Value 指定具体的值。使得SpringIoc给与对应的属性注入对应的值。
 * 为了让SpringIoc容器装配这个类，需要改造类AppConfig。
 */
