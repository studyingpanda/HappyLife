package com.maoge.notice.version2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//ȫ��֪ͨҳServlet
@WebServlet("/NavServlet2")
public class NavServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//�����ƪ������������������
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		//��ҳ����
		String myContent=
				"        <table>" + 
				"            <tr>" + 
				"                <td>2019-02-04 10:00</td>" + 
				"                <td>ף����´����</td>" + 
				"            </tr>" + 
				"        </table>";
		//�滻ģ���ַ���ռλ��Ϊ��ҳ����
		String html=HtmlData.template.replace("@content", myContent);
		out.println(html);
	}
}
