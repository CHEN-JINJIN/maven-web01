package com.chen.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author : CHEN JINJIN
 * @create : 2023/10/9 14:15
 * @desc :  Servlet
 */

@WebServlet("/servlet-demo1")
public class ServletDemo1 implements Servlet {

    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello Servlet!");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
