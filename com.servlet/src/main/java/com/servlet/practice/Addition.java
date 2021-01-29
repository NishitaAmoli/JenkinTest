package com.servlet.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addition extends HttpServlet {
	public static final long serialVersionUID =1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		try {
			
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		int sum;
		int a,b;
		String n1=request.getParameter("num1");
		String n2=request.getParameter("num2");
		a=Integer.parseInt(n1);
		b=Integer.parseInt(n2);
		sum=a+b;
		writer.println(sum);
		}catch(Exception exp) {
			System.out.println(exp);
		}
	}

}
