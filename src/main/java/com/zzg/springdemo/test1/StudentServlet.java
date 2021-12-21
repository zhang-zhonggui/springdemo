package com.zzg.springdemo.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: zzg
 * @Description: TODO
 * @DateTime: 2021/11/27 9:58
 */
@Component
public class StudentServlet {

    @Autowired
    private StudentDao stu;

    public void test() {
        stu.test();
    }
}
