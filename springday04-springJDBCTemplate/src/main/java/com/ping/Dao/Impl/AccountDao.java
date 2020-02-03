package com.ping.Dao.Impl;

import com.ping.Dao.IAccountDao;
import com.ping.domain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AccountDao implements IAccountDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Account findAccountById(Integer id) {
        List<Account> accounts=jdbcTemplate.query("select * from account where id=? ",
                new BeanPropertyRowMapper<Account>(Account.class),id);
        return accounts.isEmpty()?null:accounts.get(0);
    }

    public Account fndAccountByUid(Integer uid) {
        List<Account> accounts=jdbcTemplate.query("select * from account where uid=? ",
                new BeanPropertyRowMapper<Account>(Account.class),uid);
        return accounts.isEmpty()?null:accounts.get(0);
    }

    public void updateAccount(Account account) {
       jdbcTemplate.update("update acoount set id=?, uid=?,money=?",
               account.getId(),account.getUid(),account.getMoney());
    }
}
