package workshop_03;

import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		
		int num;
		
		do {
			System.out.print("몇 단 삼각형입니까? : ");
			num = scan.nextInt();
		} while (num <= 0);
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
