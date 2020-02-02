package com.ping.Dao.Imp;

import com.ping.Dao.IAccountDao;
import com.ping.domain.account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("accountDao")
public class AccountDaoImp implements IAccountDao {
    @Autowired
    private QueryRunner runner;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    public List<account> findAll() {
        try{
            return runner.query("select * from account",new BeanListHandler<account>(account.class));
        }catch (Exception e){
           throw new RuntimeException(e);
        }
    }

    public account findAccountById(Integer accountId) {
        try {
            return runner.query("select * from account where id=?",
                    new BeanHandler<account>(account.class), accountId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void saveAccount(account account) {
            try{
                runner.update("insert into account(id,uid,money) values(?,?,?)"
                        ,account.getId(),account.getUid(),account.getMoney());
            }catch (Exception e){
                throw new RuntimeException(e);
            }
    }

    public void updateAccount(account account) {
        try{
            runner.update("update account  set id=?,uid=?,money=?"
                    ,account.getId(),account.getUid(),account.getMoney());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public void deleteAccount(Integer accountId) {
        try{
            runner.update("delete from account where id=?"
                    ,accountId);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
