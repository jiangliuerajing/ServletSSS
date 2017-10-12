package servletsss.Dao;

import servletsss.model.Manager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

/**
 * Created by jing on 2017/9/29.
 */
public class operateDao {
    servletsss.Dao.driverClass driverClass=new servletsss.Dao.driverClass();
    Connection connection=null;
    Statement st=null;

    public void addDate(Manager manager){
        String sql="insert into manager(manager_name,password) values(manager.manager_name,manager.;password)";
        try{
            connection=driverClass.getConnect();
            st=connection.createStatement();
            int i=st.executeUpdate(sql);
            driverClass.closeConnect();
        }catch(Exception E){}
    }

    public void deletDate(int managerId){
        String sql="delete from manager where manager_id='managerId'";
        try{
            connection=driverClass.getConnect();
            st=connection.createStatement();
            st.executeUpdate(sql);
            driverClass.closeConnect();
        }catch(Exception E){}
    }

    public void updateDate(Manager manager){
        String sql="update manager set manager_name='manager.manager_name',password='manager.password' where manager_id='manager.manager_id";
        try{
            connection=driverClass.getConnect();
            st=connection.createStatement();
            st.executeUpdate(sql);
        }catch(Exception E){}

    }

    public List<Manager> queryDate() throws Exception{
        String sql="select * from manager";

        connection=driverClass.getConnect();
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
        driverClass.closeConnect();
        return managers;
    }
}
