package workshop_02;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {

		// Scanner 이용하여 갑을 입력 받는 코드 구현
		Scanner scan = new Scanner(System.in);

		System.out.println("1.정수 입력하세요.");
		int num1 = scan.nextInt();

		System.out.println("2. 정수 입력하세요.");
		int num2 = scan.nextInt();

		int num3 = num1 + num2;

		System.out.println("정수 " + num1 + "과 정수 " + num2 + "의 합계: " + num3); // (num1+num2) 이것도 가능
//		System.out.printf("정수 %d 과  정수  %d 의 합계: %d" , num1, num2 , (num1+num2));   강사님 답

		scan.close();

	}

}
