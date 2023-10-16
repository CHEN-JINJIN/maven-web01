package com.chen.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author : CHEN JINJIN
 * @create : 2023/10/9 14:25
 * @desc :  Servlet 生命周期
 */

@WebServlet(urlPatterns = "/servlet-demo2", loadOnStartup = 1)
public class ServletDemo2 implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Servlet init初始化");
        /**
         *  初始化方法
         *  1.调用时机：默认情况下，Servlet被第一次访问时，调用
         *      * loadOnStartup: 默认为-1，修改为0或者正整数，则会在服务器启动的时候，调用
         *  2.调用次数: 1次
         * @param config
         * @throws ServletException
         */
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servlet service");
        /**
         * 提供服务
         * 1.调用时机:每一次Servlet被访问时，调用
         * 2.调用次数: 多次
         * @param req
         * @param res
         * @throws ServletException
         * @throws IOException
         */
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        System.out.println("destory...销毁");
        /**
         * 销毁方法
         * 1.调用时机：内存释放或者服务器关闭的时候，Servlet对象会被销毁，调用
         * 2.调用次数: 1次
         */
    }
}
