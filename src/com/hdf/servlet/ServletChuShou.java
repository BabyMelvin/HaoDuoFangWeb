package com.hdf.servlet;

import java.io.IOException;
import java.io.PrintWriter;
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
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException{
				doPost(request,response);
			}
	public void doPost(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		ChuShouDao csd=new ChuShouImpl();
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
			String date=request.getParameter("date");
			String name=request.getParameter("name");
			String floor=request.getParameter("floor");
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
	}
}
