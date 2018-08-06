package kr.or.ddit.student.dao;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.student.model.StudentVo;

import org.junit.Test;

public class StudentDaoTest {

	/**
	 * 
	 * Method : selectAllStudentsTest
	 * 최초작성일 : 2018. 7. 10.
	 * 작성자 : pc19
	 * 변경이력 :
	 * Method 설명 : 전체 학생 정보를 조회한다.
	 */
	@Test
	public void selectAllStudentsTest() {
		/***Given***/
		StudentDaoInf studentDao = new StudentDao();

		/***When***/
		List<StudentVo> studentList = studentDao.selectAllStudents();
		
		for(StudentVo vo : studentList){
			System.out.println(vo);
		}
		/***Then***/
		assertEquals(25, studentList.size());
		System.out.println("==================================================");
	}
	
	@Test
	public void getStudentPageListTest(){
		/***Given***/
		StudentDaoInf studentDao = new StudentDao();

		/***When***/
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("page", 2);
		map.put("pageSize", 10);
		List<StudentVo> studentList = studentDao.getStudentPageList(map);
		
		for(StudentVo vo : studentList){
			System.out.println(vo);
		}
		
		/***Then***/
		assertEquals(10, studentList.size());
	}
	
	@Test
	public void getStudentTotCntTest(){
		/***Given***/
		StudentDaoInf studentDao = new StudentDao();

		/***When***/
		int studentTotal = studentDao.getStudentTotCnt();
		
		System.out.println("총 학생 수 : " + studentTotal);
		/***Then***/
		assertEquals(25, studentTotal);
	}
	
	@Test
	public void studentUpdateTest(){
		/***Given***/
		StudentVo studentVo = new StudentVo();
		studentVo.setId(2);
		studentVo.setName("강병관");
		studentVo.setAddr1("대전광역시 중구 중앙로 76");
		studentVo.setAddr2("영민빌딩 2층 대덕인재 개발원");
		studentVo.setZipcd("34940");
		studentVo.setPic("Koala.jpg");
		studentVo.setPicpath("D:\\A_TeachingMaterial\\7.JspSpring\\fileUpload");
		studentVo.setPicname("6eee4161-94d1-4093-8f3d-c621e8c246f7");
		
		/***When***/
		StudentDaoInf studentDao = new StudentDao();
		
		int result = studentDao.studentUpdate(studentVo);
		/***Then***/
		assertEquals(1, result);
	}
}
