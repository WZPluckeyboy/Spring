package com.ping.JdbcTemplate;

import com.ping.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class jdbcTemplatedemo2 {
    public static void main(String[] args) {
       //1.获取
        ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
        JdbcTemplate jt=context.getBean("jdbcTemp",JdbcTemplate.class);
        //执行操作
        //保存操作
        jt.update("insert  into account(id,uid,money) values (?,?,?)",1,2,3000);
        //删除操作
        jt.update("delete  from account where id=?",2);
        //更新操作
        jt.update("update account set uid=?,money=? where id=?",4,500,9);
        //查询操作
         List<Account>accounts= jt.query("select * from account where money=?",new BeanPropertyRowMapper<Account>(Account.class),10000 );

    }

}
