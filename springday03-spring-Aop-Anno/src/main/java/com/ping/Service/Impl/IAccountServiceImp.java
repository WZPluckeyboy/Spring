package com.ping.Service.Impl;

import com.ping.Service.IAccountService;
import org.springframework.stereotype.Service;

@Service("accountService")
public class IAccountServiceImp implements IAccountService {
    public void saveAccount() {
        System.out.println("执行保存");
    }

    public void upDateAccount(int i) {
        System.out.println("执行更新");
    }

    public int deleteAccount() {
       System.out.println("执行删除");
        return 0;
    }
}
