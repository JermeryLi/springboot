package com.lining.springboot.ioc.beanAnnotation;

import lombok.Data;

/**
 * @author lining
 * @date 2019/7/19
 * @description User
 */
@Data
public class User {
    private Long id;
    private String userName;
    private String note;
}
