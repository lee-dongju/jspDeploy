package kr.or.ddit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Multiply
 */
@WebServlet("/multiply")
public class Multiply extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Multiply() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		int startTmp = Integer.parseInt(start);
		int endTmp = Integer.parseInt(end);
		int multiply = 0;
		int tmp = 0;
		
		if(startTmp > endTmp){
			tmp = startTmp;
			startTmp = endTmp;
			endTmp = tmp;
			
			multiply = startTmp * endTmp;
			System.out.println("start : " + startTmp);
			System.out.println("end : " + endTmp);
			System.out.println("두 수의 곱 : " + multiply);
			System.out.println();
		}else{
			multiply = startTmp * endTmp;
			System.out.println("start : " + startTmp);
			System.out.println("end : " + endTmp);
			System.out.println("두 수의 곱 : " + multiply);
			System.out.println();
		}
	}

}
