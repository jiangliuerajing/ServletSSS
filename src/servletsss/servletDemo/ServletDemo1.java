package servletsss.servletDemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jing on 2017/9/29.
 */
@WebServlet(name = "ServletDemo1")
public class ServletDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        response.setContentType("text/html;charset=gbk");

        response.getWriter().print("<html>");
        response.getWriter().print("<head>");
        response.getWriter().print("ur="+username);
        response.getWriter().print("</head>");
        response.getWriter().print("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}

