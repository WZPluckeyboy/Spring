package com.ping.Service.impl;

import com.ping.Service.IAccountService;

import java.util.Date;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

    private String name;
    private Integer age;
    private Date birthday;
    public AccountServiceImpl(String name,Integer age,Date birthday){
        this.name=name;
        this.age=age;
        this.birthday=birthday;
    }


    public void saveAccount() {
        System.out.println("方法执行了"+name+","+age+","+birthday);

    }
}
