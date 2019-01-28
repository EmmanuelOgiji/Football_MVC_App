package org.ECSDigital.EmmanuelOgiji.Servlets;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class HelloServlet extends HttpServlet{
    public void doGet (HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException{
        httpServletResponse.getWriter().print("Hello from Servlet");
    }
}
