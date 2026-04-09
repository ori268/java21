package exam17_유틸리티;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {

		String s = "홍길동 이순신 유관순";

		StringTokenizer st = new StringTokenizer(s);
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());

		System.out.println("========================");

		String s2 = "홍길동/이순신/유관순/강감찬";
		StringTokenizer st2 = new StringTokenizer(s2, "/");
		while (st2.hasMoreTokens()) { // boolean 값 조건에 맞다면 실행 ( 토큰이 몇개인지 모를때 사용하면 됨. )
			System.out.println(st2.nextToken());
		}

		System.out.println("========================");

		// 구분자 여러 개 지정 가능
		String s3 = "영조,홍길동/이순신/유관순:강감찬,정조";
		StringTokenizer st3 = new StringTokenizer(s3, "/,:");
		while (st3.hasMoreTokens()) { // boolean 값 조건에 맞다면 실행
			System.out.println(st3.nextToken());
		}

	}

}
