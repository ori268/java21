package exam18_예외처리;

public class ExceptionTest2 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");

		try {
			int n = 0;
			int result = 10 / n; // java.lang.ArithmenticException 예외 클래스 이용해서 예외처리 가능
			System.out.println("결과 : " + result);
		} catch (ArithmeticException e) { // 정확한 예외클래스 사용을 권장함.
//		} catch (RuntimeException e) {
//		} catch (Exception e) {
			// 예외처리 코드
			System.out.println("0으로 나누어서 예외발생");
		}

		System.out.println("프로그램 정상종료");

	}

}
