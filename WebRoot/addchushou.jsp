<%@ page language="java" pageEncoding="UTF-8"%>
<%

request.setCharacterEncoding("utf-8");

%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
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
		位置：<input name="name"><br>
		楼层：楼<input name="lou">层<input name="ceng"><br>
		面积：<input name="area"><br>
		装修等级:<select name="decoration" id="zx">
                                            <option value="毛坯">毛坯</option>
                                            <option value="简装">简装</option>
                                            <option value="精装">精装</option>
                                            <option value="豪装">豪装</option>
                         </select><br>
		车库：<select name="carbarn">
			<option value="有">有</option>
			<option value="无">无</option>
		</select><br>
		总价：<input name="price"><br>
		详细信息：<input name="detail"><br>
		<input type="submit" value="新增"><input type="reset">
	</form>
  </body>
</html>
