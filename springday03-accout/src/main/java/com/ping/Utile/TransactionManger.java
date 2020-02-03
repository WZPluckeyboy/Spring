package com.ping.Utile;

import java.sql.SQLException;

public class TransactionManger {
    private  ConnectionUtile connectionUtile;

    public void setConnectionUtile(ConnectionUtile connectionUtile) {
        this.connectionUtile = connectionUtile;
    }
    public  void beginTran(){
        try {
            connectionUtile.getThreadConnection().setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public  void commitTran(){
        try {
            connectionUtile.getThreadConnection().commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public  void RollBackTran() throws SQLException {
    connectionUtile.getThreadConnection().rollback();
    }
    public void CloseTran() throws SQLException {
    connectionUtile.getThreadConnection().close();
    connectionUtile.removeConnection();
    }

}
