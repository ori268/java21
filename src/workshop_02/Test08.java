package workshop_02;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {

		// Scanner 이용하여 갑을 입력 받는 코드 구현
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name = scan.next();
		
		System.out.println("나이를 입력하세요");
		int age = scan.nextInt();
		
		System.out.println("이름은" + name + ",");
		System.out.println("나이는" + age + "입니다");
		
		scan.close();
		
		
		
	}

}
