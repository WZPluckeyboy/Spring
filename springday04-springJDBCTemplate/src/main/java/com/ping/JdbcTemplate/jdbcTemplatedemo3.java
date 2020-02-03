package com.ping.JdbcTemplate;

import com.ping.Dao.IAccountDao;
import com.ping.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class jdbcTemplatedemo3 {
    public static void main(String[] args) {
       //1.获取
        ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
        IAccountDao accountDao=context.getBean("accountDao",IAccountDao.class);
       Account account= accountDao.findAccountById(2);

    }

}
