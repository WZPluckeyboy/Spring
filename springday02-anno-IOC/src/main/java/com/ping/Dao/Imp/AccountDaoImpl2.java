package com.ping.Dao.Imp;

import com.ping.Dao.IAccountDao;
import org.springframework.stereotype.Repository;

@Repository("acconutDao2")
public class AccountDaoImpl2 implements IAccountDao {
    public void saveAccount() {
        System.out.println("-----------");
    }
}
