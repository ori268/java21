package exam18_예외처리;

public class ExceptionTest3 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");

		try {

			// ArithmeticException 발생 가능성
			int n = 2;
			int result = 10 / n; // java.lang.ArithmenticException 예외 클래스 이용해서 예외처리 가능
			System.out.println("결과 : " + result);

			// NullPointerException 발생 가능성
			String s = null;
			System.out.println(s.length());

		} catch (ArithmeticException e) { // 정확한 예외클래스 사용을 권장함.
			System.out.println("0으로 나누어서 예외발생 " + e.getMessage()); // /by zero
		} catch (RuntimeException e) {
			System.out.println("객체 생성없이 메서드 호출해서 예외발생 " + e.getMessage()); // Cannot invoke "String.length()" because
																			// "s" is null
		} catch (Exception e) {
			System.out.println("포괄적인 예외처리용-예외발생 " + e.getMessage());
		}

		System.out.println("프로그램 정상종료");

	}

}
