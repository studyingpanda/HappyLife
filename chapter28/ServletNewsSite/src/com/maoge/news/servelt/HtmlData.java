package com.maoge.news.servelt;
/**
 * 新闻浏览页面html模板数据
 * @author maoge
 * @date 2019-05-05
 */
public class HtmlData {
	//新闻浏览页面模板
	public static String viewTemplate=
			"<!-- 新闻浏览页面 -->" + 
			"<html>" + 
			"<head>" + 
			"    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">" + 
			"    <title>新闻浏览页面</title>" + 
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
			//导航栏可动态替换
			"@title-bar"+
			"        </div>" + 
			"        <div id=\"content-bar\">" + 
			"            <ul>" + 
			//新闻栏可动态替换
			"@content-bar"+
			"            </ul>" + 
			"        </div>" + 
			"    </body>" + 
			"</html>";
	//登录页面模板
	public static String loginTemplate=
			"<!-- 登录页面 -->" + 
			"<html>" + 
			"<head>" + 
			"    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">" + 
			"    <title>登录</title>" + 
			"    <style>" + 
			"        /*居中*/" + 
			"        body {" + 
			"            text-align: center;" + 
			"        }" + 
			"        #title-bar{" + 
			"            margin-top:24px;/*与窗口顶部有距离*/" + 
			"            font-size:2em;    /*大字体*/" + 
			"        }" + 
			"        #input-bar{" + 
			"            margin-top:64px;/*与标题栏有距离*/" + 
			"" + 
			"        }" + 
			"        #input-bar span{" + 
			"            display:inline-block;/*让span元素占据宽度*/" + 
			"            width:100px;/*控制文字长度，对齐*/" + 
			"         " + 
			"        }" + 
			"        #button-bar{" + 
			"            margin-top:64px;/*与标题栏有距离*/" + 
			"        }" + 
			"        #button-bar input[type=submit]{" + 
			"            border:0px;/*去除按钮边框*/" + 
			"            border-radius: 4px;/*圆角边框*/" + 
			"            width:120px;" + 
			"            height: 32px;" + 
			"            background-color:cadetblue;/*背景色*/" + 
			"            color:white;/*字体颜色*/" + 
			"        }" + 
			"    </style>" + 
			"    <head>" + 
			"    <body>" + 
			"    <form action='NewsServlet' method='get'>"+//添加form，点击后将表单内容提交到NewsServlet
			"        <div id=\"title-bar\">欢迎登录XX讯息网</div>" + 
			"        <div id='input-bar'>" + 
			"            <input name='method' value='doLogin' type=\"hidden\"><br>" + //通过隐藏文本框传递method=doLogin
			"            <span>用户名:</span><input name='username' type=\"text\"><br>" + //为输入框设置name
			"            <span>密码:</span><input name='password' type=\"text\">" + //为输入框设置name
			"        </div>" + 
			"        <div id=\"button-bar\">" + 
			"            <input type='submit' value=\"登录\">" + //将登录按钮类型改为submit
			"        </div>" + 
			"    </form>"+	
			"    </body>" + 
			"</html>";
	//新闻发布页模板
	public static String publishTemplate=
			"<!-- 新闻发布页面 -->" + 
			"<html>" + 
			"<head>" + 
			"    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">" + 
			"    <title>发布新闻</title>" + 
			"    <style>" + 
			"        /*居中*/" + 
			"        body {" + 
			"            text-align: center;" + 
			"        }" + 
			"        #title-bar{" + 
			"            margin-top:24px;/*与窗口顶部有距离*/" + 
			"            font-size:2em;    /*大字体*/" + 
			"        }" + 
			"        #input-bar{" + 
			"            margin-top:64px;/*与标题栏有距离*/" + 
			"        }" + 
			"        #input-bar span{" + 
			"            display:inline-block;/*让span元素占据宽度*/" + 
			"            width:100px;/*控制文字长度，对齐*/" + 
			"        }" + 
			"        #input-bar textarea{" + 
			"            margin-top:24px;" + 
			"        }" + 
			"        #button-bar{" + 
			"            margin-top:64px;/*与标题栏有距离*/" + 
			"        }" + 
			"        #button-bar input[type=button]{" + 
			"            border:0px;/*去除按钮边框*/" + 
			"            border-radius: 4px;/*圆角边框*/" + 
			"            width:120px;" + 
			"            height: 32px;" + 
			"            background-color:cadetblue;/*背景色*/" + 
			"            color:white;/*字体颜色*/" + 
			"        }" + 
			"    </style>" + 
			"    <head>" + 
			"    <body>" + 
			"        <div id=\"title-bar\">发布新闻</div>" + 
			"        <div id=\"input-bar\">" + 
			"            <span>发布人:</span><input type=\"text\"><br>" + 
			"            <span>新闻类别:</span><input type=\"text\"><br>" + 
			"            <textarea rows=\"10\" cols=\"100\" placeholder=\"此处填写新闻内容\"></textarea>" + 
			"        </div>" + 
			"        <div id=\"button-bar\">" + 
			"            <input type=\"button\" value=\"确定发布\">" + 
			"        </div>" + 
			"    </body>" + 
			"</html>";
}
