package workshop_03;

import java.util.Scanner;

public class Test18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("오른쪽 아래가 직각인 삼각형");

		int num;

		do {
			System.out.println("몇 단 삼각형입니까? : ");
			num = scan.nextInt();
		} while (num <= 0);

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int n = 1; n <= i; n++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
