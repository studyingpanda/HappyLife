package com.maoge.notice.version2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//全体通知页Servlet
@WebServlet("/NavServlet2")
public class NavServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//解决上篇遗留的中文乱码问题
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		//本页内容
		String myContent=
				"        <table>" + 
				"            <tr>" + 
				"                <td>2019-02-04 10:00</td>" + 
				"                <td>祝大家新春愉快</td>" + 
				"            </tr>" + 
				"        </table>";
		//替换模板字符串占位符为本页内容
		String html=HtmlData.template.replace("@content", myContent);
		out.println(html);
	}
}
