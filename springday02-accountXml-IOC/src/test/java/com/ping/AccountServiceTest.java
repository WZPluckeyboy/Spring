package com.ping;

import com.ping.Service.IAccountService;
import com.ping.domain.account;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

//使用单元测试
public class AccountServiceTest {
    private IAccountService service;
    @Before
    public  void init(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
         service=context.getBean("accountService",IAccountService.class);
    }

    @Test
    public void findAll(){
        List<account> accounts=service.findAll();
        for(account as:accounts){
            System.out.println(as);
        }
    }
    @Test
    public void findOne(){
       account account=service.findAccountById(1);
        System.out.println(account);
    }
    @Test
    public void Save(){
        account account=new account();
        account.setId(2);
        account.setUid(4);
        account.setMoney(100.00);
     service.saveAccount(account);
    }
    @Test
    public void Update(){
        account account=new account();
        account.setId(2);
        account.setUid(4);
        account.setMoney(150.00);
        service.updateAccount(account);
    }
    @Test
    public void delete(){
     service.deleteAccount(2);
    }

}
