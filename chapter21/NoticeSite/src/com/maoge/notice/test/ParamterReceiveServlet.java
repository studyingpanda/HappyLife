package com.maoge.notice.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//���Խ��ղ�����Servlet
@WebServlet("/ParamterReceiveServlet")
public class ParamterReceiveServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//��ȡһ�����ֽ�name��������������
		String input=req.getParameter("name");
		String output="��ã�"+input;
		//���
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.println(output);
	}
}
