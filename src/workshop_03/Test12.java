package workshop_03;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("양의 정수값의 자릿수 구하기");
		int num;

		do {
			System.out.println("정수값 : ");
			num = scan.nextInt();
		} while (num <= 0);

		int num2 = 0;
		while (num > 0) {
			num /= 10;
			num2++;
		}
		System.out.printf("그 수는 %d자리 입니다.", num2);

		scan.close();

	}

}
