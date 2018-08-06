package kr.or.ddit.calculator;

public class Calculator {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int addResult = cal.add(5, 6);
		
		if(addResult == 11){
			System.out.println("덧셈결과가 올바릅니다.");
		}else{
			System.out.println("덧셈결과가 올바르지 않습니다.");
		}
		
		////////////////////////////////////////////
		
		int minusResult = cal.minus(6, 4);
		if(minusResult == 2){
			System.out.println("뺄셈결과가 올바릅니다.");
		}else{
			System.out.println("뺄셈결과가 올바르지 않습니다.");
		}
		
		////////////////////////////////////////////
		
		int multiplyResult = cal.multiply(5, 4);
		if(multiplyResult == 20){
			System.out.println("곱셈결과가 올바릅니다.");
		}else{
			System.out.println("곱셈결과가 올바르지 않습니다.");
		}
		
		////////////////////////////////////////////
		
		int divideResult = cal.divide(10, 4);
		if(divideResult == 2.5){
			System.out.println("나눗셈결과가 올바릅니다.");
		}else{
			System.out.println("나눗셈결과가 올바르지 않습니다.");
		}
		
		divideResult = cal.divide(10, 0);
		if(divideResult == 0){
			System.out.println("나눗셈결과가 올바릅니다.");
		}else{
			System.out.println("나눗셈결과가 올바르지 않습니다.");
		}
	}
	
	/**
	 * 
	 * Method : add
	 * 최초작성일 : 2018. 7. 6.
	 * 작성자 : pc19
	 * 변경이력 :
	 * @param param1
	 * @param param2
	 * @return
	 * Method 설명 : 계산기의 덧셈 기능
	 */
	public int add(int param1, int param2){
		return param1 + param2;
	}
	
	/**
	 * 
	 * Method : minus
	 * 최초작성일 : 2018. 7. 6.
	 * 작성자 : pc19
	 * 변경이력 :
	 * @param param1
	 * @param param2
	 * @return
	 * Method 설명 : 계산기의 뺄셈 기능
	 */
	public int minus(int param1, int param2){
		return param1 - param2;
	}
	
	/**
	 * 
	 * Method : multiply
	 * 최초작성일 : 2018. 7. 6.
	 * 작성자 : pc19
	 * 변경이력 :
	 * @param param1
	 * @param param2
	 * @return
	 * Method 설명 : 계산기 곱셈 기능
	 */
	public int multiply(int param1, int param2){
		return param1 * param2;
	}
	
	/**
	 * 
	 * Method : divide
	 * 최초작성일 : 2018. 7. 6.
	 * 작성자 : pc19
	 * 변경이력 :
	 * @param param1
	 * @param param2
	 * @return
	 * Method 설명 : 계산기 나눗셈 기능
	 */
	public int divide(int param1, int param2){
		if(param2 == 0){
			return 0;
		}
		return param1 / param2;
	}
}
