package exam03_데이터형변환;

public class CastTest01_묵시적 {

	public static void main (String[] args) {
		
		// 1. 수치형
		// byte > short > int > long > float > double ( 작은 타입이 큰 타입으로 자동변경 가능 )
		
		byte b = 10;
		short b2 = b;  // byte 타입의 b가 short 타입으로 변경됨
		int b3 = b2;
		long b4 = b3;
		
		float f = b4;
		double f2 = f;
		
		//byte x = f2;  // 역은 불가
	}
	
}
