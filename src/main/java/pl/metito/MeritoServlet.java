package pl.metito;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/hello-student")
public class MeritoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int number = Integer.parseInt(request.getParameter("number"));

        int result = number * 2;
        request.setAttribute("result", result);

        getServletContext().getRequestDispatcher("/student.jsp")
                .forward(request, response);
    }


}
