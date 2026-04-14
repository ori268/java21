package exam04_연산자;

public class Operator05_증감연산자2 {

	public static void main(String[] args) {

		// 전치 연산자
		int n = 10;
		int result = ++n; // 먼저 증가하고 나중에 할당
		System.out.println(result + "\t" + n);

		// 후치 연산자
		int n2 = 10;
		int result2 = n2++; // 먼저 할당하고 나중에 증가
		System.out.println(result2 + "\t" + n2);

	}

}