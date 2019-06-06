package com.qianfeng;

import com.qianfeng.api.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author huangguizhao
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        context.start();

        //如何调用远程服务
        IUserService userService = context.getBean(IUserService.class);
        System.out.println(userService.hello());

        System.in.read();
    }
}
