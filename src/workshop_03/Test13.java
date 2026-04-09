package workshop_03;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("2자리의 정수를 입력하세요.");
		int num;

		do {
			System.out.println("입력 : ");
			num = scan.nextInt();
		} while (num < 10 || num > 99);

		System.out.println("입력값은 " + num);
	}

}
