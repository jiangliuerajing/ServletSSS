package com.wngc.servletsss.dao;

import com.wngc.servletsss.model.Manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

/**
 * Created by jing on 2017/9/29.
 */
public class OperateDao {
    DriverClass DriverClass =new DriverClass();
    Connection connection=null;
    Statement st=null;

    public void addDate(Manager manager){
        String sql="insert into manager values(?,?,?)";
        PreparedStatement ps=null;
        try{
            connection= DriverClass.getConnect();
            ps=connection.prepareStatement(sql);
            ps.setInt(1,manager.getManager_id());
            ps.setString(2,manager.getManager_name());
            ps.setString(3,manager.getPassword());
            int i=st.executeUpdate(sql);
            DriverClass.closeConnect();
        }catch(Exception E){}
    }

    public void deleteDate(int managerId){
        String sql="delete from manager where manager_id='managerId'";
        try{
            connection= DriverClass.getConnect();
            st=connection.createStatement();
            st.executeUpdate(sql);
            DriverClass.closeConnect();
        }catch(Exception E){}
    }

    public void updateDate(Manager manager){
        String sql="update manager set manager_name='manager.manager_name',password='manager.password' where manager_id='manager.manager_id";
        try{
            connection= DriverClass.getConnect();
            st=connection.createStatement();
            st.executeUpdate(sql);
        }catch(Exception E){}

    }

    public List<Manager> queryDate() throws Exception{
        String sql="select * from manager";

        connection= DriverClass.getConnect();
        st=connection.createStatement();
        ResultSet rs=st.executeQuery(sql);
        List<Manager> managers=new ArrayList<Manager>();
        Manager manager=new Manager();
        while(rs.next()){
            int id=rs.getInt("manager_id");
            String name=rs.getString("manager_name");
            String psw=rs.getString("password");
            manager.setManager_id(id);
            manager.setManager_name(name);
            manager.setPassword(psw);
            managers.add(manager);
        }
        DriverClass.closeConnect();
        return managers;
    }
}
