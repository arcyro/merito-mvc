package pl.metito;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Hello world");
        response.getWriter().append("<h1>Hello from Servlet</h1>");
    }

    private void  doSth(){
        System.out.println("asdasd");
    }


}