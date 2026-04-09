package workshop_03;

import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("오른쪽 위가 직각인 삼각형");

		int num;

		do {
			System.out.println("몇 단 삼각형입니까? : ");
			num = scan.nextInt();
		} while (num <= 0);

		for (int i = 1; i <= num; i++) {
			for (int n = 1; n <= i - 1; n++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= num - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
