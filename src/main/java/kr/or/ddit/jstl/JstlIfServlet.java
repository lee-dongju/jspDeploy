package kr.or.ddit.jstl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JstlIfServlet
 */
@WebServlet("/jstlIfServlet")
public class JstlIfServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("code", "02");
		
		//view 위임
	RequestDispatcher rd = request.getRequestDispatcher("/jsp/jstl/if.jsp");
	rd.forward(request, response);
	
	}
}
