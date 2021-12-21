package com.zzg.springdemo.test3;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Author: zzg
 * @Description: TODO
 * @DateTime: 2021/11/27 9:58
 */

@Data
@Component("hehe")
public class Student {
    private String name;
    private int age;
    private String address;
}
