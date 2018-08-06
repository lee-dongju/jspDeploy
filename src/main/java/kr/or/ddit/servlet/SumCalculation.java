package kr.or.ddit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class sumCalculation
 */
@WebServlet("/sumCalculation")
public class SumCalculation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SumCalculation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		
		int tmp = 0;
		int startTmp = Integer.parseInt(start);
		int endTmp = Integer.parseInt(end);
		int sum = 0;
		int mutiply = 0;
		
		if(startTmp < endTmp){
			for(int i = startTmp+1; i < endTmp; i++){
				sum += i;
			}
			System.out.println("사이의 합 : " + (sum));
			
		}else if(startTmp > endTmp){
			tmp = startTmp;
			startTmp = endTmp;
			endTmp = tmp;
			
			for(int i = startTmp+1; i < endTmp; i++){
				sum += i;
			}
			System.out.println("사이의 합 : " + (sum));
			
		}
		//System.out.println(sum);
		//request.getParameter 사용자가 보낸 파라미터를 받아오는 작업
		//request객체에 일시적으로 값을 저장하는 방법
		request.setAttribute("sumResult", sum);
		
		//session에 sumResult를 저장한다.
		HttpSession session = request.getSession();
		session.setAttribute("sumResult", sum);
		
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/sumResult.jsp");
		rd.forward(request, response);
	}
}
