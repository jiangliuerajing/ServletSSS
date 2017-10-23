package com.wngc.servletsss.servletdemo;

import com.wngc.servletsss.model.Manager;
import com.wngc.servletsss.dao.OperateDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by jing on 2017/10/9.
 */
@WebServlet(name = "Query")
public class Query extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        OperateDao dao=new OperateDao();
        try {
            List<Manager> managers=dao.queryDate();
            request.setAttribute("list",managers);
            response.getWriter().print("<html>");
            response.getWriter().print("<head>");
            response.getWriter().print(managers.get(0).getManager_name());
            response.getWriter().print("</head>");
            response.getWriter().print("</html>");
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.sendRedirect("one.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
