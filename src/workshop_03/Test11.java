package workshop_03;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("a의 값: ");
		int a = scan.nextInt();

		int b = 0;

		do {
			System.out.println("b의 값: ");
			b = scan.nextInt();
			if (b > a) {
				break;
			}
			System.out.println("a보다 큰 값을 입력하세요!");

		} while (a > b);

		System.out.printf("b - a는 %d입니다.", b - a);

	}

}
