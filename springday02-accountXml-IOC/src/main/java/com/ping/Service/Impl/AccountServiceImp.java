package com.ping.Service.Impl;

import com.ping.Dao.IAccountDao;
import com.ping.Service.IAccountService;
import com.ping.domain.account;

import java.util.List;

public class AccountServiceImp implements IAccountService {
  private  IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<account> findAll() {
        return accountDao.findAll();
    }

    public account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    public void saveAccount(account account) {
       accountDao.saveAccount(account);
    }

    public void updateAccount(account account) {
       accountDao.updateAccount(account);
    }

    public void deleteAccount(Integer accountId) {
        accountDao.deleteAccount(accountId);
    }
}
