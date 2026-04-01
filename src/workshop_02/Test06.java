package workshop_02;

public class Test06 {

	public static void main(String[] args) {

	int i = 5;
	// i를 나눴을때 0이면 짝수 아니면 홀수. 아래와 같은 방식이 3항 연산자
	String result = (i % 2 == 0)? "짝수":"홀수"; 
	System.out.println("선언 변수 " + i +"일때 결과 : 숫자" + i + "는 " +  result + "입니다");  
	
	/* 결과 값
	 * 선언 변수 5 일때 결과:
	 * 숫자 5는 홀수입니다
	 */
	
	}

}
