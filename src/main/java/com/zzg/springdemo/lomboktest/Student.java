package com.zzg.springdemo.lomboktest;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Author: zzg
 * @Description: TODO
 * @DateTime: 2021/11/27 9:58
 */
@Data
@Component
public class Student {
    private int id;
    private String name;
}
