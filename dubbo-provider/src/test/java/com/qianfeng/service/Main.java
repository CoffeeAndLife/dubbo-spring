package com.qianfeng.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author huangguizhao
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"classpath:dubbo-provider.xml"});
        context.start();

        //输入键盘任意键，退出
        System.in.read();
    }
}
