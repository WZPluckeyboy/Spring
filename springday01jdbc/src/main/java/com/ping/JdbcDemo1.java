package com.ping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcDemo1  {
    public static void main(String[] args) throws Exception {
        //1.注册驱动
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //2.获取连接
        Connection connection=DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/tt","root","wzp961208");
        //3.获取执行操作与处理对象
        PreparedStatement pstm=connection.prepareStatement("select * from account");
        //4.执行SQL，得到结果集
        ResultSet rs=pstm.executeQuery();
        //5.遍历结果集
        while(rs.next()){
            System.out.println(rs.getString("id"));
        }
        //6.释放资源
        rs.close();
        pstm.close();
        connection.close();
    }
}
