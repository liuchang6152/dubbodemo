package com.liuchang;

import com.liuchang.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ Author     ：liuchang
 * @ Date       ：Created in 13:35 2020/2/22
 * @ Description：
 * @ Modified By：
 */
public class HelloController {
    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:dubbo-consumer.xml"});
        context.start();
        HelloService helloService = context.getBean(HelloService.class);
        System.out.println(helloService.sayHello("liuchang"));
    }
}
