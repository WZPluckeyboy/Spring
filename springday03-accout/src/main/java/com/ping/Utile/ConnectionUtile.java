package com.ping.Utile;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtile {
    private  ThreadLocal<Connection> tl=new ThreadLocal<Connection>();
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Connection getThreadConnection(){
        Connection coon=tl.get();
        if(coon==null){
            try {
                coon=dataSource.getConnection();
                tl.set(coon);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return  coon;
    }

    public void removeConnection(){
      tl.remove();
    }
}
