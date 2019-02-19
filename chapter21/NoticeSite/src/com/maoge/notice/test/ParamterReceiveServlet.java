package com.maoge.notice.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//测试接收参数的Servlet
@WebServlet("/ParamterReceiveServlet")
public class ParamterReceiveServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取一个名字叫name的浏览器输入参数
		String input=req.getParameter("name");
		String output="你好："+input;
		//输出
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.println(output);
	}
}
