package com.zzg.springdemo.test1;

import com.zzg.springdemo.test.Student;
import org.springframework.stereotype.Component;

/**
 * @Author: zzg
 * @Description: TODO
 * @DateTime: 2021/11/27 9:58
 */
@Component
public class StudentDaoImpl implements StudentDao {
    @Override
    public void test() {
        System.out.println("权威的行啊下是否v额我发");
    }
}
