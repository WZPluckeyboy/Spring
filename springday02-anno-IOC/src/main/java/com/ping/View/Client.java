package com.ping.View;

import com.ping.Dao.IAccountDao;
import com.ping.Service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {
    public static void main(String[] args) {
       //1.获取容器
        ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
        IAccountService as=  context.getBean("accountService",IAccountService.class);
        System.out.println(as);
        IAccountDao dao=context.getBean("acconutDao",IAccountDao.class);
        System.out.println(dao);
        as.saveAccount();
    }
}
