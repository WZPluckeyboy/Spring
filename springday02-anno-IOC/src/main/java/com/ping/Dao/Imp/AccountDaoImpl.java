package com.ping.Dao.Imp;

import com.ping.Dao.IAccountDao;
import org.springframework.stereotype.Repository;

@Repository("acconutDao")
public class AccountDaoImpl implements IAccountDao {
    public void saveAccount() {
        System.out.println("-----------");
    }
}
