package com.maoge.news.servelt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 新闻请求Servlet
 * @author maoge
 * @date 2019-05-05
 */
@WebServlet("/NewsServlet")
public class NewsServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		String method=req.getParameter("method");
		if(method.equals("gotoViewPage")) {
			out.println(HtmlData.viewTemplate);
		}else if(method.equals("gotoLoginPage")){
			out.println(HtmlData.loginTemplate);
		}else if(method.equals("gotoPublishPage")){
			out.println(HtmlData.publishTemplate);
		}else if(method.equals("doLogin")) {//处理登录请求
			String username=req.getParameter("username");//取出前台传递过来的username
			String password=req.getParameter("password");//取出前台传递过来的password
			if(username.equals("maoge")&&password.equals("verycool")) {
				out.println("<p>登录成功</p>");
			}else {
				out.println("<p>登录失败，请检查您的用户名和密码</p>");
			}
		}else {
			out.println("404！您请求的页面不存在");
		}
	}
}