package com.wngc.servletsss.servletdemo;

import com.wngc.servletsss.model.Manager;
import com.wngc.servletsss.dao.OperateDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jing on 2017/10/9.
 */
@WebServlet(name = "Add")
public class Add extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String managerName=request.getParameter("managername");
        String managerPsw=request.getParameter("password");
        OperateDao dao=new OperateDao();
        Manager manager=new Manager();

        manager.setManager_name(managerName);
        manager.setPassword(managerPsw);
        dao.addDate(manager);

        response.sendRedirect("success.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
