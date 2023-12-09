package com.demoApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




public class SqServlet extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		int k=0;
		Cookie cookies[]=req.getCookies();
		for(Cookie c: cookies)
		{
			if(c.getName().equals("k"))
				k= Integer.parseInt(c.getValue());
			}
	
//	HttpSession session=req.getSession();		
//int k = (int) session.getAttribute("k");
k = k*k;
PrintWriter out = res.getWriter();
out.println("Result is "+k);

		System.out.println("Sq called");
	}
}

//int k= (int) req.getAttribute("k");
//PrintWriter out = res.getWriter();
//out.println("Hello to Sq Result is "+k);

//int k= Integer.parseInt(req.getParameter("k"));
//PrintWriter out = res.getWriter();
//out.println("Hello to Sq Result is "+k*k);	
