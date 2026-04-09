package exam02_basic;

public class VariableTest02_변수선언2 {

	public static void main(String[] args) {

		// 변수선언과 초기화를 한번에
		String name = "홍길동";
		int age = 20;

		// 동일한 타입이 여러 개인 변수
		/*
		 * int n; int n2 = 10; int n3;
		 */
		int n, n2 = 10, n3; // 권장 안함.ㄴㄴ

		// System.out.println(n); //초기화가 안되면 에러가 남
		System.out.println(n2);
		// System.out.println(n3); //초기화가 안되면 에러가 남

	}

}
