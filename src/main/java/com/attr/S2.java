package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/s2")
public class S2 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int n1 = Integer.parseInt(req.getParameter("n1"));
		int n2 = Integer.parseInt(req.getParameter("n2"));
		
		int p = n1*n2;
		
		int sum = (int)req.getAttribute("sum");
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		out.println("<h2>");
		out.println("Sum is: " + sum);
		out.println("Product is: " + p);
		out.println("</h2>");
	}
}
