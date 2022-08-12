package com.hexaware.servletfirstprogram;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Addition
 */
@WebServlet("/Addition")
public class Addition extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		int vOne = Integer.parseInt(req.getParameter("value1"));
		int vTwo = Integer.parseInt(req.getParameter("value2"));
		pw.println("<h1>"+"addition =" + (vOne + vTwo)+"</h1>");
	}

}
