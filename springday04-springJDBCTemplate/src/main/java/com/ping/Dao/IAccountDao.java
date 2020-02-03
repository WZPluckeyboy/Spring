package com.ping.Dao;

import com.ping.domain.Account;

public interface IAccountDao {
    Account findAccountById(Integer id);
    Account fndAccountByUid(Integer uid);
     void updateAccount(Account account);
}
