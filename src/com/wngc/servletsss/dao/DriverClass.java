package com.wngc.servletsss.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by jing on 2017/9/29.
 */
public class DriverClass {
    public static final String url="jdbc:mysql://localhost/manager";
    public static final String driverName="com.mysql.jdbc.Driver";
    public static final String user="root";
    public static final String password="root";

    public Connection con=null;

    static{
        try {
            Class.forName(driverName);
        }catch (Exception E){}
    }

    public Connection getConnect(){
        try {
            con = DriverManager.getConnection(url, user, password);
        }catch(SQLException E){
            E.printStackTrace();
        }
        return con;
    }

    public void closeConnect(){
        try {
            if(con!=null)
                con.close();
        }catch(Exception E){}
    }
}
