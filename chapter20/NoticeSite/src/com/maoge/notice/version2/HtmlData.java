package com.maoge.notice.version2;
//��������Htmlģ��
public class HtmlData {
	public static String template=
			"<!--����ҳ�����ߣ�ë��-->" + 
			"<html>" + 
			"<head>" + 
			"    <meta http-equiv='Content-Type' content='text/html;charset=UTF-8' />" + 
			"    <title>ɽ������ѶϢ</title>" + 
			"    <style>" + 
			"        /* �Ǻű�ʾȫ�� */" + 
			"        * {" + 
			"            margin: 0;" + 
			"            /*��߾�Ϊ0*/" + 
			"            padding: 0;" + 
			"            /*�ڱ߾�Ϊ0*/" + 
			"        }" + 
			"        #head {" + 
			"            background: linear-gradient(to right, #FFFFFF, #D0E1FF);" + 
			"            height: 64px;" + 
			"            line-height: 64px;" + 
			"            /*ͨ������line-height����heightʵ�����ִ�ֱ����*/" + 
			"            color: #247398;" + 
			"            /*ͷ���ı���ɫ*/" + 
			"        }" + 
			"        #head img {" + 
			"            vertical-align: middle;" + 
			"            /*ͼƬ��ֱ����*/" + 
			"            height: 48px;" + 
			"        }" + 
			"        #left {" + 
			"            width: 186px;" + 
			"            float: left;" + 
			"            /*���󸡶�*/" + 
			"            height: 100%;" + 
			"            /*�߶����������*/" + 
			"            border: 4px solid #89B5E9;" + 
			"            /*�߿���ɫ��ȡɫ��ȡ��Ŷ*/" + 
			"            background-color: #EAF0F6;" + 
			"            /*��������ɫ��ȡɫ��ȡ��Ŷ*/" + 
			"            border-radius: 12px;" + 
			"            /*Բ�Ǳ߿�*/" + 
			"            padding-left: 8px;" + 
			"            /*��������ڱ߾�*/" + 
			"            color: #247398;" + 
			"            /*������ɫ*/" + 
			"            font-size: 1.3em;" + 
			"            /*�����С*/" + 
			"            font-family: 'STKaiti';" + 
			"            /*�ٶ�����һ�ֿ���*/" + 
			"        }" + 
			"        #left ul li" + 
			"" + 
			"        /*�����б�����ʽ*/" + 
			"            {" + 
			"            margin-top: 12px;" + 
			"            /*�б�����ϱ߾�*/" + 
			"        }" + 
			"        #content table{" + 
			"            margin-top:24px;" + 
			"            margin-left:224px;/*ע��˴���Ϊ��ม�������õ��ǵ���������صĿ��*/" + 
			"        }" + 
			"        #content table tr{" + 
			"            height:48px;" + 
			"        }" + 
			"      " + 
			"    </style>" + 
			"</head>" + 
			"<body>" + 
			"    <div id='head'>" + 
			"        <img src='bank.png'' alt=' ɽ������'>" + 
			"        ɽ������ѶϢ" + 
			"    </div>" + 
			"    <div id='left'>" + 
			"        <ul>" + 
			"            <li><a href='/NoticeSite/NavServlet2'>ȫ��֪ͨ</a></li>" + 
			"            <li><a href='/NoticeSite/CompanyServlet2'>��˾ҵ��</a></li>" + 
			"            <li><a>����ҵ��</a></li>" + 
			"            <li><a>����</a></li>" + 
			"        </ul>" + 
			"    </div>" + 
			"    <div id='content'>" + 
			"        @content"+
			"    </div>" + 
			"</body>" + 
			"</html>";
}
