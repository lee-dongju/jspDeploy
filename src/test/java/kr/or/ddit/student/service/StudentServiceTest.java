package kr.or.ddit.student.service;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.student.dao.StudentDao;
import kr.or.ddit.student.dao.StudentDaoInf;
import kr.or.ddit.student.model.StudentVo;

import org.junit.Before;
import org.junit.Test;

public class StudentServiceTest {
	
	//@before -> @Test -> @After
	//테스트 메서드안에 중복되는 내용 : StudentDao 구현체에 대한 생성 로직
	//-> @Before 어노테이션이 붙은 setup메서드에 위임
	//모든 테스트 메서드에서 StudentDao객체를 참조할 수 있게끔 클래스 변수로 생성할 필요가 있고(o)
	//클래스 변수를 setup메서드에서 초기화 하는 로직이 필요(o)
	//테스트 메서드에서 생성했던 StudentDao를 생성하는 로직은 삭제
	
	private StudentDaoInf studentDao;
	private StudentServiceInf studentService;
	
	@Before
	public void setup(){
		studentDao = new StudentDao();
		studentService = new StudentService();
	}
	
	/**
	 * 
	 * Method : selectAllStudentsTest
	 * 최초작성일 : 2018. 7. 10.
	 * 작성자 : pc19
	 * 변경이력 :
	 * Method 설명 : 전체 학생 정보 조회 테스트
	 */
	@Test
	public void selectAllStudentsTest() {
		/***Given***/

		/***When***/
		List<StudentVo> studentList = studentService.selectAllStudents();
		for(StudentVo vo : studentList){
			System.out.println(vo);
		}
		/***Then***/
		assertEquals(25, studentList.size());
	}
	
	@Test
	public void getStudentTest(){
		/***Given***/
		
		/***When***/
		StudentVo student = studentService.getStudent(7);
		
		/***Then***/
		System.out.println("번호로 가져온 이름 : " + student.getName());
		System.out.println("번호로 가져온 번호 : " + student.getId() + "\n");
		
		
		assertEquals(7, student.getId());
	}
	
	@Test
	public void getStudentTest1(){
		StudentVo studentVo = new StudentVo();
		studentVo.setId(22);
		
		StudentVo studentVo2 = studentService.getStudent(studentVo);
		
		System.out.println("vo로 가져온 이름: " + studentVo2.getName());
		System.out.println("vo로 가져온 번호: " + studentVo2.getId() + "\n");
		
		assertEquals(22, studentVo2.getId());
	}
	
	@Test
	public void getStudentPageListTest(){
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("page", 3);
		map.put("pageSize", 10);
		Map<String, Object> resultMap = studentService.getStudentPageList(map);
		
		//학생 페이지 리스트
		List<StudentVo> studentList = (List<StudentVo>) resultMap.get("pageList");
		
		//학생 전체 건수
		int totCon = (int) resultMap.get("totCnt");
		
		/***Then***/
		assertEquals(5, studentList.size()); //학생 페이지 리스트 건수에 대한 검증
		assertEquals(25, totCon); 			 //학생 전체 건수에 대한 검증
	}
	
	/**
	 * 
	 * Method : calculatePageNavi
	 * 최초작성일 : 2018. 7. 11.
	 * 작성자 : pc19
	 * 변경이력 :
	 * Method 설명 : 전체 건수를 인자로 페이지 네비게이션 사이즈를 구한다.
	 */
	@Test
	public void calculatePageNavi(){
		/***Given***/
		int totCnt = 25;
		int pageSize = 10;
		
		int cnt = totCnt / pageSize; //몫
		int mod = totCnt % pageSize; //나머지
		
		if(mod > 0){
			cnt++;
		}
		
		/***When***/
		double naviSize = ((double)totCnt/pageSize);
		System.out.println(Math.ceil((double)totCnt/(double)pageSize));
		
		/***Then***/
		assertEquals(3, cnt);
	}
	
	@Test
	public void studentUpdate(){
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
		int result = studentService.studentUpdate(studentVo);
		/***Then***/
		assertEquals(1, result);
	}
}
