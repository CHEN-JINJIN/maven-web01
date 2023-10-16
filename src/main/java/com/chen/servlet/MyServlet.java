package com.chen.servlet;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * @author : CHEN JINJIN
 * @create : 2023/10/9 15:56
 * @desc :
 */

/**
 * urlPattern: 一个Servlet可以配置多个访问路径
 * @author chen
 */
@WebServlet(urlPatterns = {"/myServlet1","/chen/*"})
public class MyServlet extends MyHttpServlet{
    @Override
    protected void doGet(ServletRequest req, ServletResponse res) {
        System.out.println("MyServlet doGet");
    }

    @Override
    protected void doPost(ServletRequest req, ServletResponse res) {
        System.out.println("MyServlet doPost");
    }
}
