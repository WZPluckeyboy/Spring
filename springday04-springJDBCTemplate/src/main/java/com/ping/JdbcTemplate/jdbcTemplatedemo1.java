package com.ping.JdbcTemplate;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class jdbcTemplatedemo1 {
    public static void main(String[] args) {
        //准备数据源，spring 内置数据源
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/tt");
        ds.setUsername("root");
        ds.setPassword("wzp961208");
        //1.创建对象
        JdbcTemplate jt=new JdbcTemplate();
        //2.给jt设置数据源
        jt.setDataSource(ds);
        //3.执行操作
        jt.execute("insert  into account(id,uid,money) values (20,2,10000)");
    }
}
