package workshop_02;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {

		// Scanner 이용하여 갑을 입력 받는 코드 구현

		Scanner scan = new Scanner(System.in);

		System.out.println("1.정수 입력하세요.");
		int num1 = scan.nextInt();

		System.out.println("2. 정수 입력하세요.");
		int num2 = scan.nextInt();

		int num3 = (num1 > num2) ? num1 : num2;
		System.out.println("정수 " + num1 + "과 정수 " + num2 + "중에서 최대값:" + num3);

		scan.close();

	}

}
