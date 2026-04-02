package workshop_03;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("세 정수의 최대값 구하기");
		
		System.err.println("a 값: ");
		int num1 = scan.nextInt();
		
		System.err.println("b 값: ");
		int num2 = scan.nextInt();
		
		System.err.println("c 값: ");
		int num3 = scan.nextInt();
		
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("최대값: " + num1);
			}
		}
		
		if (num2 > num3) {
			if (num2 > num1) {
				System.out.println("최대값: " + num2);
			}
		}
		
		if (num3 > num1) {
			if (num3 > num2) {
				System.out.println("최대값: " + num3);
			}
		}
		
		if(num1 < num2 ) {
			if (num1 < num3) {
				System.out.println("최소값: " + num1);	
			}
		}
		
		if(num2 < num3 ) {
			if (num2 < num1) {
				System.out.println("최소값: " + num2);	
			}
		}
		
		if(num3 < num1 ) {
			if (num3 < num2) {
				System.out.println("최소값: " + num3);	
			}
		}
		
		scan.close();
		
	}

}
