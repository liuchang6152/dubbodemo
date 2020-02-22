package com.liuchang.serviceImpl;

import com.liuchang.service.HelloService;

/**
 * @ Author     ：liuchang
 * @ Date       ：Created in 13:08 2020/2/22
 * @ Description：
 * @ Modified By：
 */
public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
        return "hello"+name;
    }
}
