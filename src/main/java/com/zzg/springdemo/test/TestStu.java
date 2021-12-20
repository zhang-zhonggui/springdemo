package com.zzg.springdemo.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.testng.annotations.Test;

/**
 * @Author: zzg
 * @Description: Spring框架的测速
 * @DateTime: 2021/11/27 9:58
 */
public class TestStu {
    @Test
    public void test1() {
        Student stu = new Student();
        stu.name();
    }
    @Test
    public void test2() {
        Resource resource = new ClassPathResource("spring.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Student bean = (Student) factory.getBean("stu");
        bean.name();
    }
    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student stu = (Student) context.getBean("stu");
        stu.name();
    }
}
