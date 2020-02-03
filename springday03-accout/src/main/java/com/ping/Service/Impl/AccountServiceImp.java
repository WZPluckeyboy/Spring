package com.ping.Service.Impl;

import com.ping.Dao.IAccountDao;
import com.ping.Service.IAccountService;
import com.ping.Utile.TransactionManger;
import com.ping.domain.account;

import java.sql.SQLException;
import java.util.List;

public class AccountServiceImp implements IAccountService {
    private IAccountDao accountDao;
    private TransactionManger tran;

    public void setTran(TransactionManger tran) {
        this.tran = tran;
    }

    public void setAccountDao(IAccountDao accountDao) {

        this.accountDao = accountDao;
    }

    public List<account> findAll() {
        List<account> accounts = null;
        try {
            tran.beginTran();
            accounts = accountDao.findAll();
            tran.commitTran();

            return accounts;
        } catch (Exception e) {
            try {
                tran.RollBackTran();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                tran.CloseTran();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return accounts;
    }

    public account findAccountById(Integer accountId) {
        account account = null;
        try {
            tran.beginTran();
            account = accountDao.findAccountById(accountId);
            tran.commitTran();

            return account;
        } catch (Exception e) {
            try {
                tran.RollBackTran();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                tran.CloseTran();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return account;
    }

    public void saveAccount(account account) {
        try {
            accountDao.saveAccount(account);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

    }

    public void updateAccount(account account) {
        try {
            tran.beginTran();
            accountDao.updateAccount(account);
            tran.commitTran();
        } catch (Exception e) {
            try {
                tran.RollBackTran();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                tran.CloseTran();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public void deleteAccount(Integer accountId) {
        try {
            tran.beginTran();
            accountDao.deleteAccount(accountId);
            tran.commitTran();
        } catch (Exception e) {
            try {
                tran.RollBackTran();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                tran.CloseTran();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void transfer(Integer sourceUid, Integer targeUid, Float money) {
        try {

            tran.beginTran();
            //1.根据名称查询转出账户
            account source = accountDao.findAccountByUid(sourceUid);

            //2.根据名称查转入账户
            account target = accountDao.findAccountByUid(targeUid);

            //3.转出账户减钱
            source.setMoney(source.getMoney() - money);
            //4.转入账户加钱
            target.setMoney(target.getMoney() + money);
            //5.更新转出账户
            accountDao.updateAccount(source);
            //6.更新转入账户
            accountDao.updateAccount(target);

            tran.commitTran();
        } catch (Exception e) {
            try {
                tran.RollBackTran();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                tran.CloseTran();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
