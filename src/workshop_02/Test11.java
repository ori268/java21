package workshop_02;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {

		// Scanner 이용하여 갑을 입력 받는 코드 구현

		Scanner scan = new Scanner(System.in);

		System.out.println("1.정수를 입력하세요.");
		int num1 = scan.nextInt();

		System.out.println("2.정수를 입력하세요.");
		int num2 = scan.nextInt();

		System.out.println("3.정수를 입력하세요.");
		int num3 = scan.nextInt();

//		int num4 = (num1 > num2)? (num1 > num3 )? num1:num3 :num2;   // 내 답
		/*
		 * 내가 적은 답으로 하면 num2와 num3를 비교하는 계산이 없음. 1.정수를 입력하세요. 40 2.정수를 입력하세요. 50 3.정수를
		 * 입력하세요. 60 정수 40와 정수 50, 정수 60 중에서 최대값: 50
		 */

		int num4 = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : (num2 > num3) ? num2 : num3;

		System.out.printf("정수 %d와 정수 %d, 정수 %d 중에서 최대값: %d", num1, num2, num3, num4);

	}

}
