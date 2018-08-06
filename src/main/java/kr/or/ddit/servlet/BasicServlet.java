package kr.or.ddit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BasicServlet extends HttpServlet{
	

	@Override
	public void destroy() {
		System.out.println("destroy   ");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init ");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			
		Calendar cal = Calendar.getInstance();
		Date dt = new Date();

		PrintWriter pw = resp.getWriter();
		pw.write("hello servlet world");
		pw.write("current time : " + dt.toString());
		pw.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}
	
}
