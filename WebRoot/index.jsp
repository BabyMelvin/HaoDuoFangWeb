<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%

request.setCharacterEncoding("utf-8");

%>
<%@ page import="java.io.*,java.util.*,java.sql.*" %>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
   <head>
      <title>Bootstrap 模板</title>
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <!-- 引入 Bootstrap -->
      <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
 
      <!-- HTML5 Shim 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
      <!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
      <!--[if lt IE 9]>
         <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
         <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
      <![endif]-->
      <script src="js/pagecontrol.js" type="text/javascript" charset="UTF-8"></script>
       <script type="text/javascript" charset="UTF-8">
        //全局变量
        var numCount;       //数据总数量
        var columnsCounts;  //数据列数量
        var pageCount;      //每页显示的数量
        var pageNum;        //总页数
        var currPageNum ;   //当前页数

        //页面标签变量
        var blockTable;
        var preSpan;
        var firstSpan;
        var nextSpan;
        var lastSpan;
        var pageNumSpan;
        var currPageSpan;



        window.onload=function(){
            //页面标签变量
            blockTable = document.getElementById("blocks");
            preSpan = document.getElementById("spanPre");
            firstSpan = document.getElementById("spanFirst");
            nextSpan = document.getElementById("spanNext");
            lastSpan = document.getElementById("spanLast");
            pageNumSpan = document.getElementById("spanTotalPage");
            currPageSpan = document.getElementById("spanPageNum");

            numCount = document.getElementById("blocks").rows.length - 1;       //取table的行数作为数据总数量（减去标题行1）
            alert(numCount);
            columnsCounts = blockTable.rows[0].cells.length;
            pageCount = 10;
            pageNum = parseInt(numCount/pageCount);
            if(0 != numCount%pageCount){
                pageNum += 1;
            }

            firstPage();
        };
    </script>
   </head>
   <body>
     <!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
      <script src="https://code.jquery.com/jquery.js"></script>
      <!-- 包括所有已编译的插件 -->
      <script src="js/bootstrap.min.js"></script>
	<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default navbar-fixed-top" >
				<div class="navbar-header">
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="#">好多房</a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							 <a href="#">首页</a>
						</li>
						<li>
							 <a href="#">关于我们</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">发布房源<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="#">我要出租</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="./addchushou.jsp">我要出售</a>
								</li>
							</ul>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">寻找房源<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="./searchzhufang.jsp">我要租房</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="servletchushou?do=searchbefore">我要买房</a>
								</li>
							</ul>
						</li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li>
							 <a href="#">政策信息</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">小工具<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="#">Action</a>
								</li>
								<li>
									 <a href="#">Another action</a>
								</li>
								<li>
									 <a href="#">Something else here</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="#">Separated link</a>
								</li>
							</ul>
						</li>
					</ul>
				</div>
			</nav>
			<div class="carousel slide" id="carousel-991804" style="padding-top:55px">
				<ol class="carousel-indicators">
					<li class="active" data-slide-to="0" data-target="#carousel-991804">
					</li>
					<li data-slide-to="1" data-target="#carousel-991804">
					</li>
					<li data-slide-to="2" data-target="#carousel-991804">
					</li>
				</ol>
				<div class="carousel-inner">
					<div class="item active">
						<img alt="" src="images/default.jpg" />
						<div class="carousel-caption">
							<h4>
								First Thumbnail label
							</h4>
							<p>
								Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="" src="images/default1.jpg" />
						<div class="carousel-caption">
							<h4>
								Second Thumbnail label
							</h4>
							<p>
								Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="" src="images/default2.jpg" />
						<div class="carousel-caption">
							<h4>
								Third Thumbnail label
							</h4>
							<p>
								Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
							</p>
						</div>
					</div>
				</div> <a class="left carousel-control" href="#carousel-991804" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-991804" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
		</div>
	</div>
	<div>
		
		<%! String am_pm; %>
		    <%
		    //设置页面5秒刷新
		    	//response.setIntHeader("Refresh",5);
		    	//
		    	Calendar calender=new GregorianCalendar();
		    	int year =calender.get(Calendar.YEAR);
		    	int month= calender.get(Calendar.MONTH)+1;
		    	int date= calender.get(Calendar.DATE);
		    	int hour=calender.get(Calendar.HOUR);
		    	int minute=calender.get(Calendar.MINUTE);
		    	int second=calender.get(Calendar.SECOND);
		    	if(calender.get(Calendar.AM_PM)==0){
		    		am_pm="AM";
		    	}else{
		    		am_pm="PM";
		    	}
		    	//String CT=hour+"时"+minute+"分"+second+"秒";
		    	/*out.print("当前时间"+CT+"\n");*/
		    	String CTD=year+"-"+month+"-"+date;
		    	//out.print("<span>"+CTD+"</span>");
     	%>
     	<p style="font-size:24px">房源信息<span class="label label-info" style="font-size:10px">好多房发布</span><span style="font-size:12px">&nbsp;&nbsp;&nbsp;&nbsp;<%=CTD %></span></p>
     	<span> <a href="search.jsp">搜索</a></span>
<div class="btn-group" data-toggle="buttons">
    <label class="btn btn-primary">
        <input type="radio" name="options" id="option1" checked="checked"> 买房
    </label>
    <label class="btn btn-primary">
        <input type="radio" name="options" id="option2"> 租房
    </label>
</div>
     	
	</div>
	<!-- SLECT from table maifang 
	<sql:setDataSource var="snapshot1" driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/haoduofang?useUnicode=true&characterEncodeing=utf-8"
		user="root" password="12345"/>
	<sql:query dataSource="${snapshot1}" var="result">
		SELECT * from maifangeng;
	</sql:query>-->
	<div class="row clearfix">
		<div class="col-md-12 column">
		<table  class="table" id="blocks">
			<thead>
					<tr>
						<th>
							发布日期
						</th>
						<th>
							位置
						</th>
						<th>
							楼层(楼/层)
						</th>
						<th>
							面积(㎡)
						</th>
						<th>
							装修
						</th>
						<th>
							车库
						</th>
						<th>
							总价(万)
						</th>
						<th>
							具体信息
						</th>
						<th>
							操作
						</th>
					</tr>
				</thead>
			<c:forEach items="${cslist }" var="data">
	    		<tr>
	    			<td>${data.date}</td>
	    			<td>${data.name}</td>
	    			<td>${data.floor}</td>
	    			<td>${data.area}</td>
	    			<td>${data.decoration}</td>
	    			<td>${data.carbarn}</td>
	    			<td>${data.price}</td>
	    			<td>${data.detail}</td>
	    			<td><a href="servletchushou?do=editbefore&id=${data.id}">修改</a>
	    				<a href="servletchushou?do=del&id=${data.id}" onclick="javascript:return confirm('确认要删除吗？')">删除</a>	
	    			</td>
	    		</tr>
    		</c:forEach>
			</table>
			<div id="pagiDiv" align="center" style="width:1200px">
		        <span id="spanFirst">首页</span>&nbsp;;&nbsp;;
		        <span id="spanPre">上一页</span>&nbsp;;&nbsp;;
		        <span id="spanNext">下一页</span>&nbsp;;&nbsp;;
		        <span id="spanLast">尾页</span>&nbsp;;&nbsp;;
		        第&nbsp;<span id="spanPageNum"></span>&nbsp;/&nbsp;<span id="spanTotalPage"></span>&nbsp;页
	    	</div>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-12 column" style="backgroundcolor:#494949">
			 <address> <strong>Twitter, Inc.</strong><br /> 795 Folsom Ave, Suite 600<br /> San Francisco, CA 94107<br /> <abbr title="Phone">P:</abbr> (123) 456-7890</address>
		</div>
	</div>
</div>
	</body>

</html>
