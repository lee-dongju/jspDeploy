package kr.or.ddit.jstl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.filter.DefCompLocaleFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class LocaleSelectServlet
 */
@WebServlet("/localeSelect")
public class LocaleSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String locale = request.getParameter("locale");
//		locale = locale == null ? "ko" : locale;
		System.out.println("locale값 : " + request.getParameter("locale"));
		
		request.setAttribute("locale", request.getParameter("locale"));
		request.getRequestDispatcher("/jsp/jstl/localeSelect.jsp").forward(request, response);
	}
}
