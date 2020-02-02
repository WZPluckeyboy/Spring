package com.ping.View;

import com.ping.Service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {
    public static void main(String[] args) {
       //1.获取容器
        ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
        IAccountService as=  context.getBean("accountService",IAccountService.class);
        System.out.println(as);
       as.saveAccount();
    }
}
