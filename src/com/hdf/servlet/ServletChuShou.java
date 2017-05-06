package com.hdf.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hdf.dao.ChuShouDao;
import com.hdf.dao.impl.ChuShouImpl;
import com.hdf.entity.ChuShou;

public class ServletChuShou extends HttpServlet{
	private static final long serialVersionUID=2L;
	private ChuShouDao csd=null;
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException{
				doPost(request,response);
			}
	public void doPost(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		System.out.println(" ---->doPost  called<-------");
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		csd=new ChuShouImpl();
		String dos=request.getParameter("do");
		if(dos==null||dos.equals("")){
			dos="index";
		}
		if(dos.equals("index")){
			List<ChuShou> cslist=csd.getAllChuShou();
			session.setAttribute("cslist", cslist);
			response.sendRedirect("index.jsp");
			return ;
		}
		if(dos.equals("add")){
			
			//String date=request.getParameter("date");
			String date=getDate();
			String name=request.getParameter("name");
			String lou=request.getParameter("lou");
			String ceng=request.getParameter("ceng");
			String floor=lou+"/"+ceng;
			String area=request.getParameter("area");
			String decoration=request.getParameter("decoration");
			String carbarn=request.getParameter("carbarn");
			String price=request.getParameter("price");
			String detail=request.getParameter("detail");
			ChuShou cs=new ChuShou(0,date,name,floor,area,decoration,carbarn,price,detail);
			System.out.println("add1:--------"+cs+"-------");
			csd.addChuShou(cs);
			System.out.println("add2:--------"+cs+"-------");
			out.print("<script>alert('新增成功');window.location='servletchushou?do=index';</script>");
			return;
		}
		if(dos.equals("del")){
			String ids=request.getParameter("id");
			int id=Integer.parseInt(ids);
			csd.delChuShou(id);
			out.print("<script>alert('删除成功');window.location='servletchushou?do=index';</script>");
			return ;
		}
		if(dos.equals("editbefore")){
			String ids=request.getParameter("id");
			int id=Integer.parseInt(ids);
			ChuShou cs=csd.findChuShouById(id);
			System.out.println(cs);
			session.setAttribute("editchushou", cs);
			response.sendRedirect("editchushou.jsp");
			return ;
		}
		if(dos.equals("edit")){
			System.out.println("--------"+"-------");
			String ids=request.getParameter("id");
			int id=Integer.parseInt(ids);
			String date=request.getParameter("date");
			String name=request.getParameter("name");
			String floor=request.getParameter("floor");
			String area=request.getParameter("area");
			String decoration=request.getParameter("decoration");
			String carbarn=request.getParameter("carbarn");
			String price=request.getParameter("price");
			String detail=request.getParameter("detail");
			ChuShou cs=new ChuShou(id,date,name,floor,area,decoration,carbarn,price,detail);
			System.out.println("edit:::"+cs);
			csd.updateChouShou(cs);
			out.print("<script>alert('修改成功');window.location='servletchushou?do=index';</script>");
			return ;
		}
		if(dos.equals("searchbefore")){
			List<ChuShou> cslist=csd.getAllChuShou();
			session.setAttribute("cslist", cslist);
			response.sendRedirect("searchmaifang.jsp");
			return ;
		}
		if(dos.equals("search")){
			System.out.println("search method called");
			List<ChuShou> cslist=csd.getAllChuShou();
			List<ChuShou> cssearchlist=new ArrayList<ChuShou>();
			for(ChuShou cs:cslist){
				if(checkChuShou(cs,request)){
					cssearchlist.add(cs);
					System.out.println("search:add"+cs);
				}
			}
			session.setAttribute("cssearchlist", cssearchlist);
			response.sendRedirect("searchmaifangresult.jsp");
			return ;
		}
	}
	private String getDate(){
		String dateString=null;
		Calendar calender=new GregorianCalendar();
    	int year =calender.get(Calendar.YEAR);
    	int month= calender.get(Calendar.MONTH)+1;
    	int date= calender.get(Calendar.DATE);
    	/*int hour=calender.get(Calendar.HOUR);
    	int minute=calender.get(Calendar.MINUTE);
    	int second=calender.get(Calendar.SECOND);*/
    	dateString=year+"年"+month+"月"+date+"日";
		return dateString;
	}
	private boolean checkChuShou(ChuShou cs,HttpServletRequest request){
		String name =request.getParameter("name");
		String pricelow=request.getParameter("pricelow");
		String pricehigh=request.getParameter("pricehigh");
		String lou=request.getParameter("lou");
		String ceng=request.getParameter("ceng");
		String arealow=request.getParameter("arealow");
		String areahigh=request.getParameter("areahigh");
		String carbarn=request.getParameter("carbarn");
		String decoration=request.getParameter("decoration");
		String dateclose=request.getParameter("dateclose");
		String floor=cs.getFloor();
		String[] string=new String[2];
		string=floor.split("/");
		String louCs=string[0];
		String cengCs=string[1];
		int pricelowint=0;
		int pricehighint=0;
		int csprice=0;
		int arealowint=0;
		int areahighint=0;
		int csarea=0;
		if(pricelow!=null&&!pricelow.equals("")){
			 pricelowint=Integer.valueOf(pricelow).intValue();
		}
		
		if(pricehigh!=null&&!pricehigh.equals("")){
			pricehighint=Integer.valueOf(pricehigh).intValue();
		}
		csprice=Integer.valueOf(cs.getPrice()).intValue();
		if(arealow!=null&&!arealow.equals("")){
			arealowint=Integer.valueOf(arealow).intValue();
		}
		if(areahigh!=null&&!areahigh.equals("")){
			areahighint=Integer.valueOf(areahigh).intValue();
		}
		csarea=Integer.valueOf(cs.getArea()).intValue();
		System.out.println("0-------"+pricelow+":"+pricelowint);
		//价格比较
		if(pricehigh!=null&&!pricehigh.equals("")&&pricelow!=null&&!pricelow.equals("")&&!(csprice >= pricelowint && csprice <= pricehighint))
			return false;
		System.out.println("1-------");
		//小区名称比较
		if(name!=null&&!name.equals("")){
			//判断前三个字有两个相同就列举出来
			String nameCs=cs.getName();
			int lenRe=name.length();
			int lenCs=nameCs.length();
			//int max;
			int min;
			int count = 0;
			if(lenRe>lenCs){
			//	max=lenRe;
				min=lenCs;
			}else{
			//	max=lenCs;
				min=lenRe;
			}
			for(int i=0;i<min;i++){
				for(int j=0;j<min;j++){
					if(name.charAt(i)==(nameCs.charAt(j))){
						count++;
					}
					
				}
			}
			if(count>=3){
				
			}else{
				return false;
			}
		}
		System.out.println("2-------");
		//面积比较
		if(arealow!=null&&!arealow.equals("")&&areahigh!=null&&!areahigh.equals("")&&!(csarea>=arealowint && csarea<=areahighint))
			return false;
		System.out.println("3-------");
		//楼比较
		if(lou!=null&&!lou.equals("")&&!lou.equals(louCs))
			return false;
		System.out.println("4-------");
		//层比较
		if(ceng!=null&&!ceng.equals("")&&!ceng.equals(cengCs))
			return false;
		System.out.println("5-------"+carbarn);
		//车库比较
		if(carbarn.equals("任意")){
			
		}else if(!carbarn.equals(cs.getCarbarn()))
		{
			return false;
		}
		System.out.println("6-------"+decoration);
		//装修比较
		if(decoration.equals("任意")){
			
		}else if(!decoration.equals(cs.getDecoration())){
			return false;
		}
		System.out.println("7-------");
		//日期比较
		if(dateclose.equals("任意")){
			
		}else if(!checkDate(dateclose,cs.getDate())){
			return false;
		}
		return true;
	}
	private boolean checkDate(String reDate,String csDate){
		Calendar calender=new GregorianCalendar();
    	int year =calender.get(Calendar.YEAR);
    	int month= calender.get(Calendar.MONTH)+1;
		int currentMonths=12*year+month;
		String[] string=new String[2];
		string=csDate.split("年");
		int csYear=Integer.valueOf(string[0]).intValue();
		string=string[1].split("月");
		int csMonth=Integer.valueOf(string[0]).intValue();
		int csMonths=csYear*12+csMonth;
		if(reDate.equals("近一月")){
			if(currentMonths-csMonths<=1){
				return true;
			}else{
				return false;
			}
		}else if(reDate.equals("近三月")){
			if(currentMonths-csMonths<=3){
				return true;
			}else{
				return false;
			}
		}else if(reDate.equals("近五月")){
			if(currentMonths-csMonths<=5){
				return true;
			}else{
				return false;
			}
		}else if(reDate.equals("近半年")){
			if(currentMonths-csMonths<=6){
				return true;
			}else{
				return false;
			}
		}else if(reDate.equals("近一年")){
			if(currentMonths-csMonths<=12){
				return true;
			}else{
				return false;
			}
		}else if(reDate.equals("近两年")){
			if(currentMonths-csMonths<=24){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
}
