package com.hdf.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hdf.utils.MyRequest;

public class EncodingFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		
		//1 ����Request��Response���������ǿת
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)resp;
		
		//2 ���������������:1)�������������(GET\POST);2)��Ӧ����������.
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//3 �����Զ����Request����
		MyRequest myRequest = new MyRequest(request);
		
		//3 ����
		chain.doFilter(myRequest, response);
	}

	public void init(FilterConfig arg0) throws ServletException {
	}

}
