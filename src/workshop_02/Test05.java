package workshop_02;

public class Test05 {

	public static void main(String[] args) {

		// ＠ 형변환 문제 ＠
		
		byte a = 10;
		byte b = 20;
//		byte c = 30;   내 답
		byte c = (byte)(a+b);  // 연산을 하면 타입이 자동으로 커짐. (byte, short -> int) 따라서 (byte)를 사용.
		char ch = 'A';
//		ch = 'C';  내 답
		ch = (char)(ch+2);  // 연산이 일어나면 char도 int로 승격됨. 마찬가지로 (char)를 사용.
//		float f = 1.5f;		내 답
		float f = 3/2f;     // 실수로 계산하려고 f를 사용함.
		long l = 27000000000L;
		float f2 = 0.1f;
		double d = 0.1;
//		boolean result = (float)d     ;  모르겠음
		boolean result = (float)d == f2;   // (float)d의 의미는? double -> float으로 변환. f2와 d가 float으로 0.1f 로 값이 같아짐. 따라서 true가 나옴 
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		
		/*
		  	c=30
			ch=C
			f=1.5
			l = 27000000000
			result=true
		 */
		
		
	}

}
