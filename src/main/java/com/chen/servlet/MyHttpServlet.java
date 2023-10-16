package com.chen.servlet;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author : CHEN JINJIN
 * @create : 2023/10/9 15:37
 * @desc :  重写HttpServlet
 */
public class MyHttpServlet implements Servlet {

    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        //获取请求方式
        String method = request.getMethod();
        if (method.equals("GET")) {
            doGet(servletRequest, servletResponse);
        }else if (method.equals("POST")) {
            doPost(servletRequest, servletResponse);
        }
    }

    protected void doGet(ServletRequest req, ServletResponse res){
//        System.out.println("执行doGet");
    }

    protected void doPost(ServletRequest req, ServletResponse res){
//        System.out.println("执行POST");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
