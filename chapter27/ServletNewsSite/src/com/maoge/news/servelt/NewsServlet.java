package com.maoge.news.servelt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ��������Servlet
 * @author maoge
 * @date 2019-05-05
 */
@WebServlet("/NewsServlet")
public class NewsServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//�����ƪ������������������
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		//��ȡ�û������ַ�д��ݵ�method���� 
		String method=req.getParameter("method");
		if(method.equals("gotoViewPage")) {
			out.println(HtmlData.viewTemplate);
		}else if(method.equals("gotoLoginPage")){
			out.println(HtmlData.loginTemplate);
		}else if(method.equals("gotoPublishPage")){
			out.println(HtmlData.publishTemplate);
		}else {
			out.println("404���������ҳ�治����");
		}
	}
}