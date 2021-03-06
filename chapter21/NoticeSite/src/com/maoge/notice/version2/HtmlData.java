package com.maoge.notice.version2;
//用来保存Html模板
public class HtmlData {
	public static String template=
			"<!--导航页，作者：毛哥-->" + 
			"<html>" + 
			"<head>" + 
			"    <meta http-equiv='Content-Type' content='text/html;charset=UTF-8' />" + 
			"    <title>山南银行讯息</title>" + 
			"    <style>" + 
			"        /* 星号表示全部 */" + 
			"        * {" + 
			"            margin: 0;" + 
			"            /*外边距为0*/" + 
			"            padding: 0;" + 
			"            /*内边距为0*/" + 
			"        }" + 
			"        #head {" + 
			"            background: linear-gradient(to right, #FFFFFF, #D0E1FF);" + 
			"            height: 64px;" + 
			"            line-height: 64px;" + 
			"            /*通过设置line-height等于height实现文字垂直居中*/" + 
			"            color: #247398;" + 
			"            /*头部文本颜色*/" + 
			"        }" + 
			"        #head img {" + 
			"            vertical-align: middle;" + 
			"            /*图片垂直居中*/" + 
			"            height: 48px;" + 
			"        }" + 
			"        #left {" + 
			"            width: 186px;" + 
			"            float: left;" + 
			"            /*靠左浮动*/" + 
			"            height: 100%;" + 
			"            /*高度铺满浏览器*/" + 
			"            border: 4px solid #89B5E9;" + 
			"            /*边框，颜色是取色器取得哦*/" + 
			"            background-color: #EAF0F6;" + 
			"            /*背景，颜色是取色器取得哦*/" + 
			"            border-radius: 12px;" + 
			"            /*圆角边框*/" + 
			"            padding-left: 8px;" + 
			"            /*设置左侧内边距*/" + 
			"            color: #247398;" + 
			"            /*字体颜色*/" + 
			"            font-size: 1.3em;" + 
			"            /*字体大小*/" + 
			"            font-family: 'STKaiti';" + 
			"            /*百度找了一种楷体*/" + 
			"        }" + 
			"        #left ul li" + 
			"" + 
			"        /*设置列表项样式*/" + 
			"            {" + 
			"            margin-top: 12px;" + 
			"            /*列表项的上边距*/" + 
			"        }" + 
			"        #content table{" + 
			"            margin-top:24px;" + 
			"            margin-left:224px;/*注意此处因为左侧浮动，设置的是到窗口左边沿的宽度*/" + 
			"        }" + 
			"        #content table tr{" + 
			"            height:48px;" + 
			"        }" + 
			"      " + 
			"    </style>" + 
			"</head>" + 
			"<body>" + 
			"    <div id='head'>" + 
			"        <img src='bank.png'' alt=' 山南银行'>" + 
			"        山南银行讯息" + 
			"    </div>" + 
			"    <div id='left'>" + 
			"        <ul>" + 
			"            <li><a href='/NoticeSite/NavServlet2'>全体通知</a></li>" + 
			"            <li><a href='/NoticeSite/CompanyServlet2'>公司业务</a></li>" + 
			"            <li><a>个人业务</a></li>" + 
			"            <li><a>文体活动</a></li>" + 
			"        </ul>" + 
			"    </div>" + 
			"    <div id='content'>" + 
			"        @content"+
			"    </div>" + 
			"</body>" + 
			"</html>";
}
