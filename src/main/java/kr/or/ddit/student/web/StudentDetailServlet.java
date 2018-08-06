package kr.or.ddit.student.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.student.model.StudentVo;
import kr.or.ddit.student.service.StudentService;
import kr.or.ddit.student.service.StudentServiceInf;

/**
 * Servlet implementation class StudentDetailServlet
 */
@WebServlet("/studentDetail")
public class StudentDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Logger logger = LoggerFactory.getLogger(StudentDetailServlet.class);
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.debug("지나갑니까?");
		
		//학생 id를 파라미터 확인
		int id = Integer.parseInt(request.getParameter("id"));
		
		//service 학생 정보를 조회
		StudentServiceInf studentServiceInf = new StudentService();
		StudentVo studentVo = studentServiceInf.getStudent(id);
		
		//request 객체에 저장
		request.setAttribute("studentVo", studentVo);
		
		// student/studentDetail.jsp로 위임
		request.getRequestDispatcher("/student/studentDetail.jsp").forward(request, response);
	}
}
