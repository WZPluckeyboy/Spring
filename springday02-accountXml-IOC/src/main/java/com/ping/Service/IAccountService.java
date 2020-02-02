package com.ping.Service;

import com.ping.domain.account;

import java.util.List;

public interface IAccountService {
    List<account> findAll();
    account findAccountById(Integer accountId);
    void saveAccount(account account);
    void updateAccount(account account);
    void deleteAccount(Integer accountId);

}
