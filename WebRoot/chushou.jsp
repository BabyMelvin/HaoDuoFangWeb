<%@ page language="java" pageEncoding="UTF-8"%>
<%

request.setCharacterEncoding("utf-8");

%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html locale="true">
  <head>
    <html:base />
    
    <title>chushou.jsp</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h1>发布出售页面</h1>
	<form action="servletchushou?do=add" method="post">
		日期：<input name="date"><br>
		位置：<input name="name"><br>
		楼层：<input name="floor"><br>
		面积：<input name="area"><br>
		装修：<input name="decoration"><br>
		车库：<input name="carbarn"><br>
		总价：<input name="price"><br>
		详细信息：<input name="detail"><br>
		<input type="submit" value="新增"><input type="reset">
	</form>
  </body>
</html:html>
