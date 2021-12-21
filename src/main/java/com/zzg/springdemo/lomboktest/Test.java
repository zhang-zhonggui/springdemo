package com.zzg.springdemo.lomboktest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zzg
 * @Description: TODO
 * @DateTime: 2021/11/27 9:58
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student stu = context.getBean(Student.class);
        stu.setName("asd");
        stu.setId(1);
        System.out.println(stu);
    }
}
