package com.maoge.news.servelt;
/**
 * �������ҳ��htmlģ������
 * @author maoge
 * @date 2019-05-05
 */
public class HtmlData {
	//�������ҳ��ģ��
	public static String viewTemplate=
			"<!-- �������ҳ�� -->" + 
			"<html>" + 
			"<head>" + 
			"    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">" + 
			"    <title>�������ҳ��</title>" + 
			"    <style>" + 
			"        body {" + 
			"            text-align: center;" + 
			"        }" + 
			"        #title-bar {" + 
			"            width: 600px;" + 
			"            margin: 0 auto;" + 
			"            border: 1px solid black;" + 
			"            height:64px;" + 
			"            line-height: 64px;" + 
			"            border-radius: 16px;" + 
			"            font-size:1.4em;" + 
			"        }" + 
			"        #title-bar span{" + 
			"            margin-right:24px;" + 
			"        }" + 
			"        #content-bar {" + 
			"            width: 800px;" + 
			"            margin: 24 auto;" + 
			"            min-height: 600px;" + 
			"            border: 1px solid black;" + 
			"            border-radius: 16px;" + 
			"        }" + 
			"" + 
			"        #content-bar ul li{" + 
			"            text-align: left;" + 
			"        }" + 
			"    </style>" + 
			"    <head>" + 
			"    <body>" + 
			"        <div id=\"title-bar\">" + 
			//�������ɶ�̬�滻
			"@title-bar"+
			"        </div>" + 
			"        <div id=\"content-bar\">" + 
			"            <ul>" + 
			//�������ɶ�̬�滻
			"@content-bar"+
			"            </ul>" + 
			"        </div>" + 
			"    </body>" + 
			"</html>";
	//��¼ҳ��ģ��
	public static String loginTemplate=
			"<!-- ��¼ҳ�� -->" + 
			"<html>" + 
			"<head>" + 
			"    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">" + 
			"    <title>��¼</title>" + 
			"    <style>" + 
			"        /*����*/" + 
			"        body {" + 
			"            text-align: center;" + 
			"        }" + 
			"        #title-bar{" + 
			"            margin-top:24px;/*�봰�ڶ����о���*/" + 
			"            font-size:2em;    /*������*/" + 
			"        }" + 
			"        #input-bar{" + 
			"            margin-top:64px;/*��������о���*/" + 
			"" + 
			"        }" + 
			"        #input-bar span{" + 
			"            display:inline-block;/*��spanԪ��ռ�ݿ��*/" + 
			"            width:100px;/*�������ֳ��ȣ�����*/" + 
			"         " + 
			"        }" + 
			"        #button-bar{" + 
			"            margin-top:64px;/*��������о���*/" + 
			"        }" + 
			"        #button-bar input[type=submit]{" + 
			"            border:0px;/*ȥ����ť�߿�*/" + 
			"            border-radius: 4px;/*Բ�Ǳ߿�*/" + 
			"            width:120px;" + 
			"            height: 32px;" + 
			"            background-color:cadetblue;/*����ɫ*/" + 
			"            color:white;/*������ɫ*/" + 
			"        }" + 
			"    </style>" + 
			"    <head>" + 
			"    <body>" + 
			"    <form action='NewsServlet' method='get'>"+//���form������󽫱������ύ��NewsServlet
			"        <div id=\"title-bar\">��ӭ��¼XXѶϢ��</div>" + 
			"        <div id='input-bar'>" + 
			"            <input name='method' value='doLogin' type=\"hidden\"><br>" + //ͨ�������ı��򴫵�method=doLogin
			"            <span>�û���:</span><input name='username' type=\"text\"><br>" + //Ϊ���������name
			"            <span>����:</span><input name='password' type=\"text\">" + //Ϊ���������name
			"        </div>" + 
			"        <div id=\"button-bar\">" + 
			"            <input type='submit' value=\"��¼\">" + //����¼��ť���͸�Ϊsubmit
			"        </div>" + 
			"    </form>"+	
			"    </body>" + 
			"</html>";
	//���ŷ���ҳģ��
	public static String publishTemplate=
			"<!-- ���ŷ���ҳ�� -->" + 
			"<html>" + 
			"<head>" + 
			"    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">" + 
			"    <title>��������</title>" + 
			"    <style>" + 
			"        /*����*/" + 
			"        body {" + 
			"            text-align: center;" + 
			"        }" + 
			"        #title-bar{" + 
			"            margin-top:24px;/*�봰�ڶ����о���*/" + 
			"            font-size:2em;    /*������*/" + 
			"        }" + 
			"        #input-bar{" + 
			"            margin-top:64px;/*��������о���*/" + 
			"        }" + 
			"        #input-bar span{" + 
			"            display:inline-block;/*��spanԪ��ռ�ݿ��*/" + 
			"            width:100px;/*�������ֳ��ȣ�����*/" + 
			"        }" + 
			"        #input-bar textarea{" + 
			"            margin-top:24px;" + 
			"        }" + 
			"        #button-bar{" + 
			"            margin-top:64px;/*��������о���*/" + 
			"        }" + 
			"        #button-bar input[type=button]{" + 
			"            border:0px;/*ȥ����ť�߿�*/" + 
			"            border-radius: 4px;/*Բ�Ǳ߿�*/" + 
			"            width:120px;" + 
			"            height: 32px;" + 
			"            background-color:cadetblue;/*����ɫ*/" + 
			"            color:white;/*������ɫ*/" + 
			"        }" + 
			"    </style>" + 
			"    <head>" + 
			"    <body>" + 
			"        <div id=\"title-bar\">��������</div>" + 
			"        <div id=\"input-bar\">" + 
			"            <span>������:</span><input type=\"text\"><br>" + 
			"            <span>�������:</span><input type=\"text\"><br>" + 
			"            <textarea rows=\"10\" cols=\"100\" placeholder=\"�˴���д��������\"></textarea>" + 
			"        </div>" + 
			"        <div id=\"button-bar\">" + 
			"            <input type=\"button\" value=\"ȷ������\">" + 
			"        </div>" + 
			"    </body>" + 
			"</html>";
}
