package servletsss.servletDemo;

import servletsss.Dao.operateDao;
import servletsss.model.Manager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jing on 2017/10/9.
 */
@WebServlet(name = "update")
public class update extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String managerName=request.getParameter("managername");
        int managerid=Integer.parseInt(request.getParameter("managerid"));
        String managerpsw=request.getParameter("password");

        Manager manager=new Manager();
        manager.setManager_id(managerid);
        manager.setManager_name(managerName);
        manager.setPassword(managerpsw);

        operateDao dao=new operateDao();
        dao.updateDate(manager);

        response.sendRedirect("success.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
