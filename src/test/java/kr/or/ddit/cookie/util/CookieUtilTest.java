package kr.or.ddit.cookie.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CookieUtilTest {
	private String cookie;
	
	@Before
	public void setup(){
		cookie = "userId=LDJ; rememberMe=y; checkYn=n";
	}
	
	/**
	 * 
	 * Method : cookieSplitTest
	 * 최초작성일 : 2018. 7. 6.
	 * 작성자 : pc19
	 * 변경이력 :
	 * Method 설명 : 쿠키 전체 값에 대한 분리 작업 확인
	 */
	@Test
	public void cookieSplitTest(){
		/***Given***/
		String [] cookies = cookie.split("; ");

		/***When***/

		/***Then***/
		assertEquals(3, cookies.length);
		assertEquals("userId=LDJ", cookies[0]);
		assertEquals("rememberMe=y", cookies[1]);
		assertEquals("checkYn=n", cookies[2]);
	}
	
	/**
	 * 
	 * Method : cookieNameValueSpliTest
	 * 최초작성일 : 2018. 7. 6.
	 * 작성자 : pc19
	 * 변경이력 :
	 * Method 설명 : 쿠키의 이름과 값을 분리 테스트
	 */
	public void cookieNameValueSpliTest(){
		/***Given***/
		String cookie = "userId=LDJ";

		/***When***/
		//cookiesArr[0] = userId
		//cookiesArr[1] = LDJ
		String[] cookieArr = cookie.split("=");
		
		/***Then***/
		assertEquals("userId", cookieArr);
		assertEquals("y", cookieArr);
	}
	
	@Test
	public void getCookieTest() {
		
		/***Given***/
		String cookie = "userId=LDJ; rememberMe=y; checkYn=n";
		CookieUtil cookieUtil = new CookieUtil();

		//userId => LDJ
		/***When***/
		String cookieValue = cookieUtil.getCookie(cookie,"userId");
		
		/***Then***/
		assertEquals("LDJ", cookieValue);
		
	}

}
