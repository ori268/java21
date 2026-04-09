package workshop_03;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("한 자리 정수값을 입력하시오");
		int num = scan.nextInt();
		int result = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % num == 0) {
				result += i;
				if (i != num)
					System.out.print("+");
				System.out.print(i);
			}
		}
		System.out.print("=" + result);

		scan.close();

	}

}
