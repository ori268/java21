package exam04_연산자;

import java.awt.SystemColor;

public class Operator03_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		int n2 = 3;

		// 실행 결과를 변수에 저장 가능
		boolean result = n == n2;
		System.out.println(result);

		System.out.println(n == n2); // n과 n2 값이 같냐?
		System.out.println(n != n2); // n과 n2 값이 다르냐?
		System.out.println(n > n2); // n이 n2 보다 크냐?
		System.out.println(n >= n2); // n이 n2 보다 같거나 크냐?
		System.out.println(n < n2); // n이 n2 보다 작냐?
		System.out.println(n <= n2); // n이 n2 보다 작거나 같냐?

	}

}
