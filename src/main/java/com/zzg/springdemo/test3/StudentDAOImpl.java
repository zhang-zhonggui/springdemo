package com.zzg.springdemo.test3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Author: zzg
 * @Description: TODO
 * @DateTime: 2021/11/27 9:58
 */
@Component
public class StudentDAOImpl implements StudentDao{
    @Autowired
    private Student hehe;
    @Override
    public void say() {
        hehe.setName("aasass");
        System.out.println(hehe.getName());
    }
}
