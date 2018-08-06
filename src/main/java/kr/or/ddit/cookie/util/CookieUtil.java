package kr.or.ddit.cookie.util;

public class CookieUtil {

	/**
	 * 
	 * Method : getCookie
	 * 최초작성일 : 2018. 7. 6.
	 * 작성자 : pc19
	 * 변경이력 :
	 * @param cookie
	 * @param name
	 * @return
	 * Method 설명 : 쿠키 조회
	 */
	public String getCookie(String cookie, String name) {
		//cookie : userId=LDJ; rememberMe=y; checkYn=n;
		//cookies = 1: userId=LDJ, 2:rememberMe=y, 3:checkYn=n
		String [] cookies = cookie.split("; ");
		String result = "";
		for(int i = 0; i < cookies.length; i++){
			String[] cookies1 = cookies[i].split("=");
			//coodies1 = 0:userId, 1:LDJ 2:rememberMe, 3:y; 4:checkYn , 5:n";
			if(cookies1[0].equals(name)){
				result = cookies1[1];
				break;
			}
		}
		System.out.println(result);
		return result;
	}
}
