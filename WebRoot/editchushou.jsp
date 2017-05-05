<%@ page language="java" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html locale="true">
  <head>
    <html:base />
    
    <title>editchushou.jsp</title>

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
    <h1>修改页面 出售页面</h1>
	<form action="servletchushou?do=edit" method="post">
		<input type="hidden" name="id" value="${editchushou.id}">
		日期：<input name="date" value="${editchushou.date}"><br>
		位置：<input name="name" value="${editchushou.name}"><br>
		楼层：<input name="floor" value="${editchushou.floor}"><br>
		面积：<input name="area" value="${editchushou.area}"><br>
		装修：<input name="decoration" value="${editchushou.decoration}"><br>
		车库：<input name="carbarn" value="${editchushou.carbarn}"><br>
		总价：<input name="price" value="${editchushou.price}"><br>
		详细信息：<input name="detail" value="${editchushou.detail}"><br>
		<input type="submit" value="修改"><input type="reset">
	</form>
  </body>
</html:html>
